import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("poem.txt", Charset.forName("UTF8"));
        BufferedReader br = new BufferedReader(fileReader);
        try {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            br.close();
        }
    }
}
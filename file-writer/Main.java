import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("poem.txt");

            fileWriter.write("Roes are red\nViolets are blue\nBooty booty booty booty\nRocking' everywhere!");
            fileWriter.append("\n\nA poem by Bro Code ");
            fileWriter.close();
        } catch (IOException err) {
            err.printStackTrace();
        }

    }
}
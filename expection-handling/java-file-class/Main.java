import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("The file " + file.getName() + " exists!");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("The file " + file.getName() + " doesn't exist :(");
        }
    }
}
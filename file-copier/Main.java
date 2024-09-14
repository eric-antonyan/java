import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import modules.Colored;

public class Main {
    public static void main(String[] args) throws IOException {
        Colored colored = new Colored();

        Scanner scanner = new Scanner(System.in);

        System.out.println(colored.colorize("MAGENTA",
                "Please enter the file path you want to copy the content from: "));
        String filePath = scanner.next();

        File fromFile = new File(filePath);

        System.out.println(colored.colorize("CYAN", "Please enter the file path you want to past the content to: "));

        String targetFile = scanner.next();

        File toFile = new File(targetFile);

        if (filePath.isBlank() || targetFile.isBlank()) {
            System.out.println(colored.colorize("RED", "Please fill all inputs! Thanks :)"));
        } else if (!fromFile.exists()) {
            System.out.println();
            System.out.println(colored.colorize("RED",
                    fromFile.getPath() + " not found, please enter correct path file! Thanks :)"));
        } else if (!toFile.exists()) {
            System.out.println();
            System.out.println(colored.colorize("RED",
                    toFile.getPath() + " not found, please enter correct path file! Thanks :)"));
        } else if (fromFile.equals(toFile)) {
            System.out.println();
            System.out.println(colored.colorize("RED", "Sorry but file names can't be same"));
        } else {
            // ---------- [ copying content ]

            System.out.println();
            System.out.println(colored.colorize("YELLOW", "copying..."));
            FileReader reader = new FileReader(fromFile.getAbsolutePath());
            BufferedReader br = new BufferedReader(reader);

            StringBuilder content = new StringBuilder();

            try {
                String line;

                while ((line = br.readLine()) != null) {
                    content.append(line + "\n");
                }
            } finally {
                br.close();
                System.out.println(colored.colorize("GREEN",
                        fromFile.getName() + " file content successfully copied!"));
            }

            FileWriter writer = new FileWriter(toFile.getAbsolutePath());

            System.out.println();
            System.out.println(colored.colorize("YELLOW", "pasting..."));

            try {
                writer.append(content.toString());
            } finally {
                writer.close();
                System.out.println(colored.colorize("GREEN",
                        fromFile.getName() + " file content successfully pasted from " + fromFile.getName() + "!"));
            }

            System.out.println("The program ended your task successfully! Thanks for choosing me :)");
        }
    }
}
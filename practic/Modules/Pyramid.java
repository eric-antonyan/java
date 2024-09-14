package Modules;

import java.util.ArrayList;
import java.util.Random;

public class Pyramid {
    public void pyramid(int rows, int columns, String title) {
        Colored colored = new Colored();

        StringBuilder spaces1 = new StringBuilder();
        StringBuilder spaces2 = new StringBuilder();

        String value = !title.isBlank() ? title : "pyramid";

        for (int i = 1; i <= ((((rows * 2) - 1) - value.length()) / 2); i++) {
            spaces1.append("-");
        }

        for (int i = 1; i <= ((((rows * 2) - 1) - value.length()) / 2); i++) {
            spaces2.append("-");
        }

        System.out.println(colored.colorize("GREEN", "\n" + spaces1 + value + spaces2));

        for (int i = columns; i >= 0; i--) {
            Random random = new Random();
            ArrayList<String> colors = colored.getColors();
            StringBuilder result = new StringBuilder();

            for (int s = 1; s <= rows - i; s++) {
                result.append(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                int randomIndex = random.nextInt(colored.getColors().size());
                String randomColor = colors.get(randomIndex);
                result.append(colored.colorize(randomColor, "*"));
            }

            System.out.println(result.toString());
        }
    }
}

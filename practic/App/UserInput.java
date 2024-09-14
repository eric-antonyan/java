package App;

import java.util.Scanner;

public class UserInput {
    public void setup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Please enter your age");

        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", " + age);
    }
}
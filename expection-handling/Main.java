import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            Integer x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            Integer y = scanner.nextInt();

            int result = x / y;

            System.out.println("result: " + result);
        } catch (ArithmeticException err) {
            System.out.println("You can't divide by zero! IDIOT!");
        } catch (InputMismatchException err) {
            System.out.println("PLEASE ENTER NUMBER!!!");
        } catch (Exception err) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
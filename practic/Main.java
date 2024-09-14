import App.Auth;
import App.UserInput;
import App.UserInterface;
import Modules.Colored;

public class Main {
    public static void main(String[] args) {
        Colored colored = new Colored();
        System.out.println(colored.colorize("GREEN", "Your program successfully started!"));

        UserInterface userInterface = new UserInterface();

        userInterface.question();
    }
}

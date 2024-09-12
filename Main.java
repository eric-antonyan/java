import App.Auth;
import Modules.Colored;

public class Main {
    public static void main(String[] args) {
        Colored colored = new Colored();
        System.out.println(colored.colorize("GREEN", "Your program successfully started!"));

        Auth auth = new Auth();

        auth.register("eric_antonyan", "antonyaneric@gmail.com", "password", "password", "Eric", "Antonyan", true);

        auth.account();

        auth.logout();

        auth.account();
    }
}

import services.Auth;

public class App {
    public static void main(String[] args) throws Exception {
        Auth auth = new Auth();

        auth.register("eric_antonyan", "Erik2008", "Eric");

        auth.account();

    }
}

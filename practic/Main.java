import App.Auth;

public class Main {
    public static void main(String[] args) {
        Auth auth = new Auth();

        auth.register("eric_antonyan", "antonyaneric@gmail.com", "Erik2008", "Erik2008", "Eric", "Antonyan", true);
        // auth.register("eric_antonyan", "antonyaneric@gmail.com", "Erik2008", "Erik2008", "Eric", "Antonyan", true);



        auth.getUsersCount();
    }
}

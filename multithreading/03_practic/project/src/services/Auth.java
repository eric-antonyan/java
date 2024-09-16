package services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import interfaces.User;
import modules.Colored;

public class Auth {
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInUser = null;

    Colored colored = new Colored();

    public void register(String username, String password, String firstName) {
        User user = new User(users.size() + 1, username, password, firstName);

        loggedInUser = user;

        if (loggedInUser != null) {
            System.out.println(
                    colored.colorize("GREEN", "Dear " + user.getFirstName() + "! You successfully registered!"));
        }
    }

    public void account() {
        if (loggedInUser != null) {
            System.out.println();
            System.out.println(colored.colorize("YELLOW", "Your account"));
            System.out.println(colored.colorize("GREEN", "id => " + loggedInUser.getId()));
            System.out.println(colored.colorize("GREEN", "username => " + loggedInUser.getUsername()));
            System.out.println(colored.colorize("GREEN", "firstName => " + loggedInUser.getFirstName()));
        } else {
            System.out.println(colored.colorize("RED", "Account not found"));
        }
    }
}

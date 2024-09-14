package App;

import Interfaces.User;
import Modules.Colored;
import Modules.Validation;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Auth {
    ArrayList<User> users = new ArrayList<>();
    User loggedInUser = null;
    int unexpectedlyCount = 0;

    Colored colored = new Colored();
    Random random = new Random();

    private String generateToken() {
        String token = "ey";

        String chars = "abcdefhilmnoprstuvwxyz123456789";

        // Example: (ey(4-5).(5-6).(6-7))

        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(chars.length());
            char randomChar = chars.charAt(randomIndex);
            token += randomChar;
        }

        token += ".";

        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(chars.length());
            char randomChar = chars.charAt(randomIndex);
            token += randomChar;
        }

        token += ".";

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(chars.length());
            char randomChar = chars.charAt(randomIndex);
            token += randomChar;
        }

        return token;
    }

    public void register(String username, String email, String password, String confirmPassword, String firstName,
            String lastName, boolean isActive) {
        int id = users.size() + 1;
        Validation validation = new Validation();
        boolean isValid = validation.register(username, email, password, confirmPassword, firstName, lastName,
                isActive);
        if (!isValid) {
            return;
        }

        boolean exists = users.stream()
                .anyMatch(user -> user.getUsername().equals(username) || user.getEmail().equals(email));

        if (exists) {
            System.out.println(colored.colorize("RED", "\nERROR: Dear " + firstName + ", this username "
                    + colored.colorize("CYAN", "(" + username + ")") + colored.colorize("RED", " is already taken")));
            unexpectedlyCount++;
            return;
        }

        User user = new User(id, username, email, password, firstName, lastName, isActive);
        users.add(user);
        loggedInUser = user;

        System.out.println(colored.colorize("GREEN", "\nDear " + firstName + ", you have successfully registered!"));
        System.out.println(colored.colorize("YELLOW", "Your valid token is " + this.generateToken()));
    }

    private Optional<User> findUser(String usernameOrEmail) {
        return users.stream()
                .filter(user -> user.getUsername().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail))
                .findFirst();
    }

    public boolean login(String usernameOrEmail, String password) {
        System.out.println(colored.colorize("YELLOW", "Your valid token is " + this.generateToken()));
        Optional<User> userOptional = findUser(usernameOrEmail);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                loggedInUser = user;
                System.out.println(colored.colorize("GREEN", "Login successful!"));
                return true;
            } else {
                System.out.println(colored.colorize("RED", "Invalid password."));
                return false;
            }
        } else {
            System.out.println(colored.colorize("RED", "User not found."));
            return false;
        }
    }

    public void getUsersCount() {
        System.out.println(colored.colorize("GREEN", "\nSuccessfully registered users count is " + users.size()));
        System.out.println(colored.colorize("YELLOW", "Unexpectedly registered users count is " + unexpectedlyCount));
    }

    public void account() {
        if (loggedInUser == null) {
            System.out.println(colored.colorize("RED", "No user is logged in."));
            return;
        }

        System.out.println(colored.colorize("YELLOW", "\nMy Account"));
        String status = loggedInUser.isActive() ? colored.colorize("GREEN", "online")
                : colored.colorize("YELLOW", "offline");
        System.out.println(colored.colorize("MAGENTA",
                "Username => " + loggedInUser.getUsername() + "\nFirst name => " + loggedInUser.getFirstName()
                        + "\nLast name => " + loggedInUser.getLastName() + "\nStatus => " + status));
    }

    public void logout() {
        loggedInUser = null;
        System.out.println(colored.colorize("RED", "You have successfully logged out."));
    }
}

package Modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private boolean isEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);

        return matcher.matches();
    }

    public boolean register(String username, String email, String password, String confirmPassword, String firstName,
            String lastName, boolean isActive) {
        boolean isFirstName = !firstName.isEmpty();
        boolean isLastName = !lastName.isEmpty();
        boolean isEmail = this.isEmail(email);
        boolean pwMatches = password == confirmPassword;

        Colored colored = new Colored();

        if (!isFirstName) {
            System.err.println(colored.colorize("RED", "ERROR: First name is empty"));
            return false;
        } else if (!isLastName) {
            System.err.println(colored.colorize("GREEN", "ERROR: Last name is empty"));
            return false;
        } else if (!isEmail) {
            System.err.println(colored.colorize("RED", "ERROR: Email is invalid, please enter valid email"));
            return false;
        } else if (!pwMatches) {
            System.err.println(colored.colorize("RED", "ERROR: Passwords doesn't matches"));
            return false;
        }

        return true;
    }
}

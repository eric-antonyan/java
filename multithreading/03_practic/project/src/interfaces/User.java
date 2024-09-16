package interfaces;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;

    public User(Integer id, String username, String password, String firstName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return "{\n  id: " + this.getId() + "," + "\n  username: " + "'" + this.getUsername() + "',"
                + "\n  password: " + "'" + this.getPassword() + "'," + "\n  firstName: " + "'" + this.getFirstName()
                + "'" + "\n}";
    }
}

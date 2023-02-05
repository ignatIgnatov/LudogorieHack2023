package Subjects;

import java.util.regex.Pattern;

public abstract class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username must be not null or empty!");
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (passwordValidation(password)) {
            this.password = password;

        }
        throw new IllegalArgumentException("Wrong password!");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private static boolean passwordValidation(String password) {
        if (password.matches(".*[0-9]{1,}.*")
                && password.matches(".*[@#$]{1,}.*")
                && password.matches(".*[a-z]{1,}.*")
                && password.matches(".*[A-Z]{1,}.*")
                && password.length() == 8) {
            return true;
        } else {
            return false;
        }
    }
}

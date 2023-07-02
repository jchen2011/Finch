import java.util.ArrayList;

public class Registration {
    private ArrayList<User> accounts;

    public Registration() {
        this.accounts = new ArrayList<>();
    }

    public User register(String username, String password) {
        User user = new User(username, password);
        accounts.add(user);
        return user;
    }

    public boolean checkIfAccountExists(String username) {
        for (User u: accounts) {
            if (username.equals(u.getUsername())) {
                return true;
            }
        }
        return false;
    }
}

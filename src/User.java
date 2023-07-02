import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int balance;

    private ArrayList<Questionnaire> owned_questionnaires;

    public User() {
        this.owned_questionnaires = new ArrayList<>();
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance += 100;
    }

    public String getUsername() {
        return this.username;
    }
}

import java.util.ArrayList;

public abstract class Question {
    private String title;
    private ArrayList<String> correct_answers;

    public Question() {
        this.correct_answers = new ArrayList<>();
    }
    public Question(String title) {
        this.title = title;
    }

    public abstract void showQuestion();
}

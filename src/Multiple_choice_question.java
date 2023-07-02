import java.util.ArrayList;

public class Multiple_choice_question extends Question{
    private ArrayList<String> choices;

    public Multiple_choice_question() {
        this.choices = new ArrayList<>();
    }
    public Multiple_choice_question(String title) {
        super(title);
    }

    @Override
    public void showQuestion() {

    }
}

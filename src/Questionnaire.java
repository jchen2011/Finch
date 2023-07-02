import java.util.ArrayList;

public class Questionnaire {
    private int purchase_amount;
    private int validity_period_in_year;
    private ArrayList<Question> questions;

    public Questionnaire() {
        this.questions = new ArrayList<>();
    }
}

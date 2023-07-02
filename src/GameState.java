import java.util.Scanner;

public class GameState implements State {
    private FinchApplication finchApplication;
    private Scanner scanner;

    public GameState(FinchApplication finchApplication, Scanner scanner) {
        this.finchApplication = finchApplication;
        this.scanner = scanner;
    }
    @Override
    public void start() {
        showQuizMessage();
    }

    public void showQuizMessage() {
        System.out.println("GAME STATE!");
    }
}

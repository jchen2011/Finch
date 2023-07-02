import java.util.Scanner;

public class FinchApplication {
    private Scanner scanner;
    private Registration registration;


    private State introductionState;
    private State gameState;
    private State finchShopState;
    private State state;
    public FinchApplication(Scanner scanner, Registration registration) {
        this.scanner = scanner;
        this.registration = registration;

        this.introductionState = new IntroductionState(this, this.scanner, this.registration);
        this.gameState = new GameState(this, this.scanner);
        this.finchShopState = new FinchShopState(this, this.scanner);

        this.state = this.introductionState;
    }
    public void start() {
        state.start();
    }

    public State getState() {
        return this.state;
    }
    public void setState(State state) {
        this.state = state;
        start();
    }

    public State getIntroductionState() {
        return this.introductionState;
    }

    public State getGameState() {
        return this.gameState;
    }

    public State getFinchShopState() {
        return this.finchShopState;
    }
}

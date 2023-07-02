import java.util.Scanner;

public class IntroductionState implements State {
    private FinchApplication finchApplication;
    private Scanner scanner;
    private Registration registration;
    private User currentUser;

    public IntroductionState(FinchApplication finchApplication, Scanner scanner, Registration registration) {
        this.finchApplication = finchApplication;
        this.scanner = scanner;
        this.registration = registration;
    }
    @Override
    public void start() {
        showRegisterMessage();
        showIntroductionMessage();
    }

    public void showRegisterMessage() {
        while (true) {
            System.out.println("Welcome to Finch!");

            System.out.println("Enter username:");
            String username = scanner.nextLine();

            if (registration.checkIfAccountExists(username)) {
                System.out.println("Username " + username + " already exists!");
                continue;
            }

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            this.currentUser = registration.register(username, password);
            break;
        }
    }

    public void showIntroductionMessage() {
        while (this.finchApplication.getState().equals(this.finchApplication.getIntroductionState())) {
            System.out.println("Welcome " + this.currentUser.getUsername());

            System.out.println("1. Speel quiz");
            System.out.println("2. Ga naar Finch-shop");

            switch (scanner.nextLine()) {
                case "1":
                    this.finchApplication.setState(finchApplication.getGameState());
                    break;
                case "2":
                    this.finchApplication.setState(finchApplication.getFinchShopState());
                    break;
                default:
                    System.out.println("Error: number does not exists");
            }
        }
    }
}

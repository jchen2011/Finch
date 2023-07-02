import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();

        FinchApplication app = new FinchApplication(scanner, registration);

        app.start();

    }
}
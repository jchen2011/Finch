import java.util.Scanner;

public class FinchShopState implements State {
    private FinchApplication finchApplication;
    private Scanner scanner;
    public FinchShopState(FinchApplication finchApplication, Scanner scanner) {
        this.finchApplication = finchApplication;
        this.scanner = scanner;
    }
    @Override
    public void start() {

    }

    public void showFinchShop() {

    }
}

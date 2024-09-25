import Hospital.controller.loginController;
import Hospital.View.LoginView;
import backEnde.BackEnde;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();

        BackEnde backEnde = new BackEnde();

        new loginController(loginView, backEnde);
    }
}
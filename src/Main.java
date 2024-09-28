
import javax.swing.*;

import Hospital.controller.loginController;
import Hospital.View.LoginView;

public class Main extends JFrame {
    public static void main(String[] args) {

        LoginView view = new LoginView();

        loginController controller = new loginController(view);

    }
}

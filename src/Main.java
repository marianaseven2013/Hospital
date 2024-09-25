import Hospital.services.DataDoctores;
import Hospital.model.DoctorGeneral;
import Hospital.View.LoginView;
import Hospital.controller.loginController;
import backEnde.BackEnde;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();

        BackEnde backEnde = new BackEnde();

        new loginController(loginView, backEnde);
    }
}
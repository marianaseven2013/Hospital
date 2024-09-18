package Hospital.controller;

import Hospital.model.DoctorGeneral;
import backEnde.BackEnde;
import Hospital.View.LoginView;
import java.util.HashMap;

public class loginController {

    private LoginView loginView;
    private BackEnde backEnde;

    public loginController(LoginView loginView, BackEnde backEnde) {
        this.loginView = loginView;
        this.backEnde = backEnde;
        this.loginView.addActionListener(e -> processLogin());
    }


    private void processLogin() {
        String usuario = loginView.getCorreo();
        String password = loginView.getContrasena();

        DoctorGeneral doctor = backEnde.validarDatos(usuario, password);

        if (doctor != null) {
            System.out.println("Estan en:");
            System.out.println("Correo: " + doctor.getCorreo());
            System.out.println("Contraseña: " + doctor.getContraseña());
            System.out.println("Especialidad: " + doctor.getEspecialidad());
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos");
        }
    }


}







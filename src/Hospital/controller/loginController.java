package Hospital.controller;

import Hospital.model.DoctorGeneral;
import backEnde.BackEnde;
import Hospital.View.DoctorView;
import Hospital.View.LoginView;
import java.util.HashMap;

public class loginController {

    private LoginView loginView;
    private BackEnde backEnde;

    public loginController(LoginView loginView, BackEnde backEnde) {
        this.loginView = loginView;
        this.backEnde = backEnde;
        this.loginView.addActionListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {
        String usuario = loginView.getCorreo();
        String password = loginView.getContrasena();

        DoctorGeneral doctor = backEnde.validarDatos(usuario, password);

        if (doctor != null) {
            HashMap<String, String> doctorData = new HashMap<>();
            doctorData.put("nombre", doctor.getNombre());
            doctorData.put("especialidad", doctor.getEspecialidad());

            DoctorView doctorView = new DoctorView(doctorData);
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos");
        }
    }
}

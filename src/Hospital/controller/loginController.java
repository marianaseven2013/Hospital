package Hospital.controller;


import backEnde.BackEnde;
import Hospital.View.DoctorView;
import Hospital.View.LoginView;

import java.util.HashMap;

public class loginController {

    private LoginView loginView;

    public loginController(LoginView loginView){
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion(){

        HashMap validar = BackEnde.validarDatos(loginView.getEmail(), loginView.getPassword());

        DoctorView doctorView = new DoctorView(validar);
        loginView.dispose();
    }

}
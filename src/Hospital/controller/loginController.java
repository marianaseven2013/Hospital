package Hospital.controller;

import backEnde.BackEnde;
import Hospital.View.DoctorView;
import Hospital.View.LoginView;

import java.util.HashMap;

public class loginController {

    private LoginView loginView;

    public loginController(LoginView loginView){
        this.loginView = loginView;


        HashMap validar = BackEnde.validarDato(loginView.getCorreo(), loginView.getContrasena());


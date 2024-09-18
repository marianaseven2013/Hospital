import Hospital.controller.loginController;
import Hospital.View.LoginView;
import backEnde.BackEnde;
import Hospital.services.DataDoctores;

public class Main {
    public static void main(String[] args) {

        LoginView loginView = new LoginView();

        DataDoctores dataDoctores = new DataDoctores();

        BackEnde backEnde = new BackEnde(dataDoctores);

        new loginController(loginView, backEnde);

        //Doctor
        //Enfermeras
        //Pacientes
        //Cirujanos
        //Secretarías
        //Fisioterapeutas
        //Farmacéuticos
        //Paramedicos
        //Pediatras
        //Camilleros

        //Sala de espera
        //Morgue
        //Sala Quírofano
    }

}
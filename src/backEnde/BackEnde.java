package backEnde;

import Hospital.services.DataDoctores;
import Hospital.model.DoctorGeneral;

public class BackEnde {

    private DataDoctores dataDoctores;

     public BackEnde(DataDoctores dataDoctores) {
        this.dataDoctores = dataDoctores;
    }


    public DoctorGeneral validarDatos(String usuario, String contraseña) {
        return dataDoctores.login(usuario, contraseña);
    }
}
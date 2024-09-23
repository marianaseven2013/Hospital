package backEnde;

import Hospital.model.DoctorGeneral;
import Hospital.services.DataDoctores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackEnde {

    public static HashMap<String, String> validarDato(String user, String password){

        ArrayList<DoctorGeneral> doctores = DataDoctores.;

        for (DoctorGeneral infoDoc : doctores){

            if (infoDoc.getCorreo().equalsIgnoreCase(user)){
                if (infoDoc.getContraseña().equalsIgnoreCase(password)){

                    HashMap<String, String> datosDoctor = new HashMap<>();
                    datosDoctor.put("nombre doctor", infoDoc.getNombre());
                    datosDoctor.put("especialidad", infoDoc.getEspecialidad());
                    datosDoctor.put("password", infoDoc.getContraseña());
                    datosDoctor.put("email", infoDoc.getCorreo());
                    datosDoctor.put("usuario", infoDoc.getUsuario());

                    System.out.println(datosDoctor.entrySet());
                    return datosDoctor;
                }
            }
        }

        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("Error", "¡¡ERROR!! Verifique usuario o contraseña");
        System.out.println(datosDoctor.get("Error"));

        return datosDoctor;
    }

}
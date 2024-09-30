package backEnde;

import Hospital.model.DoctorGeneral;
import Hospital.services.DataDoctores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackEnde {

    public static HashMap<String, String> validarDatos(String user, String password) {

        ArrayList<DoctorGeneral> doctores = DataDoctores.listaDoctores();

        for (DoctorGeneral infDoc : doctores) {

            if (infDoc.getEmail().equalsIgnoreCase(user) || infDoc.getUsuario().equalsIgnoreCase(user)) {
                if (infDoc.getPasswordD().equalsIgnoreCase(password)) {

                    HashMap<String, String> datosDoctor = new HashMap<>();
                    datosDoctor.put("nombre doctor", infDoc.getNombre());
                    datosDoctor.put("apellido doctor", infDoc.getApellido());
                    datosDoctor.put("especialidad", infDoc.getEspecialidad());
                    datosDoctor.put("password", infDoc.getPasswordD());
                    datosDoctor.put("email", infDoc.getEmail());
                    datosDoctor.put("usuario", infDoc.getUsuario());

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
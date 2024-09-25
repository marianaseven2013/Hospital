package backEnde;

import Hospital.model.DoctorGeneral;
import Hospital.services.DataDoctores;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class BackEnde {
    private ArrayList<DoctorGeneral> data;

    public BackEnde() {
        data = new ArrayList<>();
        data.add(new DoctorGeneral("Dr. Juan Kook", "jjkkk.kook@bhospitaldd.com", "Cardiología", "jkkkook", "bag23"));
        data.add(new DoctorGeneral("Dra. Jinna Kikm", "jinna.kikm@bhospitaldd.com", "Dermatología", "jinnakm", "tan43"));
        data.add(new DoctorGeneral("Dr. Ricardo Morales", "ricardo.morales@bhospitaldd.com", "Pediatría", "ricardMo", "bamm56"));
        data.add(new DoctorGeneral("Dra. Agustina Minn", "agustina.minn@bhospitaldd.com", "Traumatología", "agustM", "portyyea43"));
        data.add(new DoctorGeneral("Dr. Tauren Huyn", "tauren.huyn@bhospitaldd.com", "Neurología", "taurenh", "niagarapo"));
    }

    public DoctorGeneral validarDatos(String usuario, String contraseña) {
        System.out.println("Validando usuario: " + usuario + " con contraseña: " + contraseña);

        for (DoctorGeneral doctor : data) {
            System.out.println("Revisando doctor: " + doctor.getCorreo() + " con contraseña: " + doctor.getContraseña());
            if (doctor.getCorreo().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                System.out.println("Doctor encontrado: " + doctor.getNombre());
                return doctor;
            }
        }
        System.out.println("Doctor no encontrado.");
        return null;
    }
}
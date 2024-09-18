package Hospital.services;

import Hospital.model.DoctorGeneral;
import java.util.ArrayList;

public class DataDoctores {

    private ArrayList<DoctorGeneral> data;

    public DataDoctores() {
        data = new ArrayList<>();

        data.add(new DoctorGeneral("Dr. Juan Kook", "jjkkk.kook@bhospitaldd.com", "Cardiología", "jkkkook", "bag23"));
        data.add(new DoctorGeneral("Dra. Jinna Kikm", "jinna.kikm@bhospitaldd.com", "Dermatología", "jinnakm", "tan43"));
        data.add(new DoctorGeneral("Dr. Ricardo Morales", "ricardo.morales@bhospitaldd.com", "Pediatría", "ricardMo", "bamm56"));
        data.add(new DoctorGeneral("Dra. Agustina Minn", "agustina.minn@bhospitaldd.com", "Traumatología", "agustM", "portyyea43"));
        data.add(new DoctorGeneral("Dr. Tauren huyn", "tauren.huyn@bhospitaldd.com", "Neurología", "taurenh", "niagarapo"));
    }

    public DoctorGeneral login(String correo, String contraseña) {

            for (DoctorGeneral doctor : data) {

                if (doctor.getCorreo().equals(correo) && doctor.getContraseña().equals(contraseña)) {
                    return doctor;
                }
            }
            return null;
        }

    }

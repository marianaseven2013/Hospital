package Hospital.services;

import Hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class DataDoctores {


    public static ArrayList listaDoctores(){

        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Dr. Juan", "Kook", "cardiología", 101, "bag23", "jjkkk.kook@bhospitaldd.com", "jkkkook"));
        doctores.add(new DoctorGeneral("Dr. Tauren", "huyn", "neurología", 104, "niagarapo", "tauren.huyn@bhospitaldd.com", "taurenh" ));
        doctores.add(new DoctorGeneral("Dra. Alessandra", "Angeles", "ginecología", 201, "lisse84", "aless.ang@bhospitaldd.com", "aleen"));
        doctores.add(new DoctorGeneral("Dra. Jinna", "Kikm", "pediatria", 212, "tan43", "jinna.kikm@bhospitaldd.com", "jinnakm"));
        doctores.add(new DoctorGeneral("Dr. Ho", "seok", "endocrinologo", 203, "hohok", "seokh@bhospitaldd.com", "hoseok"));
        doctores.add(new DoctorGeneral("Dr. Ricardo", "Morales", "pediatría", 1012, "bamm56", "ricardo.morales@bhospitaldd.com", "ricardmo"));
        doctores.add(new DoctorGeneral("Dra. Agustina", "Minn", "traumatología", 1912, "portyyea43", "agustina.minn@bhospitaldd.com", "agustm"));
        doctores.add(new DoctorGeneral("Dr. Humberto", "Car", "gastroenterología", 2013, "humber33", "humbertcar@bhospitaldd.com", "humberto"));
        doctores.add(new DoctorGeneral("Dra. Sharon", "Ortiz", "anatomía", 223, "srar25", "sharoz@bhospitaldd.com", "sharon"));
        doctores.add(new DoctorGeneral("Dr. Francis","Leal","hematología",124,"tiin2","francisl@bhospitaldd.com","fran"));

        return doctores;
    }


}
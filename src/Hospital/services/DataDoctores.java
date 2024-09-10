package Hospital.services;

import Hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class DataDoctores {
    //public static String user [] = {"gmluch@scl.edu.gt","JKjeon@scl.edu.gt"};
    //ublic static String pass [] = {"1234Bang","1234tan"};

    public static ArrayList listaDoctores(){
        ArrayList<DoctorGeneral> doctores= new ArrayList<>();
        doctores.add(new DoctorGeneral("Genesis","Luch","Cirujano",
                "aksmkmc@alksm","sdf"));
        doctores.add(new DoctorGeneral("JJAYKAA","Joons","Cirujano",
                "kajdk@sdnc","2398785"));
        doctores.add(new DoctorGeneral("JinJin","JINs","Cirujano",
                "kajsk@sdnc","2ff8785"));
        doctores.add(new DoctorGeneral("Agustina","Jooniii","Cirujano",
                "ksjdsd@sdnc","2sd8785"));


        return doctores;
    }
}


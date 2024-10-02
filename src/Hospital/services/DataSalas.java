package Hospital.services;

import Hospital.model.Sala;

import java.util.ArrayList;

public class DataSalas {

    public static ArrayList listaSalas(){

        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(new Sala("Sala de Cirugía", "En uso"));
        salas.add(new Sala("Sala de Emergencias", "Fuera de servicio"));
        salas.add(new Sala("Sala de Pediatria", "Disponible"));
        salas.add(new Sala("Sala de Ginecología", "En uso"));
        salas.add(new Sala("Sala de Oncología", "Disponible"));
        salas.add(new Sala("Sala de Terapia Intensiva", "Fuera de servicio"));
        salas.add(new Sala("Sala de Maternidad", "En uso"));
        salas.add(new Sala("Sala de Radiología", "Disponible"));
        salas.add(new Sala("Sala de Hospitalización", "En uso"));
        salas.add(new Sala("Sala de Consulta Externa", "Fuera de servicio"));
        salas.add(new Sala("Sala de Neonatología", "Disponible"));
        salas.add(new Sala("Sala de Recuperación", "En uso"));

        return salas;
    }

}
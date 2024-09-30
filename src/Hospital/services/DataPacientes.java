package Hospital.services;

import Hospital.model.Paciente;

import java.util.ArrayList;

public class DataPacientes {

    public static ArrayList listaPacientes(){

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Juan Gonzales", "juangon@gmail.com", "323-1234", "Calle 5, Ciudad", "03/04/1998", "11:00 AM", "Consulta rutina", "2", "Dr. Gonzales"));
        pacientes.add(new Paciente("Ana Lucia", "analu@gmail.com", "323-5678", "Calle 2, Ciudad", "02/02/1985", "9:00 AM", "Control de general", "5", "Dra. Ana"));
        pacientes.add(new Paciente("Ricardo Martines", "ricarm@gmail.com", "323-9876", "Calle 3, Ciudad", "03/03/1980", "01:00 PM", "Consulta nutricional", "3", "Dr. Martines"));
        pacientes.add(new Paciente("Jungkook Jeon", "junko@gmail.com", "323-2468", "Calle 19, Ciudad", "1/9/1997", "02:00 PM", "Consulta cardiológica", "3", "Dr. Jeon"));
        pacientes.add(new Paciente("Silvia Ortiz", "silviao@gmail.com", "323-1357", "Calle 1, Ciudad", "23/05/1985", "03:00 PM", "Consulta dermatológica", "5", "Dra. Ortiz"));
        pacientes.add(new Paciente("Mariela Car", "mariec@gmail.com", "323-2460", "Calle 6, Ciudad", "32/06/1992", "05:00 PM", "Consulta nutricional", "4", "Dra. Mariela"));
        pacientes.add(new Paciente("Jennifer Lastro", "jennil@gmail.com", "353-3698", "Calle 7, Ciudad", "07/07/1993", "08:00 PM", "Chequeo anual", "1", "Dra. Jennifer"));
        pacientes.add(new Paciente("Hilda Contreras", "hildaco@gmail.com", "152-8524", "Calle 8, Ciudad", "08/08/1991", "09:00 AM", "Consulta general", "2", "Dra. Contreras"));
        pacientes.add(new Paciente("Jin Seok", "jins.com", "555-7531", "Calle 9, Ciudad", "4/09/1988", "10:30 AM", "Control de rutina", "7", "Dr. Seok"));
        pacientes.add(new Paciente("Carlos Mendoza", "carlm@gmail.com", "555-1597", "Calle 10, Ciudad", "17/10/1994", "10:20 AM", "Consulta cardiológica", "6", "Dr. Mendoza"));
        pacientes.add(new Paciente("Rosalie Chank", "roslc@gmail.com", "353-2584", "Calle 12, Ciudad", "11/12/1982", "12:00 PM", "Consulta dermatológica", "5", "Dra. Rosalie"));
        pacientes.add(new Paciente("Nayeon Kim", "nayim@gmail.com", "152-6543", "Calle 11, Ciudad", "13/12/1960", "01:30 PM", "Consulta nutricional", "3", "Dra. Kim"));
        pacientes.add(new Paciente("Jimin Park", "jimpa@gmail.com", "555-9870", "Calle 13, Ciudad", "13/01/1985", "03:40 PM", "Chequeo anual", "2", "Dr. Park"));
        pacientes.add(new Paciente("Esteban Silon", "estesl@gmail.com", "353-3210", "Calle 27, Ciudad", "24/12/1997", "03:30 PM", "Consulta general", "1", "Dr. Esteban"));
        pacientes.add(new Paciente("Blanca Mardona", "blanm@gmail.com", "353-4567", "Calle 15, Ciudad", "15/03/1989", "04:15 PM", "Control de rutina", "2", "Dra. Mardona"));
        pacientes.add(new Paciente("Elena Mendez", "elemz@gmail.com", "152-7891", "Calle 16, Ciudad", "16/04/1993", "06:30 PM", "Consulta anual", "4", "Dra. Mendez "));
        pacientes.add(new Paciente("Lucas Urman", "lucasur@gmail.com", "555-1357", "Calle 14, Ciudad", "17/05/1994", "06:00 PM", "Chequeo anual", "8", "Dr. Lucas"));
        pacientes.add(new Paciente("Benjamin Lum", "benjil@gmail.com", "353-9513", "Calle 18, Ciudad", "21/06/1995", "06:30 PM", "Consulta nutricional", "7", "Dr. Lum"));
        pacientes.add(new Paciente("Brandom Lake", "barndl@gmail.com", "152-7531", "Calle 4, Ciudad", "19/07/1984", "09:45 AM", "Chequeo dermatológica", "5", "Dr. Lake"));
        pacientes.add(new Paciente("Jordan Feliz", "jordaf@gmail.com", "555-9630", "Calle 22, Ciudad", "20/08/1991", "09:20 AM", "Consulta general", "3", "Dr. Jordan"));
        return pacientes;

    }
}
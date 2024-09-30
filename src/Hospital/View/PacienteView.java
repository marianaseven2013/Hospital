package Hospital.View;

import Hospital.model.Paciente;
import Hospital.services.DataPacientes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {

    private ArrayList<Paciente> paciente;

    public PacienteView(ArrayList<Paciente> paciente){
        this.paciente = paciente;
    }

    public static JPanel panelPaciente(ArrayList<Paciente> paciente){

        JPanel pPanel = new JPanel();
        pPanel.setLayout(new GridLayout(25, 3));
        pPanel.setBorder(new EmptyBorder(10,30,0,10));
        pPanel.setBackground(Color.WHITE);
        JLabel [] campos = {new JLabel("Listado de pacientes"), new JLabel(), new JLabel(), new JLabel()};
        campos[0].setFont(new Font("Nimbus Sans", Font.BOLD, 22));
        for (JLabel campo : campos) {
            pPanel.add(campo);
        }

        String [] campos2 = {"NOMBRE","FECHA_NACIMIENTO","HORARIO_CITA","VISITA"};
        for (String campo2 : campos2) {
            pPanel.add(new JLabel(campo2));
        }

        ArrayList<Paciente> listaPacientes = DataPacientes.listaPacientes();

        for (Paciente infoPaciente : listaPacientes) {
            pPanel.add(new JLabel(infoPaciente.getNombre()));
            pPanel.add(new JLabel(infoPaciente.getFechaNacimiento()));
            pPanel.add(new JLabel(infoPaciente.getHorarioCita()));
            pPanel.add(new JLabel(infoPaciente.getMotivoVisita()));
        }
        return pPanel;
    }
}
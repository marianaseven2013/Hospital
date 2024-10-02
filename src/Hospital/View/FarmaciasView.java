package Hospital.View;

import Hospital.model.Medicamento;
import Hospital.model.Paciente;
import Hospital.services.DataFarmacia;
import Hospital.services.DataPacientes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FarmaciasView {

    public static JPanel panelPaciente(ArrayList<Medicamento> medicamentos){

        JPanel pPanel = new JPanel();
        pPanel.setLayout(new GridLayout(47, 4));
        pPanel.setBorder(new EmptyBorder(25,30,0,10));
        pPanel.setBackground(Color.WHITE);
        JLabel [] campos = {new JLabel(""), new JLabel(), new JLabel(), new JLabel()};
        campos[0].setFont(new Font("Nimbus Sans", Font.BOLD, 22));
        for (JLabel campo : campos) {
            pPanel.add(campo);
        }

        String [] campos2 = {"NOMBRE","MEDICINA","DOSIS","PRECIO"};
        for (String campo2 : campos2) {
            pPanel.add(new JLabel(campo2));
        }

        ArrayList<Medicamento> listaPacientes = DataFarmacia.listaMedicamento();

        for (Medicamento infoPaciente : listaPacientes) {
            pPanel.add(new JLabel(infoPaciente.getNombre()));
            pPanel.add(new JLabel(infoPaciente.getFormaFarmaceutica()));
            pPanel.add(new JLabel(infoPaciente.getDosis()));
            pPanel.add(new JLabel(infoPaciente.getNumeroLote()));
        }
        return pPanel;
    }


}
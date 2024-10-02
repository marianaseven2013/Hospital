package Hospital.View;


import Hospital.model.Sala;
import Hospital.services.DataSalas;
import javax.swing.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class SalasView {

    public String Nombre;
    public String estado;

    private List<String> estados = Arrays.asList("En uso", "Fuera de servicio", "Disponible");


    public static JPanel panelSala(String Nombre, String estado){

        JPanel basePanel = new JPanel();
        basePanel.setLayout(new GridBagLayout());
        basePanel.setBackground(Color.WHITE);
        GridBagConstraints restricciones = new GridBagConstraints();

        JPanel SPanel = new JPanel();
        SPanel.setLayout(new GridBagLayout());
        SPanel.setBackground(Color.WHITE);
        SPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel tPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tPanel.setBackground(Color.WHITE);

        JLabel titulo = new JLabel("Salas");
        titulo.setFont(new Font("Arial", Font.BOLD, 12));
        titulo.setBorder(BorderFactory.createEmptyBorder(5, 18, 5, 0));

        tPanel.add(titulo);

        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.weightx = 1.0;
        restricciones.weighty = 0.1;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        basePanel.add(tPanel, restricciones);

        ArrayList<Sala> listaSala = DataSalas.listaSalas();

        for (int valorSala = 0; valorSala < 12; valorSala++) {
            if (valorSala < listaSala.size()) {
                JPanel panel = new JPanel();
                panel.setPreferredSize(new Dimension(50, 50));
                panel.setLayout(new GridLayout(1, 1));

                Sala infoSala = listaSala.get(valorSala);
                panel.add(new JLabel(infoSala.getNombre(), SwingConstants.CENTER));

                switch (infoSala.getEstado()) {
                    case "En uso":
                        panel.setBackground(Color.green);
                        break;
                    case "Disponible":
                        panel.setBackground(Color.YELLOW);
                        break;
                    case "Fuera de servicio":
                        panel.setBackground(Color.RED);
                        break;
                }

                restricciones.gridx = valorSala % 4;
                restricciones.gridy = 1 + (valorSala / 4);
                restricciones.weightx = 1;
                restricciones.weighty = 1.0;
                restricciones.insets = new Insets(8, 8, 8, 8);
                restricciones.fill = GridBagConstraints.BOTH;
                SPanel.add(panel, restricciones);
            }
        }

        restricciones.gridx = 0;
        restricciones.gridy = 1;
        basePanel.add(SPanel, restricciones);

        return basePanel;
    }


}
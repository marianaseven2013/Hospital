package Hospital.View;

import backEnde.BackEnde;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;

public class DoctorView extends JFrame {



        this.setSize(pantalla[0], pantalla[1]);
        this.setLayout(new BorderLayout());
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);

        JLabel nombreHospital = new JLabel("Hospital Santa Catalina");
        nombreHospital.setForeground(Color.white);
        nombreHospital.setFont(new Font("Arial", Font.BOLD, 16));
        nombreHospital.setBorder(new EmptyBorder(0, 30, 0, 0)); // establece un margen

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setPreferredSize(new Dimension(270,60));
        userPanel.setBackground(Color.darkGray);



        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;



        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 2;
        restricciones.anchor = GridBagConstraints.WEST;

        userPanel.add(especialidadDoc, restricciones);



        menu.add(crearBoton("Opción 1"), restricciones);
        menu.add(crearBoton("Opción 2"), restricciones);
        menu.add(crearBoton("Opción 3"), restricciones);
        menu.add(crearBoton("Opción 4"), restricciones);
        menu.add(crearBoton("Opción 5"), restricciones);

        panelMenu.add(menu);
        return panelMenu;
    }


    }
}
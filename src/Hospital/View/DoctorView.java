package Hospital.View;

import backEnde.BackEnde;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300,800};

    private HashMap<String, String> datosDoctor;

    public DoctorView(HashMap datosDoctor){
        this.datosDoctor = datosDoctor;

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


        JPanel representacionLogo = new JPanel();
        representacionLogo.setPreferredSize(new Dimension(40,40));
        representacionLogo.setBackground(Color.orange);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        restricciones.insets = new Insets(0,14,0,0);

        userPanel.add(representacionLogo, restricciones);


        JLabel nombreDoc = new JLabel(String.valueOf(datosDoctor.get("Nombre")));
        nombreDoc.setFont(new Font("Arial", Font.BOLD, 15));
        nombreDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;

        userPanel.add(nombreDoc, restricciones);

        JLabel especialidadDoc = new JLabel(String.valueOf(datosDoctor.get("Especialidad")));
        especialidadDoc.setFont(new Font("Arial", Font.PLAIN, 13));
        especialidadDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 2;
        restricciones.anchor = GridBagConstraints.WEST;

        userPanel.add(especialidadDoc, restricciones);

        headerPanel.add(userPanel, BorderLayout.EAST);
        headerPanel.add(nombreHospital, BorderLayout.WEST);
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(componenteMenuLateral(), BorderLayout.WEST);
        this.setVisible(true);

    }

    private JPanel componenteMenuLateral(){

        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelMenu.setBackground(Color.darkGray);

        JPanel menu = new JPanel(new GridBagLayout());

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.gridx = 0;


        menu.add(crearBoton("Opción 1"), restricciones);
        menu.add(crearBoton("Opción 2"), restricciones);
        menu.add(crearBoton("Opción 3"), restricciones);
        menu.add(crearBoton("Opción 4"), restricciones);
        menu.add(crearBoton("Opción 5"), restricciones);

        panelMenu.add(menu);
        return panelMenu;
    }

    private JButton crearBoton(String texto){
        JButton boton = new JButton(texto);

        boton.addActionListener(e -> {
            System.out.println(texto);
        });

        return boton;
    }
}
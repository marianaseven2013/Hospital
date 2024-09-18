package Hospital.View;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView() {
        setTitle("Perfil del Doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel gris
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());


        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        //Cuadro para el cuadro anaranjado y el nombre
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBackground(Color.DARK_GRAY);


        JPanel yellowBox = new JPanel();
        yellowBox.setPreferredSize(new Dimension(50, 50));
        yellowBox.setBackground(Color.orange);


        JPanel namePanel = new JPanel();
        namePanel.setLayout(new GridLayout(2, 1));
        namePanel.setBackground(Color.DARK_GRAY);

        JLabel nameLabel = new JLabel("Génesis Luch");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel specialtyLabel = new JLabel("Doctora General");
        specialtyLabel.setForeground(Color.WHITE);
        specialtyLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        namePanel.add(nameLabel);
        namePanel.add(specialtyLabel);

        rightPanel.add(yellowBox, BorderLayout.WEST);
        rightPanel.add(namePanel, BorderLayout.CENTER);


        headerPanel.add(rightPanel, BorderLayout.EAST);

        // Añadir el header al JFrame
        add(headerPanel, BorderLayout.NORTH);


        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(Color.WHITE);
        add(emptyPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}

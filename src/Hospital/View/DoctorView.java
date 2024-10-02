package Hospital.View;

import Hospital.model.Medicamento;
import Hospital.services.DataFarmacia;
import Hospital.services.DataPacientes;
import Hospital.model.Paciente;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};
    private ArrayList<Paciente> pacienteList = DataPacientes.listaPacientes();
    private ArrayList<Medicamento>  llm = DataFarmacia.listaMedicamento();
    private HashMap<String, String> datosDoctor;

    // Panel que contendrá las diferentes vistas (pacientes, salas, farmacia)
    private JPanel panelCentral;

    public DoctorView(HashMap datosDoctor) {
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
        nombreHospital.setFont(new Font("Liberation Sans", Font.BOLD, 16));
        nombreHospital.setBorder(new EmptyBorder(0, 30, 0, 0)); // establece un margen

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setPreferredSize(new Dimension(270, 60));
        userPanel.setBackground(Color.darkGray);

        JPanel representacionLogo = new JPanel();
        representacionLogo.setPreferredSize(new Dimension(40, 40));
        representacionLogo.setBackground(Color.orange);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        restricciones.insets = new Insets(0, 14, 0, 0);

        userPanel.add(representacionLogo, restricciones);

        JLabel nombreDoc = new JLabel(String.valueOf(datosDoctor.get("nombre doctor")));
        nombreDoc.setFont(new Font("Liberation Sans", Font.BOLD, 15));
        nombreDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;

        userPanel.add(nombreDoc, restricciones);

        JLabel especialidadDoc = new JLabel(String.valueOf(datosDoctor.get("especialidad")));
        especialidadDoc.setFont(new Font("Liberation Sans", Font.PLAIN, 13));
        especialidadDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 2;
        restricciones.anchor = GridBagConstraints.WEST;

        userPanel.add(especialidadDoc, restricciones);

        headerPanel.add(userPanel, BorderLayout.EAST);
        headerPanel.add(nombreHospital, BorderLayout.WEST);
        this.add(headerPanel, BorderLayout.NORTH);

        // Aquí creamos el panel central con CardLayout
        panelCentral = new JPanel(new CardLayout());
        panelCentral.add(PacienteView.panelPaciente(pacienteList), "Pacientes");
        this.add(panelCentral, BorderLayout.CENTER);

        this.add(componenteMenuLateral(), BorderLayout.WEST);

        this.setVisible(true);
    }

    private JPanel componenteMenuLateral() {
        JPanel panelmenu = new JPanel();
        panelmenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelmenu.setBackground(Color.darkGray);

        JPanel menu = new JPanel(new GridBagLayout());

        GridBagConstraints gridRe = new GridBagConstraints();
        gridRe.fill = GridBagConstraints.HORIZONTAL;
        gridRe.gridx = 0;

        menu.add(crearUnBoton("Consultas Del Día"), gridRe);
        menu.add(crearUnBoton("Salas"), gridRe);
        menu.add(crearUnBoton("Farmacia"), gridRe);
        menu.add(crearUnBoton("Pacientes registrados"), gridRe);
        menu.add(crearUnBoton("Citar en otra área"), gridRe);

        panelmenu.add(menu);
        return panelmenu;
    }

    private JButton crearUnBoton(String texto) {
        JButton boton = new JButton(texto);

        boton.addActionListener(e -> {
            CardLayout cl = (CardLayout) (panelCentral.getLayout());

            switch (texto) {
                case "Salas":
                    panelCentral.add(SalasView.panelSala("Nombre", "Estado"), "Salas");
                    cl.show(panelCentral, "Salas");
                    break;
                case "Farmacia":
                    panelCentral.add(FarmaciasView.panelPaciente(llm), "Farmacia");
                    cl.show(panelCentral, "Farmacia");
                    break;
                case "Pacientes registrados":
                    cl.show(panelCentral, "Pacientes");
                    break;
                default:
                    //Por si llego a necesitar otro botones
                    break;
            }

            getContentPane().revalidate();
            getContentPane().repaint();
        });

        return boton;
    }
}
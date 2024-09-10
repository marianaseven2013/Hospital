package Hospital.model;

import javax.swing.*;
import java.awt.*;
public class DoctorGeneral{
    private String Nombre;
    private String Apellido;
    private String Especialidad;
    private String CorreoElectronico;
    private String Contrasenna;

    public DoctorGeneral(String Nombre, String Apellido, String Especialidad, String CorreoElectronico, String Contraseña){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
        this.CorreoElectronico = CorreoElectronico;
        this.Contrasenna = Contraseña;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public String getContrasenna() {
        return Contrasenna;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public void setContrasenna(String contrasenna) {
        Contrasenna = contrasenna;
    }

    public static void Doctor() {

        JFrame frame = new JFrame("Hospital Interface");
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(null);

        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setLayout(new GridLayout(2, 1, 0, 20));
        topLeftPanel.setBounds(35, 100, 300, 100);
        JButton btnPacientesDelicados = new JButton("Pacientes delicados");
        btnPacientesDelicados.setBackground(Color.black);
        btnPacientesDelicados.setForeground(Color.WHITE);

        JButton btnSalasPorAtender = new JButton("Salas por atender después de las 2pm");
        topLeftPanel.add(btnPacientesDelicados);
        topLeftPanel.add(btnSalasPorAtender);
        btnSalasPorAtender.setBackground(Color.black);
        btnSalasPorAtender.setForeground(Color.WHITE);

        frame.add(topLeftPanel);

        JPanel panelDepa = new JPanel();
        panelDepa.setLayout(new GridLayout());

        JPanel panelGrande = new JPanel();
        panelGrande.setLayout(null);
        panelGrande.setBounds(30, 300, 450, 250);
        panelGrande.setBorder(BorderFactory.createTitledBorder(""));

        JLabel lblPacientesCon = new JLabel("Pacientes con:");
        lblPacientesCon.setBounds(250, 45, 350, 20);
        panelGrande.add(lblPacientesCon);

        JPanel panelSalas = new JPanel();
        panelSalas.setLayout(new GridLayout(5, 2));
        panelSalas.setBounds(110, 70, 270, 150);
        panelSalas.setBackground(Color.lightGray);
        panelSalas.setBorder(BorderFactory.createTitledBorder(""));

        String[] salas = {
                "Sala 2", "Enfermedad Pulmonar",
                "Sala 3", "Dolor muscular",
                "Sala 9", "Cardiopatía",
                "Sala 3", "Dolor de piernas",
                "Sala 10", "Diabetes"
        };

        for (String sala : salas) {
            panelSalas.add(new JLabel(sala));
        }

        panelGrande.add(panelSalas);

        JPanel panelCheckboxes = new JPanel();
        panelCheckboxes.setLayout(new GridLayout(5, 1));
        panelCheckboxes.setBounds(425, 70, 87, 155);

        for (int i = 0; i < 5; i++) {
            panelCheckboxes.add(new JCheckBox());
        }

        panelGrande.add(panelCheckboxes);

        frame.add(panelGrande);

        JPanel panelBuscar = new JPanel();
        panelBuscar.setLayout(null);
        panelBuscar.setBounds(430, 10, 340, 150);
        panelBuscar.setBorder(BorderFactory.createTitledBorder(""));

        JLabel lblBuscarPacientes = new JLabel("Buscar pacientes");
        lblBuscarPacientes.setBounds(47, 33, 100, 20);
        panelBuscar.add(lblBuscarPacientes);

        JTextField txtBuscar = new JTextField();
        txtBuscar.setBounds(150, 30, 150, 30);
        panelBuscar.add(txtBuscar);

        JButton btnHistorialPaciente = new JButton("Historial del paciente");
        btnHistorialPaciente.setBackground(Color.black);
        btnHistorialPaciente.setForeground(Color.WHITE);
        btnHistorialPaciente.setBounds(10, 80, 170, 40);
        panelBuscar.add(btnHistorialPaciente);

        JButton btnHistorialMedico = new JButton("Historial Médico");
        btnHistorialMedico.setBackground(Color.black);
        btnHistorialMedico.setForeground(Color.WHITE);
        btnHistorialMedico.setBounds(190, 80, 140, 40);
        panelBuscar.add(btnHistorialMedico);

        frame.add(panelBuscar);

        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(null);
        panelImagen.setBounds(780, 10, 200, 100);
        panelImagen.setBackground(Color.white);
        panelImagen.setBorder(BorderFactory.createTitledBorder("Imagen"));

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(15, 50, 100, 20);
        panelImagen.add(lblNombre);

        frame.add(panelImagen);

        JPanel panelJunta = new JPanel();
        panelJunta.setLayout(null);
        panelJunta.setBounds(630, 200, 320, 50);
        panelJunta.setBackground(Color.orange);

        JLabel lblJunta = new JLabel("Junta Programada para hoy 1:45pm/ Oficina 16");
        lblJunta.setForeground(Color.WHITE);
        lblJunta.setBounds(20, 13, 270, 20);
        panelJunta.add(lblJunta);

        frame.add(panelJunta);

        JButton btnVerJuntasProximas = new JButton("Ver juntas próximas");
        btnVerJuntasProximas.setBounds(700, 255, 160, 30);
        btnVerJuntasProximas.setBackground(Color.black);
        btnVerJuntasProximas.setForeground(Color.white);
        frame.add(btnVerJuntasProximas);

        JButton btnVerHorarioSemana = new JButton("Ver Horario de semana");
        btnVerHorarioSemana.setBounds(490, 430, 200, 45);
        btnVerHorarioSemana.setBackground(Color.black);
        btnVerHorarioSemana.setForeground(Color.WHITE);
        frame.add(btnVerHorarioSemana);

        JButton btnExpedienteTotal = new JButton("Expediente total");
        btnExpedienteTotal.setBounds(490, 480, 200, 45);
        btnExpedienteTotal.setBackground(Color.black);
        btnExpedienteTotal.setForeground(Color.WHITE);
        frame.add(btnExpedienteTotal);

        frame.setVisible(true);
    }
}


package Hospital.model;

import javax.swing.*;
import java.awt.*;

public class DoctorGeneral extends JFrame {

    private String nombre;
    private String apellido;
    private String especialidad;
    private int numeroLcencia;
    private String password;
    private String email;
    private String usuario;


    public DoctorGeneral( String nombre, String apellido,String especialidad, int numeroLcencia, String password, String email, String usuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.numeroLcencia = numeroLcencia;
        this.email = email;
        this.password = password;
        this.usuario = usuario;
    }

    public static void ventaDoctor() {

        JPanel panelHeader, panellist;
        JLabel pHeader, DocHeader, DatosDoc;
        JLabel datNombrel, tNombre, datNom, datNombre , tDatNombre, ttDatNombre, tiitDatNombre, titDatNombre, UserDoc;
        JLabel datgen, datoCodigoD, datoEdad, datoEspecialidad, datoNumeroo, datoEmail, datogen, datooDoc, datooEdad, datEspIng, datoNum, datooEmail, datoDoc;
        JLabel titPacientesVD, tEnfermeras;

        JButton btnpacientes,
                btnenfermeras;

        JFrame ventaDoc = new JFrame();
        ventaDoc.setTitle("Doctores");
        ventaDoc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventaDoc.setSize(1800,1000);
        ventaDoc.setLocationRelativeTo(null);

        panelHeader = new JPanel();
        panelHeader.setBackground(Color.lightGray);
        panelHeader.setBounds(0,0,1800,185);
        panelHeader.setLayout(null);

        pHeader = new JLabel("Hospital");
        pHeader.setBounds(620,45, 600,42);
        pHeader.setFont(new Font("Goudy Stout", Font.BOLD, 37));
        pHeader.setHorizontalAlignment(SwingConstants.CENTER);
        pHeader.setOpaque(true);


        DocHeader = new JLabel("Doctores");
        DocHeader.setBounds(620,110, 600,42);
        DocHeader.setFont(new Font("Goudy Stout", Font.BOLD, 25));
        DocHeader.setHorizontalAlignment(SwingConstants.CENTER);
        DocHeader.setOpaque(true);

        panellist = new JPanel();
        panellist.setBounds(0,0,1800,800);
        panellist.setLayout(null);


        DatosDoc = new JLabel("Datos del Doctor:");
        DatosDoc.setBounds(100 ,225, 300, 32);
        DatosDoc.setFont(new Font("Arial", Font.PLAIN, 30));
        DatosDoc.setHorizontalAlignment(SwingConstants.LEFT);
        DatosDoc.setOpaque(true);

        datNombrel = new JLabel("hola");
        datNombrel.setBounds(115,290,220,32);
        datNombrel.setFont(new Font("Arial", Font.BOLD, 23));
        datNombrel.setHorizontalAlignment(SwingConstants.LEFT);
        datNombrel.setBackground(Color.white);
        datNombrel.setOpaque(true);

        tNombre = new JLabel("hola");
        tNombre.setBounds(360,290,220,32);
        tNombre.setFont(new Font("Arial", Font.BOLD, 23));
        tNombre.setHorizontalAlignment(SwingConstants.LEFT);
        tNombre.setBackground(Color.white);
        tNombre.setOpaque(true);

        datNom = new JLabel("hola");
        datNom.setBounds(605,290,220,32);
        datNom.setFont(new Font("Arial", Font.BOLD, 23));
        datNom.setHorizontalAlignment(SwingConstants.LEFT);
        datNom.setBackground(Color.white);
        datNom.setOpaque(true);

        datNombre = new JLabel("hola");
        datNombre.setBounds(850,290,220,32);
        datNombre.setFont(new Font("Arial", Font.BOLD, 23));
        datNombre.setHorizontalAlignment(SwingConstants.LEFT);
        datNombre.setBackground(Color.white);
        datNombre.setOpaque(true);

        tDatNombre = new JLabel("Nombre");
        tDatNombre.setBounds(115,335,220,32);
        tDatNombre.setFont(new Font("Arial", Font.BOLD, 20));
        tDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        tDatNombre.setBackground(Color.LIGHT_GRAY);
        tDatNombre.setOpaque(true);

        ttDatNombre = new JLabel("Segundo Nombre");
        ttDatNombre.setBounds(360,335,220,32);
        ttDatNombre.setFont(new Font("Arial", Font.BOLD, 20));
        ttDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        ttDatNombre.setBackground(Color.LIGHT_GRAY);
        ttDatNombre.setOpaque(true);

        tiitDatNombre = new JLabel("Apellido");
        tiitDatNombre.setBounds(605,335,220,32);
        tiitDatNombre.setFont(new Font("Arial", Font.BOLD, 20));
        tiitDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        tiitDatNombre.setBackground(Color.LIGHT_GRAY);
        tiitDatNombre.setOpaque(true);

        titDatNombre = new JLabel("Segundo Apellido");
        titDatNombre.setBounds(850,335,220,32);
        titDatNombre.setFont(new Font("Rockwell", Font.BOLD, 20));
        titDatNombre.setHorizontalAlignment(SwingConstants.LEFT);
        titDatNombre.setBackground(Color.LIGHT_GRAY);
        titDatNombre.setOpaque(true);


        datgen = new JLabel("Sexo:");
        datgen.setBounds(115,406,215,32);
        datgen.setFont(new Font("Rockwell", Font.BOLD, 23));
        datgen.setHorizontalAlignment(SwingConstants.LEFT);
        datgen.setBackground(Color.LIGHT_GRAY);
        datgen.setOpaque(true);

        datoCodigoD = new JLabel("Codigo Doctor:");
        datoCodigoD.setBounds(115,445,215,32);
        datoCodigoD.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoCodigoD.setHorizontalAlignment(SwingConstants.LEFT);
        datoCodigoD.setBackground(Color.LIGHT_GRAY);
        datoCodigoD.setOpaque(true);

        datoEdad = new JLabel("Edad:");
        datoEdad.setBounds(115,484,215,32);
        datoEdad.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoEdad.setHorizontalAlignment(SwingConstants.LEFT);
        datoEdad.setBackground(Color.LIGHT_GRAY);
        datoEdad.setOpaque(true);

        datoEspecialidad = new JLabel("Especialidad:");
        datoEspecialidad.setBounds(115,523,215,32);
        datoEspecialidad.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
        datoEspecialidad.setBackground(Color.LIGHT_GRAY);
        datoEspecialidad.setOpaque(true);

        datoNumeroo = new JLabel("Numero Colegiado:");
        datoNumeroo.setBounds(115,562,230,32);
        datoNumeroo.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoNumeroo.setHorizontalAlignment(SwingConstants.LEFT);
        datoNumeroo.setBackground(Color.LIGHT_GRAY);
        datoNumeroo.setOpaque(true);

        datoEmail = new JLabel("Email:");
        datoEmail.setBounds(645,484,110,32);
        datoEmail.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoEmail.setHorizontalAlignment(SwingConstants.LEFT);
        datoEmail.setBackground(Color.LIGHT_GRAY);
        datoEmail.setOpaque(true);

        UserDoc = new JLabel("User:");
        UserDoc.setBounds(1470,200,80,32);
        UserDoc.setFont(new Font("Rockwell", Font.BOLD, 23));
        UserDoc.setHorizontalAlignment(SwingConstants.LEFT);
        UserDoc.setBackground(Color.LIGHT_GRAY);
        UserDoc.setOpaque(true);

        datoNumeroo = new JLabel("Numero Colegiado:");
        datoNumeroo.setBounds(115,562,230,32);
        datoNumeroo.setFont(new Font("Rockwell", Font.BOLD, 23));
        datoNumeroo.setHorizontalAlignment(SwingConstants.LEFT);
        datoNumeroo.setBackground(Color.LIGHT_GRAY);
        datoNumeroo.setOpaque(true);


        datogen = new JLabel("texto");
        datogen.setBounds(360,406,215,32);
        datogen.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datogen.setHorizontalAlignment(SwingConstants.LEFT);
        datogen.setBackground(Color.white);
        datogen.setOpaque(true);

        datooDoc = new JLabel("texto");
        datooDoc.setBounds(360,445,215,32);
        datooDoc.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datooDoc.setHorizontalAlignment(SwingConstants.LEFT);
        datooDoc.setBackground(Color.white);
        datooDoc.setOpaque(true);

        datooEdad = new JLabel("texto");
        datooEdad.setBounds(360,484,215,32);
        datooEdad.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datooEdad.setHorizontalAlignment(SwingConstants.LEFT);
        datooEdad.setBackground(Color.white);
        datooEdad.setOpaque(true);

        datEspIng = new JLabel("texto");
        datEspIng.setBounds(360,523,215,32);
        datEspIng.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datEspIng.setHorizontalAlignment(SwingConstants.LEFT);
        datEspIng.setBackground(Color.white);
        datEspIng.setOpaque(true);

        datoNum = new JLabel("texto");
        datoNum.setBounds(360,562,215,32);
        datoNum.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datoNum.setHorizontalAlignment(SwingConstants.LEFT);
        datoNum.setBackground(Color.white);
        datoNum.setOpaque(true);

        datooEmail = new JLabel("texto");
        datooEmail.setBounds(770,484,215,32);
        datooEmail.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datooEmail.setHorizontalAlignment(SwingConstants.LEFT);
        datooEmail.setOpaque(true);

        datoDoc = new JLabel("texto");
        datoDoc.setBounds(1470,250,235,40);
        datoDoc.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        datoDoc.setHorizontalAlignment(SwingConstants.LEFT);
        datoDoc.setBackground(Color.white);
        datoDoc.setOpaque(true);


        titPacientesVD = new JLabel("Pacientes:");
        titPacientesVD.setBounds(219 ,650, 300, 32);
        titPacientesVD.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        titPacientesVD.setHorizontalAlignment(SwingConstants.LEFT);
        titPacientesVD.setOpaque(true);

        tEnfermeras = new JLabel("Enfermeras Asignadas:");
        tEnfermeras.setBounds(960 ,650, 450, 32);
        tEnfermeras.setFont(new Font("Bodoni MT Black", Font.PLAIN, 30));
        tEnfermeras.setHorizontalAlignment(SwingConstants.LEFT);
        tEnfermeras.setOpaque(true);


        btnpacientes = new JButton("Detalle");
        btnpacientes.setBounds(385,720, 200,80);
        btnpacientes.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        btnenfermeras = new JButton("Detalle");
        btnenfermeras.setBounds(1180,720, 200,80);
        btnenfermeras.setFont(new Font("Bahnschrift", Font.BOLD, 20));

        btnpacientes.addActionListener(e -> {
        });

        panellist.add(btnenfermeras);
        panellist.add(btnpacientes);
        panellist.add(tEnfermeras);
        panellist.add(titPacientesVD);

        panellist.add(datoDoc);
        panellist.add(datooEmail);
        panellist.add(datoNum);
        panellist.add(datEspIng);
        panellist.add(datooEdad);
        panellist.add(datooDoc);
        panellist.add(datogen);

        panellist.add(UserDoc);
        panellist.add(datoEmail);
        panellist.add(datoNumeroo);
        panellist.add(datoEspecialidad);
        panellist.add(datoEdad);
        panellist.add(datoCodigoD);
        panellist.add(datgen);

        panellist.add(titDatNombre);
        panellist.add(tiitDatNombre);
        panellist.add(tiitDatNombre);
        panellist.add(ttDatNombre);
        panellist.add(tDatNombre);

        panellist.add(datNombre);
        panellist.add(datNom);
        panellist.add(tNombre);
        panellist.add(datNombrel);
        panellist.add(DatosDoc);

        panelHeader.add(DocHeader);
        panelHeader.add(pHeader);

        ventaDoc.add(panelHeader);
        ventaDoc.add(panellist);
        ventaDoc.setVisible(true);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumeroLcencia() {
        return numeroLcencia;
    }

    public String getPasswordD() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsuario() {
        return usuario;
    }


    public void setNombre(String nombreD) {
        this.nombre = nombreD;
    }

    public void setEspecialidad(String especialidadD) {
        this.especialidad = especialidadD;
    }

    public void setNumeroLcencia(int numeroLcencia) {
        this.numeroLcencia = numeroLcencia;
    }

    public void setPassword(String passwordD) {
        this.password = passwordD;
    }

    public void setEmail(String emailD) {
        this.email = emailD;
    }
}

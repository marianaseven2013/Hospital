package Hospital.View;//Mis clases
import Hospital.services.DataDoctores;
import Hospital.model.DoctorGeneral;

//Librerías
import javax.swing.*; //Crear interfaces grafias Metodos: JFrame, button etc
import java.awt.*; //Eventos
import java.util.ArrayList; //Crear listas de tipo Array

public class LoginView extends JFrame {
    public LoginView() {

        //COFIGURACIÓN DE LA VENTANA
        this.setSize(1600,1800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //PANEL PRINCIPAL
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.green);

        //PRIMER PANEL del banner
        JPanel logoPanel = new JPanel(new GridBagLayout());
        logoPanel.setBackground(Color.black);

        ImageIcon urlImg = new ImageIcon(getClass().getResource("resources/logo.png"));
        JLabel img = new JLabel();  //Para agregar imagen
        img.setIcon(urlImg); //Agregar la ruta
        logoPanel.add(img);

        logoPanel.add(img);

        JPanel formpanel = new JPanel(new GridBagLayout());
        formpanel.setBackground(Color.yellow);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JLabel email = new JLabel("Email");
        JTextField emailField = new JTextField();
        emailField.setPreferredSize(new Dimension(300, 40));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        formpanel.add(email, restricciones);

        JTextField contrasenna = new JTextField();
        contrasenna.setPreferredSize(new Dimension(300, 40));
        JPasswordField passwordField = new JPasswordField();
        restricciones.gridx = 2; //Columna2
        restricciones.gridy = 1; //Fila1
        formpanel.add(contrasenna, restricciones);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(490, 480, 200, 45);
        formpanel.add(btnIniciar);

        btnIniciar.addActionListener(e -> {
            ArrayList<DoctorGeneral> dataDoctores = DataDoctores.listaDoctores();

            for (DoctorGeneral cadaDoctor: dataDoctores){
                if ( cadaDoctor.getCorreoElectronico().equalsIgnoreCase(emailField.getText())) {
                    if (cadaDoctor.getContrasenna().equalsIgnoreCase(passwordField.getText())) {
                        //DoctorGeneral userDoctor = new DoctorGeneral();
                        DoctorGeneral.Doctor();
                    }

                } else {
                    JLabel msError = new JLabel("Error de Correo");
                    msError.setForeground(Color.RED);
                    formpanel.add(msError);
                }
            }
            //(System.out.println("bdDoctores.user[0]");
            //System.out.println("bdDoctores.pass[0]");



            formpanel.revalidate();
            formpanel.repaint();

        });

        mainPanel.add(logoPanel);
        mainPanel.add(formpanel);

        this.add(mainPanel);
        this.setVisible(true);


    }
}
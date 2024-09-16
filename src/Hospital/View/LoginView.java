package Hospital.View;//Mis clases
import Hospital.services.DataDoctores;
import Hospital.model.DoctorGeneral;
import org.w3c.dom.events.EventListener;

//Librerías
import java.awt.event.ActionListener;
import javax.swing.*; //Crear interfaces grafias Metodos: JFrame, button etc
import javax.swing.border.MatteBorder;
import java.awt.*; //Eventos
import java.util.ArrayList; //Crear listas de tipo Array

public class LoginView extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton iniciar;

    public LoginView() {

        this.setSize(650, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Login");

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.white);

        JLabel email = new JLabel("Correo: ");
        email.setForeground(Color.gray);
        email.setFont(new Font("Helvetica", Font.BOLD, 20));
        email.setBounds(80, 170, 300, 200);
        email.setVisible(true);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 18));
        emailField.setBorder(new MatteBorder(0, 0, 1, 0, Color.gray));
        emailField.setBounds(245, 240, 300, 40);
        emailField.setVisible(true);

        JLabel contr = new JLabel("Contraseña: ");
        contr.setForeground(Color.gray);
        contr.setFont(new Font("Helvetica", Font.BOLD, 20));
        contr.setBounds(80, 270, 600, 200);
        contr.setVisible(true);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordField.setBorder(new MatteBorder(0, 0, 1, 0, Color.gray));
        passwordField.setBounds(245, 343, 300, 40);
        passwordField.setVisible(true);

        iniciar = new JButton("Iniciar Sesión");
        iniciar.setBounds(245, 410, 300, 38);
        iniciar.setForeground(Color.white);
        iniciar.setFont(new Font("Arial", Font.PLAIN, 18));
        iniciar.setBackground(Color.lightGray);
        this.add(iniciar);

        this.add(emailField);
        this.add(passwordField);
        this.add(contr);
        this.add(email);
        this.add(mainPanel);
        this.setVisible(true);
    }

    public String getCorreo() {
        return emailField.getText();
    }

    public String getContrasena() {
        return passwordField.getText();
    }

    public void addActionListener(ActionListener listener) {
        iniciar.addActionListener(listener);
    }
}

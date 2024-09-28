package Hospital.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.Border;



public class LoginView extends JFrame {

    private JTextField emailb;
    private JPasswordField passwordb;
    private JButton botLogin;

    public LoginView(){

        this.setSize(640, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Login");

        JPanel panelMain = new JPanel(new GridBagLayout());
        panelMain.setBackground(Color.WHITE);


        JLabel emailText = new JLabel("Correo:");
        emailText.setFont(new Font("Arial", Font.CENTER_BASELINE, 21));
        emailText.setForeground(Color.gray);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets = new Insets(0,10,30,0);
        panelMain.add(emailText, restricciones);

        emailb = new JTextField();
        emailb.setPreferredSize(new Dimension(300, 30));
        emailb.setFont(null);
        emailb.setFont(new Font("Arial",Font.PLAIN,20));


        Border bordeEmailInp = BorderFactory.createMatteBorder(0,0,2,0, Color.lightGray);
        emailb.setBorder(bordeEmailInp);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(0,50,30,0);
        panelMain.add(emailb, restricciones);

        JLabel passwordText = new JLabel("Contraseña:");
        passwordText.setFont(new Font("Arial", Font.CENTER_BASELINE, 21));
        passwordText.setForeground(Color.gray);

        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets = new Insets(0,10,30,50);
        panelMain.add(passwordText, restricciones);

        passwordb = new JPasswordField();
        passwordb.setPreferredSize(new Dimension(300, 30));
        passwordb.setFont(null);
        passwordb.setFont(new Font("Arial",Font.PLAIN,20));

        Border bordePasswInp = BorderFactory.createMatteBorder(0,0,2,0, Color.lightGray);
        passwordb.setBorder(bordePasswInp);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(0,50,30,0);
        panelMain.add(passwordb, restricciones);

        botLogin = new JButton("Iniciar sesión");
        botLogin.setPreferredSize(new Dimension(300, 40));
        botLogin.setFont(new Font("Arial", Font.CENTER_BASELINE, 21));
        botLogin.setBackground(Color.lightGray);
        botLogin.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(0,50,0,0);
        panelMain.add(botLogin, restricciones);

        this.add(panelMain);
        this.setVisible(true);

    }

    public String getEmail(){
        return emailb.getText();
    }
    public String getPassword(){
        return new String(passwordb.getPassword());
    }

    public void addLoginListener(ActionListener listener){
        botLogin.addActionListener(listener);
    }
}
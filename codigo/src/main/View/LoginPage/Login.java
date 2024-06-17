package main.View.LoginPage;

import javax.swing.*;

public class Login extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setBounds(300,150,700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        userField = new JTextField(20);
        userField.setBounds(100, 10, 160, 25);
        panel.add(userField);

        JLabel passLabel = new JLabel("Senha:");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);

        passField = new JPasswordField(20);
        passField.setBounds(100, 40, 160, 25);
        panel.add(passField);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 250, 25);
        panel.add(loginButton);

        add(panel);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JTextField getUserField() {
        return userField;
    }

    public JPasswordField getPassField() {
        return passField;
    }
}
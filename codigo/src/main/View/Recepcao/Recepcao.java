package main.View.Recepcao;

import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;



public class Recepcao extends JFrame {

    private JButton registerClienteButton;
    private JButton mesasDisponiveisButton;

    public Recepcao() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(300, 90, 700, 500);
        setTitle("Recepcao");
        setLayout(null);

        registerClienteButton = new JButton("Registrar Cliente");
        registerClienteButton.setBounds(100, 200, 250, 70);
        registerClienteButton.setFont(new Font("Arial", Font.PLAIN, 15));
        add(registerClienteButton);

        mesasDisponiveisButton = new JButton("Mesas Disponiveis");
        mesasDisponiveisButton.setBounds(400, 200, 250, 70);
        mesasDisponiveisButton.setFont(new Font("Arial", Font.PLAIN, 15));
        add(mesasDisponiveisButton);


        setLocationRelativeTo(null);
        setVisible(true);
    }


    public JButton getRegisterClienteButton() {
        return registerClienteButton;
    }

    public JButton getMesasDisponiveisButton() {
        return mesasDisponiveisButton;
    }
    


}

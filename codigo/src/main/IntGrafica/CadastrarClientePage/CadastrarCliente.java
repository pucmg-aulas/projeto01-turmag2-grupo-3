package main.IntGrafica.CadastrarClientePage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class CadastrarCliente extends JFrame implements ActionListener {

    private JTextField nomeClienteTextField;
    private JTextField qtdClienteTextField;
    private JLabel nomeClienteLabel;
    private JLabel qtdClienteLabel;

    public CadastrarCliente(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(300, 90, 700, 500);
        setTitle("Cadastrar Cliente");
        setLayout(null);

        nomeClienteLabel = new JLabel("Nome e Sobrenome:");
        nomeClienteLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nomeClienteLabel.setBounds(100, 28, 150, 50);
        add(nomeClienteLabel);

        nomeClienteTextField = new JTextField();
        nomeClienteTextField.setBounds(250, 30, 250, 50);
        nomeClienteTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        add(nomeClienteTextField);

        qtdClienteLabel = new JLabel("Número de pessoas:");
        qtdClienteLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        qtdClienteLabel.setBounds(100, 98, 150, 50);
        add(qtdClienteLabel);

        qtdClienteTextField = new JTextField();
        qtdClienteTextField.setBounds(250, 100, 250, 50);
        qtdClienteTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        add(qtdClienteTextField);





        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}

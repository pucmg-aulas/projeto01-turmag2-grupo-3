package main.IntGrafica.RecepcaoPage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;


import main.IntGrafica.CadastrarClientePage.CadastrarCliente;


public class Recepcao extends JFrame implements ActionListener {

    private JButton registerClienteButton;
    private JButton mesasDisponiveisButton;
    /*private JTextField nomeClienteTextField;
    private JTextField qtdClienteTextField;
    private JLabel nomeClienteLabel;
    private JLabel qtdClienteLabel;*/
    //private JDialog registerClienteDialog;
    
    public Recepcao(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(300, 90, 700, 500);
        setTitle("Recepcao");
        setLayout(null);

        registerClienteButton = new JButton("Registrar Cliente");
        registerClienteButton.setBounds(100, 200, 250, 70);
        registerClienteButton.setFont(new Font("Arial", Font.PLAIN, 15));
        registerClienteButton.addActionListener(this);
        add(registerClienteButton);

        mesasDisponiveisButton = new JButton("Mesas Disponiveis");
        mesasDisponiveisButton.setBounds(400, 200, 250, 70);
        mesasDisponiveisButton.setFont(new Font("Arial", Font.PLAIN, 15));
        mesasDisponiveisButton.addActionListener(this::teste);
        add(mesasDisponiveisButton);

        /*nomeClienteLabel = new JLabel("Nome e Sobrenome:");
        nomeClienteLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nomeClienteLabel.setBounds(100, 28, 150, 50);
        add(nomeClienteLabel);

        nomeClienteTextField = new JTextField();
        nomeClienteTextField.setBounds(250, 30, 250, 50);
        nomeClienteTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        //nomeClienteTextField.setText("Coloque o nome do cliente");
        add(nomeClienteTextField);

        qtdClienteLabel = new JLabel("Número de pessoas:");
        qtdClienteLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        qtdClienteLabel.setBounds(100, 98, 150, 50);
        add(qtdClienteLabel);

        qtdClienteTextField = new JTextField();
        qtdClienteTextField.setBounds(250, 100, 250, 50);
        qtdClienteTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        //qtdClienteTextField.setText("Coloque o nome do cliente");
        add(qtdClienteTextField);*/

        //registerClienteDialog = new JDialog();

        //add(registerClienteDialog);
        
        


        setLocationRelativeTo(null);
        setVisible(true);
}

    public void teste(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null,"Mesas Disponivel","Cadastrar Cliente",JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastrarCliente c =  new CadastrarCliente();
        this.dispose();
        c.setVisible(true);
        //JOptionPane.showMessageDialog(null,"erro","Cadastrar Cliente",JOptionPane.ERROR_MESSAGE);
        
        
    }

}

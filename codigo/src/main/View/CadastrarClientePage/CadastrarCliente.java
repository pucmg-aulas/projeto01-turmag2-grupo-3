package main.View.CadastrarClientePage;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;




public class CadastrarCliente extends JFrame  {

    private JTextField nomeClienteTextField;
    private JTextField qtdClienteTextField;
    private JLabel nomeClienteLabel;
    private JLabel qtdClienteLabel;
    private JButton cadastrarClienteButton;

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
        qtdClienteTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if(!Character.isDigit(c)){
                    evt.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }




        });
        add(qtdClienteTextField);

        cadastrarClienteButton = new JButton("CadastrarCliente");
        cadastrarClienteButton.setBounds(250, 175, 250, 50);
        cadastrarClienteButton.setFont(new Font("Arial", Font.PLAIN, 15));
        add(cadastrarClienteButton);



        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JButton getCadastrarClienteButton() {
        return cadastrarClienteButton;
    }

    public JTextField getQtdClienTextField(){
        return qtdClienteTextField;
    }

    public JTextField getNomeClienteTextField() {
        return nomeClienteTextField;
    }

    

}

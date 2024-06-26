package main.Controller.CadastrarCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import main.Model.Mesa.Mesa;
import main.Model.Requisicao.Requisicao;
import main.Model.Restaurante.Restaurante;
import main.View.CadastrarClientePage.CadastrarCliente;
import main.View.Recepcao.Recepcao;

public class ControllerCadastrarCliente extends JFrame implements ActionListener {
    
    private CadastrarCliente cadastrarCliente;
    private Requisicao requisicao;
    private boolean resposta;
    private Restaurante restaurante;
    private Recepcao recepcao;
    
    

    public ControllerCadastrarCliente(CadastrarCliente cadastrarCliente, Restaurante restaurante, Recepcao recepcao){
        this.cadastrarCliente = cadastrarCliente;
        this.restaurante = restaurante;
        this.recepcao = recepcao;
        this.cadastrarCliente.getCadastrarClienteButton().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Restaurante restaurante = new Restaurante();
                requisicao = new Requisicao();
                //mesa = new ArrayList<>();
                String nome = cadastrarCliente.getNomeClienteTextField().getText();
                int quantidade = Integer.parseInt(cadastrarCliente.getQtdClienTextField().getText());
                Mesa mesa = restaurante.verificacaoMesa(quantidade);
                
                resposta = requisicao.alocarCliente(nome, quantidade, mesa);
                if(resposta == true){

                    JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Cadastrar Cliente", JOptionPane.WARNING_MESSAGE);
                    
                }else if(resposta == false && quantidade < 9){

                    JOptionPane.showMessageDialog(null, "Cliente adicionado a Lista de Espera", "Lista de Espera", JOptionPane.WARNING_MESSAGE);
                }
                
            }
            
        });

        this.cadastrarCliente.getRetornarRecepcao().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                

                cadastrarCliente.setVisible(false);
                recepcao.setVisible(true);

            }
            
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

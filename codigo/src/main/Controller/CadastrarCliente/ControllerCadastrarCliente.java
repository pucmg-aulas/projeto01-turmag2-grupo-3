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

public class ControllerCadastrarCliente extends JFrame implements ActionListener {
    
    private CadastrarCliente cadastrarCliente;
    private Requisicao requisicao;
    private boolean resposta;
    private Restaurante restaurante;
    

    public ControllerCadastrarCliente(CadastrarCliente cadastrarCliente, Restaurante restaurante){
        this.cadastrarCliente = cadastrarCliente;
        this.restaurante = restaurante;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

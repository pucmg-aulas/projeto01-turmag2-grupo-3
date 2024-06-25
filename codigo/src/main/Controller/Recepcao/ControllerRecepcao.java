package main.Controller.Recepcao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import main.Controller.CadastrarCliente.ControllerCadastrarCliente;
import main.Model.Cardapio.Cardapio;
import main.Model.Mesa.Mesa;
import main.Model.Restaurante.Restaurante;

import main.View.CadastrarClientePage.CadastrarCliente;
import main.View.Recepcao.Recepcao;

public class ControllerRecepcao extends JFrame implements ActionListener {
    
    private Recepcao recepcao;
    private CadastrarCliente cadastrarCliente;
    private ArrayList<Mesa> mesa;
    private Restaurante restaurante;
    

    public ControllerRecepcao(Recepcao recepcao, Restaurante restaurante){
        this.recepcao = recepcao;
        this.restaurante = restaurante;

        Cardapio cardapio = new Cardapio();
        this.restaurante = new Restaurante();
        this.restaurante.adicionarMesa(new Mesa(4));
        this.restaurante.adicionarMesa(new Mesa(4));
        this.restaurante.adicionarMesa(new Mesa(4));
        this.restaurante.adicionarMesa(new Mesa(4));
        this.restaurante.adicionarMesa(new Mesa(6));
        this.restaurante.adicionarMesa(new Mesa(6));
        this.restaurante.adicionarMesa(new Mesa(6));
        this.restaurante.adicionarMesa(new Mesa(6));
        this.restaurante.adicionarMesa(new Mesa(8));
        this.restaurante.adicionarMesa(new Mesa(8));
        cardapio.AdicionarPrato("Moqueca de Tilapia", 50.00);
        cardapio.AdicionarPrato("Falafel Assado", 20.00);
        cardapio.AdicionarPrato("Salada Primavera com Macarrão Konjac", 25.00);
        cardapio.AdicionarPrato("Escondidinho de Frango", 35.00);
        cardapio.AdicionarPrato("Strogonoff", 30.00);
        cardapio.AdicionarPrato("Cacarola de carne com legumes", 40.00);
        cardapio.AdicionarBebida("Água", 5.00);
        cardapio.AdicionarBebida("Suco", 8.00);
        cardapio.AdicionarBebida("Refrigerante", 8.00);
        cardapio.AdicionarBebida("Cerveja", 6.00);
        cardapio.AdicionarBebida("Taça de vinho", 18.00);


        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        ControllerCadastrarCliente cadastrarClienteController = new ControllerCadastrarCliente(cadastrarCliente, this.restaurante, this.recepcao);
        cadastrarCliente.setVisible(false);

        this.recepcao.getRegisterClienteButton().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                recepcao.setVisible(false);
                cadastrarCliente.setVisible(true);

            }

       

        });

        this.recepcao.getMesasDisponiveisButton().addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Mesas Disponivel", "Cadastrar Cliente", JOptionPane.WARNING_MESSAGE);
            }
            
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}

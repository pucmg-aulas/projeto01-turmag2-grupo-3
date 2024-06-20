package main.Controller.Recepcao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import main.View.CadastrarClientePage.CadastrarCliente;
import main.View.Recepcao.Recepcao;

public class ControllerRecepcao extends JFrame implements ActionListener {
    
    private Recepcao recepcao;
    private CadastrarCliente cadastrarCliente;
    

    public ControllerRecepcao(Recepcao recepcao){
        this.recepcao = recepcao;
        this.recepcao.getRegisterClienteButton().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastrarCliente c = new CadastrarCliente();
                recepcao.setVisible(false);
                c.setVisible(true);
                // JOptionPane.showMessageDialog(null,"erro","Cadastrar
                // Cliente",JOptionPane.ERROR_MESSAGE);
        
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

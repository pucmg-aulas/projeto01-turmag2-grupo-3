package main.Controller.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.View.LoginPage.Login;
import main.View.Recepcao.Recepcao;

public class ControllerLogin {
    private Login login;

    public ControllerLogin(Login login) {
        this.login = login;
        this.login.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = login.getUserField().getText();
                String pass = new String(login.getPassField().getPassword());

                if ("admin".equals(user) && "admin".equals(pass)) {
                    Recepcao recepcao = new Recepcao();
                   // RecepcaoController recepcaoController = new RecepcaoController(recepcaoView);
                    login.setVisible(false);
                    recepcao.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(login, "Usuário ou senha inválidos");
                }
            }
        });
    }
}
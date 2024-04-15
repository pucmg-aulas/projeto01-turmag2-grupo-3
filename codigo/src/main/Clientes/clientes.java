package main.Clientes;

import java.util.Date;

public class clientes {
    private String nome, telefone;
    private int identidade, quantidade_pessoas;
    private String status;

    public void Cliente(String name, String tel, int id, int qt_pessoas, String st){
    
        this.nome = name;
        this.telefone = tel;
        this.identidade = id;
        this.quantidade_pessoas = qt_pessoas;
        this.status = st;
        
    }

    public void solicitar_mesa(int qtd_pessoas, String Nome, String Telefone, int id, String st) {
        this.nome = Nome;
        this.telefone = Telefone;
        this.identidade = id;
        this.quantidade_pessoas = qtd_pessoas;
        this.status = st;
    }



    public void espera(String nome) {
        System.out.println("Status cliente: " + this.status);
    }
}
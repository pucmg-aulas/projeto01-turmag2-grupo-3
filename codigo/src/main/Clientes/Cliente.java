package main.Clientes;

import java.util.Date;

public class Cliente{
    private String nome;
    private String telefone;
    private int identidade;
    private int quantidade_pessoas;
    private String status;

    public void Cliente(String name, String tel, int id, int qt_pessoas, String st){
        
        this.nome = name;
        this.telefone = tel;
        this.identidade = id;
        this.quantidade_pessoas = qt_pessoas;
        this.status = st;
        
    }

    public void espera() {

        System.out.println("Status cliente: " + this.status);

    }



}
package main.Clientes;

public class Cliente {
    private int QtdClientes;
    private String Nome;

    public Cliente(String nome,int qtdClientes) {
        this.QtdClientes = qtdClientes;
        this.Nome = nome;
    }

    public int getQtdCliente() {
        return QtdClientes;
    }
    
    public String getNome() {
        return Nome;
    }

}
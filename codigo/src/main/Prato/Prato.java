package main.Prato;

public class Prato {
    private String Nome;
    private double Preco;

    public Prato(String nome, double preco) {
        this.Nome = nome;
        this.Preco = preco;
    }

    public String getNome() {
        return Nome;
    }
    public double getPreco() {
        return Preco;
    }
}

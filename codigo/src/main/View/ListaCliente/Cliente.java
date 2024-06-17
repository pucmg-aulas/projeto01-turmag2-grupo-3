package main.View.ListaCliente;

public class Cliente {
    private String nome;
    private int quantidadePessoas;
    private Pedido pedido;

    public Cliente(String nome, int quantidadePessoas) {
        this.nome = nome;
        this.quantidadePessoas = quantidadePessoas;
        this.pedido = new Pedido(this);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    @Override
    public String toString() {
        return nome + " - Pessoas na mesa: " + quantidadePessoas;
    }
}

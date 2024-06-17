package main.View.ListaCliente;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Item> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
}

package main.Cardapio;

import java.util.ArrayList;

import main.Prato.Prato;
import main.Bebida.Bebida;

public class Cardapio {
    private ArrayList<Prato> MenuItensPrato;
    private ArrayList<Bebida> MenuItensBebida;

    public Cardapio() {
        MenuItensPrato = new ArrayList<>();
        MenuItensBebida = new ArrayList<>();
    }

    public void AdicionarPrato(String nome, double preco) {
        Prato prato = new Prato(nome, preco);
        MenuItensPrato.add(prato);
        System.out.println("Prato Adicionado");
    }

    public void AdicionarBebida(String nome, double preco) {
        Bebida bebida = new Bebida(nome, preco);
        MenuItensBebida.add(bebida);
        System.out.println("Bebida Adicionado");
    }

    public void MostrarCardapio() {
        System.out.print("Cardapio:\nPratos:\n");
        int index =1;
        for (Prato prato : MenuItensPrato) {
            System.out.println(index+". "+prato.getNome() + ": R$" + prato.getPreco());
            index++;
        }
        System.out.println("Bebidas:");
        index =1;
        for (Bebida bebida : MenuItensBebida) {
            System.out.println(index+". "+bebida.getNome() + ": R$" + bebida.getPreco());
            index++;
        }
    }

    public ArrayList<Prato> getMenuItensPrato() {
        return MenuItensPrato;
    }

    public ArrayList<Bebida> getMenuItensBebida() {
        return MenuItensBebida;
    }
}

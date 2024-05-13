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

    public void AdicionarPrato(Prato prato) {
        MenuItensPrato.add(prato);
        System.out.println("Prato Adicionado");
    }
    
    public void AdicionarBebida(Bebida bebida) {
        MenuItensBebida.add(bebida);
        System.out.println("Bebida Adicionado");
    }

    public void MostrarCardapio() {
        System.out.print("Cardapio:\nPratos:\n");
        for (Prato prato : MenuItensPrato) {
            System.out.println(prato.getNome() + ": R$" + prato.getPreco());
        }
        System.out.println("Bebidas:");
        for (Bebida bebida : MenuItensBebida) {
            System.out.println(bebida.getNome() + ": R$" + bebida.getPreco());
        }
    }
}

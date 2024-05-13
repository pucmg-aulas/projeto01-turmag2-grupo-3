package main.Menu;

import java.util.ArrayList;

import main.Prato.Prato;

public class Menu {
    private ArrayList<Prato> MenuItens;

    public Menu() {
        MenuItens = new ArrayList<>();
    }

    public void AdicionarPrato(Prato prato) {
        MenuItens.add(prato);
        System.out.println("Prato Adicionado");
    }

    public void MostrarCardapio() {
        System.out.println("Food Store Inventory:");
        for (Prato prato : MenuItens) {
            System.out.println(prato.getNome() + ": R$" + prato.getPreco());
        }
    }
}

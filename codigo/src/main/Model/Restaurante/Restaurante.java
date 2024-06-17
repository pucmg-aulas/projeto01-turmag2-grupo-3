package main.Model.Restaurante;

import java.util.ArrayList;

import main.Model.Mesa.*;

public class Restaurante {

    private ArrayList<Mesa> mesas;

    public Restaurante() {
        mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println("Adicionando mesa");
    }

    public void MostrarMesas() {
        System.out.println("Lista de mesas:");
        for (Mesa mesa : mesas) {
            System.out.println("Quantidade de assentos: " + mesa.getCapacidade() + ", disponibilidade: "
                    + mesa.getDisponibilidade());
        }
    }

    public Mesa verificacaoMesa(int qtdClientes) {
        for (Mesa mesa : mesas) {
            if (!mesa.getOcupada() && mesa.getCapacidade() >= qtdClientes) {
                System.out.println("Mesa Disponivel de " + mesa.getCapacidade() + " assentos");
                return mesa;
            }
        }
        return null;
    }

}
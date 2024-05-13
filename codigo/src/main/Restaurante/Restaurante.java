package main.Restaurante;

import java.util.ArrayList;

import main.Mesa.*;

public class Restaurante {

    private ArrayList<Mesa> mesas;

    public Restaurante() {
        mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println("Adicionando mesa: " + mesa);
    }

    public void MostrarMesas() {
        System.out.println("Lista de mesas:");
        for (Mesa mesa : mesas) {
            System.out.println("Quantidade de assentos: "+ mesa.getCapacidade() + ", disponibilidade: " + mesa.getDisponibilidade());
        }
    }
}
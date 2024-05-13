package main.Mesa;

import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Clientes.Cliente;

public class Mesa {

    private int capacidade;
    private boolean ocupada;

    public Mesa(int capacidade) {
        this.capacidade = capacidade;
        ocupada = false;
    }

    public Boolean diponibilidade() {
        return !ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void removerMesa(Cliente clientes) {

    }
}

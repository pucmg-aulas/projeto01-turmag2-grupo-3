package main.Mesa;

import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Clientes.Cliente;

public class Mesa {

    private int capacidade;
    private boolean ocupada;
    public ArrayList<Cliente> cliente;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Mesa(int capacidade) {
        this.capacidade = capacidade;
        ocupada = false;
        cliente = new ArrayList<>();
    }

    public Boolean diponibilidade() {
        return !ocupada;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void alocarCliente(Cliente clientes) {
        cliente.add(clientes);
        entrada = LocalDateTime.now();
        ocupada = true;
    }

    public void removerMesa(Cliente clientes) {
        cliente.remove(clientes);
        saida = LocalDateTime.now();
        System.out.println("Mesa vazia, horário de saída dos clientes: "+ saida);
        if (cliente.isEmpty()) {
            ocupada = false;
        }
    }
}

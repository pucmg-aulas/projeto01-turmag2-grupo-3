package main.Restaurante;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import main.Clientes.Cliente;
import main.Mesa.*;

public class Restaurante {

    private ArrayList<Mesa> mesas;
    private Queue<Cliente> listaEspera;

    public Restaurante() {
        mesas = new ArrayList<>();
        listaEspera = new LinkedList<>();
    }

    public void AdicionarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println("Adicionando mesa: "+ mesa);
    }

    public void alocarCliente(int qtdClientes) {
        Mesa mesa = verificacaoMesa(qtdClientes);
        if (mesa != null) {
            Cliente cliente = new Cliente(qtdClientes);
            mesa.alocarCliente(cliente);
            System.out.println("Alocando mesa para "+ qtdClientes+ " clientes");
        } else {
            Cliente cliente = new Cliente(qtdClientes);
            ClienteEspera(cliente);
            System.out.println("Não exitem mesas disponiveis no momento para essa quantidade de pessoas!");
        }

    }

    private Mesa verificacaoMesa(int qtdClientes) {
        for (Mesa mesa : mesas) {
            if (mesa.diponibilidade() && mesa.getCapacidade() >= qtdClientes) {
                System.out.println("Mesa Disponivel "+ mesa);
                return mesa;
            }
        }
        return null;
    }

    private void ClienteEspera(Cliente cliente) {
        listaEspera.add(cliente);
        System.out.println("Cliente alocado para a espera!");
    }

    public void removerCliente(){
        listaEspera.poll();
        System.out.println("Cliente removido da lista de espera");
    }
}
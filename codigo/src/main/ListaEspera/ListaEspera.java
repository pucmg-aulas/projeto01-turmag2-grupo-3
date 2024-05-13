package main.ListaEspera;

import java.util.ArrayList;

import main.Clientes.Cliente;

public class ListaEspera {
    private ArrayList<Cliente> ListaDeEspera;

    public ListaEspera() {
        ListaDeEspera = new ArrayList<>();
    }

    public void AdicionarCliente(Cliente cliente) {
        ListaDeEspera.add(cliente);
        System.out.println("Cliente Adicionado na lista de espera");
    }

    public void RemoverCliente(Cliente cliente) {
        ListaDeEspera.remove(cliente);
        System.out.println("Cliente removido na lista de espera");
    }

    public void MostrarLista() {
        System.out.println("Lista de Clientes na fila de espera:");
        for (Cliente cliente : ListaDeEspera) {
            System.out.println(cliente.getNome() + ", quantidade reservada de assentos: " + cliente.getQtdCliente());
        }
    }
}

package main.Requisicao;

import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Clientes.Cliente;
import main.ListaEspera.ListaEspera;
import main.Mesa.Mesa;

public class Requisicao {
    ListaEspera listaEspera = new ListaEspera();
    ArrayList<Cliente> comendo;

    public Requisicao() {
        this.comendo = new ArrayList<>();
    }

    public boolean alocarCliente(String nomeCliente, int qtdClientes, Mesa mesa) {
        if (mesa != null) {
            Cliente cliente = new Cliente(nomeCliente, qtdClientes, mesa);
            cliente.setEntrada(LocalDateTime.now());
            mesa.setOcupada(true);
            System.out.println("Alocando mesa para " + cliente.getQtdCliente() + " clientes, de nome "
                    + cliente.getNome() + ", entrada: " + cliente.getEntrada());
            comendo.add(cliente);
            return true;
        } else {
            Cliente cliente = new Cliente(nomeCliente, qtdClientes, null);
            listaEspera.AdicionarCliente(cliente);
            System.out.println("Não exitem mesas disponiveis no momento para essa quantidade de pessoas!");
            return false;
        }

    }

    public ArrayList<Cliente> getComendo() {
        return comendo;
    }

    public void listaDeClientes() {
        System.out.println("Lista de clientes:");
        if (comendo == null) {
            System.out.println("Nenhum cliente ainda!");
            return;
        }
        int index = 1;
        for (Cliente cliente : comendo) {
            if (cliente.getMesa() != null) {
                Mesa mesa = cliente.getMesa();
                System.out
                        .println(index + ". Nome do Cliente " + cliente.getNome() + ", quantidade de assentos na mesa "
                                + mesa.getCapacidade());
                index++;
            }
        }
    }

    public void removerCliente(Cliente clientes) {
        if (comendo.remove(clientes)) {
            clientes.setSaida(LocalDateTime.now());
            Mesa mesa = clientes.getMesa();
            mesa.setOcupada(false);
            clientes.Conta();
            clientes.setMesa(null);
            System.out.print("Mesa vazia, horário de saída dos clientes: " + clientes.getSaida()
                    + "\nAlocando clientes da fila de espera!\n");
            if (listaEspera.getListaDeEspera() == null) {
                System.out.println("Lista de espera vazia!");
            } else {
                for (Cliente cliente : listaEspera.getListaDeEspera()) {
                    if (cliente.getQtdCliente() <= mesa.getCapacidade()) {
                        if (alocarCliente(cliente.getNome(), cliente.getQtdCliente(), mesa)) {
                            mesa.setOcupada(true);
                            comendo.add(cliente);
                            System.out.println("Cliente da reserva de nome: " + cliente.getNome()
                                    + " da fila de espera foi alocado para uma mesa.");
                            listaEspera.RemoverCliente(cliente);
                            break;
                        } else {
                            System.out.println("Nenhum cliente da lista pode ser alocado no momento!");
                        }
                    }
                }

            }
        } else {
            System.out.println("Falha ao remover");
        }
    }

    public void ListadeEspera() {
        listaEspera.MostrarLista();
    }
}
package main.Clientes;

import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Bebida.Bebida;
import main.Mesa.Mesa;
import main.Prato.Prato;

public class Cliente {

    private int QtdClientes;
    private String Nome;
    private ArrayList<Prato> pratos;
    private ArrayList<Bebida> bebidas;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private double total = 0;
    private Mesa mesa;

    public Cliente(String nome, int qtdClientes, Mesa mesa) {
        this.QtdClientes = qtdClientes;
        this.Nome = nome;
        this.pratos = new ArrayList<>();
        this.bebidas = new ArrayList<>();
        this.mesa = mesa;
    }

    public int getQtdCliente() {
        return QtdClientes;
    }

    public String getNome() {
        return Nome;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getTotal() {
        return total;
    }

    public void Conta() {
        System.out.println("Conta de " + Nome + ":");
        System.out.println("Pratos:");
        for (Prato prato : pratos) {
            System.out.println(prato.getNome() + ": R$" + prato.getPreco());
        }
        System.out.println("Bebidas:");
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getNome() + ": R$" + bebida.getPreco());
        }
        System.out.println("Total: R$" + total);
    }

    public void comprarPrato(Prato prato) {
        pratos.add(prato);
        total += prato.getPreco();
    }

    public void comprarBebida(Bebida bebida) {
        bebidas.add(bebida);
        total += bebida.getPreco();
    }

}
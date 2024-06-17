package main.Model.Clientes;

import java.time.LocalDateTime;
import java.util.ArrayList;

import main.Model.Bebida.Bebida;
import main.Model.Mesa.Mesa;
import main.Model.Prato.Prato;

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
        String totalformatado = String.format("%.2f", total);
        System.out.println("Total: R$" + totalformatado);
        String finalformatado = String.format("%.2f", finalizada());
        System.out.println("Total com taxas e dividido: R$" + finalformatado);
    }

    private double finalizada() {
        return (((total * 0.1)+total) / getQtdCliente());
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
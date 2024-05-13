package main;

import java.util.Scanner;

import main.Mesa.Mesa;
import main.Cardapio.Cardapio;
import main.Restaurante.*;
import main.Requisicao.Requisicao;
import main.ListaEspera.ListaEspera;

public class Main {

    public static void main(String[] args) {
        ListaEspera listaEspera = new ListaEspera();
        Requisicao requisicao = new Requisicao();
        Cardapio cardapio = new Cardapio();
        Restaurante restaurante = new Restaurante();
        restaurante.adicionarMesa(new Mesa(4));
        restaurante.adicionarMesa(new Mesa(4));
        restaurante.adicionarMesa(new Mesa(4));
        restaurante.adicionarMesa(new Mesa(4));
        restaurante.adicionarMesa(new Mesa(6));
        restaurante.adicionarMesa(new Mesa(6));
        restaurante.adicionarMesa(new Mesa(6));
        restaurante.adicionarMesa(new Mesa(6));
        restaurante.adicionarMesa(new Mesa(8));
        restaurante.adicionarMesa(new Mesa(8));

        Scanner insert = new Scanner(System.in);
        int flag = 0;

        while (flag != 1) {
            System.out.print("Digite 1 para alocar cliente\nDigite 2 para remover cliente\nDigite 3 para conferir mesas\nDigite 4 para checar lista de espera\nDigite 5 para checar menu\nDigite 6 para sair\nEscolha: ");
            int choose = insert.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Digite o nome do Cliente: ");
                    String NomeDoCliente = insert.nextLine();
                    System.out.println("Digite a quantidade de assentos: ");
                    int qtdClientes = insert.nextInt();
                    if (qtdClientes >= 9) {
                        System.out.println("Quatidade não permitida!");
                    } else {
                        requisicao.alocarCliente(NomeDoCliente, qtdClientes);
                    }
                    break;
                case 2:
                     
                    // restaurante.removerCliente();
                    break;
                case 3:
                    restaurante.MostrarMesas();
                    break;
                case 4:
                    listaEspera.MostrarLista();
                    break;
                case 5:
                    cardapio.MostrarCardapio();
                    break;
                case 6:
                    flag = 1;
                    break;
            }
        }
        insert.close();
    }

}
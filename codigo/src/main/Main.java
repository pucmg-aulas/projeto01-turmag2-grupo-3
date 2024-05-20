package main;

import java.util.Scanner;

import main.Mesa.Mesa;
import main.Cardapio.Cardapio;
import main.Clientes.Cliente;
import main.Restaurante.*;
import main.Requisicao.Requisicao;

public class Main {

    public static void main(String[] args) {
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
        cardapio.AdicionarPrato("Moqueca de Tilapia", 50.00);
        cardapio.AdicionarPrato("Falafel Assado", 20.00);
        cardapio.AdicionarPrato("Salada Primavera com Macarrão Konjac", 25.00);
        cardapio.AdicionarPrato("Escondidinho de Frango", 35.00);
        cardapio.AdicionarPrato("Strogonoff", 30.00);
        cardapio.AdicionarPrato("Cacarola de carne com legumes", 40.00);
        cardapio.AdicionarBebida("Água", 5.00);
        cardapio.AdicionarBebida("Suco", 8.00);
        cardapio.AdicionarBebida("Refrigerante", 8.00);
        cardapio.AdicionarBebida("Cerveja", 6.00);
        cardapio.AdicionarBebida("Taça de vinho", 18.00);

        Scanner insert = new Scanner(System.in);
        int flag = 0;

        while (flag != 1) {
            System.out.print(
                    "Digite 1 para alocar cliente\nDigite 2 para remover cliente\nDigite 3 para conferir mesas\nDigite 4 para checar lista de espera\nDigite 5 para checar menu\nDigite 6 para lista de clientes\nDigite 7 para sair\nEscolha: ");
            int choose = insert.nextInt();
            insert.nextLine();
            System.out.println("");
            switch (choose) {
                case 1:
                    System.out.println("Digite o nome do Cliente: ");
                    String NomeDoCliente = insert.nextLine();
                    System.out.println("Digite a quantidade de assentos: ");
                    int qtdClientes = insert.nextInt();
                    insert.nextLine();
                    if (qtdClientes >= 9) {
                        System.out.println("Quatidade não permitida!");
                    } else {
                        Mesa mesa = restaurante.verificacaoMesa(qtdClientes);
                        requisicao.alocarCliente(NomeDoCliente, qtdClientes, mesa);
                    }
                    break;
                case 2:
                    requisicao.listaDeClientes();
                    System.out.println("Selecione um cliente para remover, digite seu número: ");
                    int escolha = insert.nextInt();
                    insert.nextLine();
                    int index = 0;
                    if (escolha > 10) {
                        System.out.println("Escolha invalida!");
                        break;
                    }
                    for (Cliente cliente : requisicao.getComendo()) {
                        if (index == escolha - 1) {
                            requisicao.removerCliente(cliente);
                            break;
                        }
                        index++;
                    }
                    break;
                case 3:
                    restaurante.MostrarMesas();
                    break;
                case 4:
                    requisicao.ListadeEspera();
                    break;
                case 5:
                    cardapio.MostrarCardapio();
                    break;
                case 6:
                    requisicao.listaDeClientes();
                    break;
                case 7:
                    flag = 1;
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
        }
        insert.close();
    }

}
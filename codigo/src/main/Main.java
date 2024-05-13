package main;

import java.util.Scanner;

import main.Mesa.Mesa;
import main.Restaurante.*;;

public class Main {

    public static void main(String[] args) {
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
        int flag=0;

        while (flag!=1) {
            System.out.print("Digite 1 para alocar cliente\nDigite 2 para remover cliente\nDigite 3 para sair\n");
            int choose = insert.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Digite a quantidade de clientes: ");
                    int qtdClientes = insert.nextInt();
                    if (qtdClientes <= 0) {
                        System.out.println("Saindo do Sistema");
                        break;
                    }else if(qtdClientes>=9){
                        System.out.println("Quatidade não permitida!");
                    }else{
                        // restaurante.alocarCliente(qtdClientes);
                    }
                    break;
                case 2:
                    // restaurante.removerCliente();
                    break;
                case 3:
                flag=1;
                    break;
            }
        }
        insert.close();
    }

}
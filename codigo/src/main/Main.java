package main;

import java.util.Scanner;

import main.Mesa.Mesa;
import main.Restaurante.*;;

public class Main {

    public static void main(String[] args){
        Restaurante restaurante = new Restaurante();
        restaurante.AdicionarMesa(new Mesa(4));
        restaurante.AdicionarMesa(new Mesa(4));
        restaurante.AdicionarMesa(new Mesa(6));
        restaurante.AdicionarMesa(new Mesa(6));
        restaurante.AdicionarMesa(new Mesa(6));
        restaurante.AdicionarMesa(new Mesa(6));
        restaurante.AdicionarMesa(new Mesa(8));
        restaurante.AdicionarMesa(new Mesa(8));

        Scanner insert = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema do Restaurante, digite <= 0 para quebrar o código");
            int qtdClientes = insert.nextInt();
            if (qtdClientes <= 0) {
                System.out.println("Saindo do Sistema");
                break;
            }
            restaurante.alocarCliente(qtdClientes);
        }
        insert.close();
    }

}
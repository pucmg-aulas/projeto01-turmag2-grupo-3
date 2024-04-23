package main.Restaurante;

import java.util.Date;

import main.Clientes.Cliente;
import main.Mesa.Mesa;

public class Restaurante {
    private static int mesas = 10;
    private Mesa mesa[];
    private Cliente cliente;
    protected Date dt_entrada;
    protected Date dt_saida;
    
    
    public void solicitarMesa(Cliente clients) {
        
        if(disponibilidade() == true){
            ocuparMesa();
            
        }else if(disponibilidade() == false){
            adicionarClienteL();
        }

    }

    public void disponibilidade(){
        
        if(this.quantidade_pessoas <= 4 && this.mesa[0] > 0){



        }else if(this.quantidade_pessoas > 4 && this.quantidade_pessoas <= 6 && this.mesa[1] > 0){



        }else if(this.quantidade_pessoas > 6 && this.quantidade_pessoas < 8 && this.mesa[2] > 0){



        }


    }


}



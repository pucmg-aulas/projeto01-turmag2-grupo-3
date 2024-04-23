package main.Mesa;

import java.util.Date;

import main.Restaurante.Restaurante;

public class Mesa extends Restaurante {
    
    private int cadeiras;
    private Restaurante dt;

    public void Mesa(){
        
    }
    
    public void ocuparMesa(int qt_pessoas){
        /*if(qt_pessoas <= 4){
            this.cadeiras = this.cadeiras - 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.cadeiras = this.cadeiras - 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.cadeiras = this.cadeiras - 1;
        }*/

        Date hora = new Date();
        hora.getTime();
        this.dt_entrada = hora;
        
        // Adicionar horario de entrada
    }
    
    public void desocuparMesa(int qt_pessoas){
        /*if(qt_pessoas <= 4){
            this.cadeiras = this.cadeiras + 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.cadeiras = this.cadeiras + 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.cadeiras = this.cadeiras + 1;
        }
    }*/

        Date hora = new Date();
        hora.getTime();
        this.dt_saida = hora;


    // Adicionar horario de saida
    
}

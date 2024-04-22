package main.Mesa;

public class Mesa {

    private int cadeiras;
    
    public void Mesa(){
        
    }
    
    public void ocuparMesa(int qt_pessoas){
        if(qt_pessoas <= 4){
            this.cadeiras = this.cadeiras - 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.cadeiras = this.cadeiras - 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.cadeiras = this.cadeiras - 1;
        }
    }
    
    public void desocuparMesa(int qt_pessoas){
        if(qt_pessoas <= 4){
            this.cadeiras = this.cadeiras + 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.cadeiras = this.cadeiras + 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.cadeiras = this.cadeiras + 1;
        }
    }
    
}

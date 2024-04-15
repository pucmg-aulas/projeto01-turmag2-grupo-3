package main.Mesa;

public class mesa {
    private int mesa4 = 4;
    private int mesa6 = 4;
    private int mesa8 = 2;
    
    public void Mesa(){
        
    }
    
    public void ocuparMesa(int qt_pessoas){
        if(qt_pessoas <= 4){
            this.mesa4 = this.mesa4 - 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.mesa6 = this.mesa6 - 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.mesa8 = this.mesa8 - 1;
        }
    }
    
    public void desocuparMesa(int qt_pessoas){
        if(qt_pessoas <= 4){
            this.mesa4 = this.mesa4 + 1;
        }else if(qt_pessoas > 4 && qt_pessoas <= 6){
            this.mesa6 = this.mesa6 + 1;
        }else if(qt_pessoas > 6 && qt_pessoas <= 8){
            this.mesa8 = this.mesa8 + 1;
        }
    }
    
    public void disponibilidade(){
        
    }
}

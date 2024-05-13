package main.Restaurante;
import java.util.ArrayList;
import main.Mesa.*;

public class Restaurante {

    private ArrayList<Mesa> mesas;

    public Restaurante() {
        mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
        System.out.println("Adicionando mesa: "+ mesa);
    }
    
}
package main.Mesa;

public class Mesa {

    private int capacidade;
    private boolean ocupada;

    public Mesa(int capacidade) {
        this.capacidade = capacidade;
        ocupada = false;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Boolean getOcupada(){
        return ocupada;
    }

    public String getDisponibilidade() {
        if (ocupada == false) {
            return "Desocupada";
        }
        return "Ocupada";
    }
}

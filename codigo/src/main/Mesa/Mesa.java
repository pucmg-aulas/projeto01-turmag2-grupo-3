package main.Mesa;

public class Mesa {

    private int capacidade;
    private boolean ocupada;

    public Mesa(int capacidade) {
        this.capacidade = capacidade;
        ocupada = false;
    }

    public Boolean diponibilidade() {
        return !ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

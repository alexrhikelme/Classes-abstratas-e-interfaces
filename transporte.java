package abstrata;

public abstract class transporte{
    private int capacidade;

    public transporte(int capacidade){
        this.capacidade = capacidade;
    }

    public int exibirCapacidade(){
        return this.capacidade;
    }

    public abstract void mover();
}
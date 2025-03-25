package abstrata;

public class carroEletrico extends transporte implements eletrico {

    public carroEletrico(int capacidade){
        super(capacidade);
    }

    @Override
    public void mover(){
    System.out.println("o carro esta se movendo");
    }

    @Override
    public void carregarBateria(){
    System.out.println("a bateria esta sendo carregada");
    }
}

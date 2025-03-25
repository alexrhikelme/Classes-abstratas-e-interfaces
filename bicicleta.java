package abstrata;

public class bicicleta extends transporte{
    public bicicleta(int capacidade){
        super(capacidade);
    }
    @Override
    public void mover(){
    System.out.println("a bicicleta esta se movendo");
    }
    
}
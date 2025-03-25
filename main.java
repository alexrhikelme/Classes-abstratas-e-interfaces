package abstrata;

import java.util.ArrayList; 

public class main {
    public static void main(String[] args){
        ArrayList<transporte> transportes = new ArrayList<>();
        transportes.add(new carroEletrico(4));
        transportes.add(new bicicleta(1));

        for (transporte t : transportes) {
            t.exibirCapacidade();
            t.mover();
            if (t instanceof eletrico) {
                ((eletrico) t).carregarBateria();
            }
            System.out.println();
        }
    }
}

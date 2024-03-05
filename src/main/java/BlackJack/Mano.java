package BlackJack;

import java.util.ArrayList;

public class Mano extends Mazo {
    private ArrayList<Carta> mano = new ArrayList<Carta>();

    public Mano(Mazo mazo, ArrayList<Carta> mano) {
        super();
        this.mano = mano;
    }

    public int valorMano() {
        int total = 0;
        for (Carta carta : mano) {
            total += carta.getValor();
        }
        return total;
    }

    public boolean finDeJuego () {
        if (valorMano() >=21 ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return + valorMano() + super.toString() ;
    }

    public void pedirCarta (Mazo mazo){
        mano.add (solicitarCarta());
    }
}




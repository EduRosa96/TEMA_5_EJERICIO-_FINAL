package BlackJack;

import java.util.ArrayList;
import java.util.Collections;


public class Mazo {
        ArrayList<Carta> mazo = new ArrayList<Carta>(52);

        public Mazo() {
            for (Carta.Palo p : Carta.Palo.values()) {
                for (int i = 1; i < 14; i++) {
                    mazo.add(new Carta(p, i));
                }
            }
        }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    @Override
    public String toString() {
       /* for (int i = 0; i < mazo.toArray().length; i++) {
            return "El mazo es: " +
                    mazo.toArray()[i] + " ";

        } return mazo.toString();*/
        String cadena = "El mazo es: ";
        for (Carta carta : mazo){
            cadena += carta + " ";
        }
        return cadena;
    }

    public Carta solicitarCarta() {
            Carta carta = mazo.getFirst();
            mazo.remove(carta);
            return carta;
    }
}



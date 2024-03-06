package BlackJack;

import java.util.ArrayList;
import java.util.Collections;


public class Mazo {
    //ARRYLIST
    private ArrayList<Carta> cartas = new ArrayList<Carta>();

    //CONSTRUCTOR
    public Mazo() {
        for (Carta.Palo p : Carta.Palo.values()) {
            for (int i = 1; i < 14; i++) {
                this.cartas.add(new Carta(p, i));
            }
        }
    }

    //METODOS
    public void barajar() {
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        String cadena = "El mazo es: ";
        for (Carta carta : cartas) {
            cadena += carta + " ";
        }
        return cadena;
    }

    public Carta solicitarCarta() {
        Carta carta = cartas.getFirst();
        cartas.remove(carta);
        return carta;
    }

}



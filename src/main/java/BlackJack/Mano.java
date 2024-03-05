package BlackJack;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mano extends Mazo {
    private ArrayList<Carta> cartasMano;

    public Mano() {
        super();
        cartasMano = new ArrayList<Carta>();

    }

    @XmlElement
    public int valorMano() {
        int total = 0;
        for (Carta carta : cartasMano) {
            total += carta.getValor();

        }
        return total;

    }

    // retorna la evaluación de la condición, es decir, si valor mano
    // es mayor a 21 es true si no false
    public boolean finDeJuego() {
        return valorMano() > 21;
    }

    @Override
    public String toString() {
        return valorMano() + "\n" + super.toString();
    }

    public void pedirCarta(Mazo mazo) {
        cartasMano.add(solicitarCarta());
    }
}




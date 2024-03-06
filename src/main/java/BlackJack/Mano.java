package BlackJack;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cartas")
public class Mano extends Mazo {
    //ARRAYLIST
    @XmlElement
    private ArrayList<Carta> cartasMano;

    //CONSTRUCTOR
    public Mano() {
        super();
        cartasMano = new ArrayList<Carta>();

    }

    //METODOS Y GETTERS
    @XmlElement(name = "ValorMano")
    public int getValorMano() {
        return valorMano();
    }

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

    //METODO TOSTRING
    @Override
    public String toString() {
        return valorMano() + "\n" + cartasMano;
    }

    public void pedirCarta(Mazo mazo) {
        cartasMano.add(solicitarCarta());
    }
}




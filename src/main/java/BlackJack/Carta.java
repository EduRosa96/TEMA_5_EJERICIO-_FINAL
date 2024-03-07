package BlackJack;

import javax.xml.bind.annotation.XmlElement;

public class Carta {
    //PARÁMETROS
     enum Palo {
        TREBOL, DIAMANTES, CORAZONES, PICAS
    }

    private Palo palo;


    private int numCarta;

    //CONSTRUCTOR
    public Carta(Palo palo, int numCarta) {

        this.palo = palo;
        this.numCarta = numCarta;
    }

    //GETTERS
    public Palo getPalo() {
        return palo;
    }

    public int getNumCarta() {
        if (numCarta <= 13) {
            return numCarta;
        } else {
            System.out.println("Introduce un número válido");
            return -1;
        }
    }

    @XmlElement(name = "valor")
    public int getValor() {
        int numValorCarta;
        if (numCarta == 1) {
            return numValorCarta = 11;
        } else if (numCarta == 11 || numCarta == 12 || numCarta == 13) {
            return numValorCarta = 10;
        } else {
            return numCarta;
        }
    }

    // METODOS
    public String mostrarNumero() {
        if (numCarta == 1) {
            return "AS";
        } else if (numCarta == 11) {
            return "J";
        } else if (numCarta == 12) {
            return "Q";
        } else if (numCarta == 13) {
            return "K";
        } else {
            return Integer.toString(numCarta);
        }
    }


    @XmlElement(name = "carta")
    public String getToString() {
        return toString();
    }

    @Override
    public String toString() {
        return "[ " + mostrarNumero() + " - " + palo + " ]";
    }
}
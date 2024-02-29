package BlackJack;

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

    public int getValor() {
        if (numCarta == 1) {
            return numCarta = 11;
        } else if (numCarta == 11 || numCarta == 12 || numCarta == 13) {
            return numCarta = 10;
        } else {
            return numCarta;
        }
    }

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

    @Override
    public String toString() {
        return "[ " + mostrarNumero() + " - " + palo + " ]";
    }
}
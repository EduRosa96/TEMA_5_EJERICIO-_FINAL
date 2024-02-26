package BlackJack;

public class Carta {

    private Palo palo;

    enum Palo {
        TREBOL, DIAMANTES, CORAZONES, PICAS
    }

    ;
    private int numCarta;

    public Carta(Palo palo, int numCarta) {
        this.palo = palo;
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getNumCarta() {
        if (numCarta <= 13) {
            return numCarta;
        } else {
            System.out.println("Introduce un número válido");
        }
    }
}

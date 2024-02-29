package BlackJack;

public class Main {
    public static void main(String[] args) {
        Mazo mazo=new Mazo();
        mazo.toString();
        System.out.println(mazo);
        mazo.solicitarCarta();
        System.out.println(mazo);
    }
}

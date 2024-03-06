package BlackJack;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Scanner;


public class Juego {
    public static void main(String[] args) throws JAXBException {
        //INICIALIZAMOS LOS ARRAYLIST
        Mazo mazo = new Mazo();

        Mano mano = new Mano();
        mazo.barajar();

        System.out.println("Bienvenido a la mesa de black Jack");

        Scanner sc = new Scanner(System.in);
        //BUCLE WHILE DONDE SE DESARROLLA EL JUEGO
        while (true) {
            System.out.println("¿Quiere una carta? S/N");
            String respuesta = sc.nextLine();

            //usamos IgnoreCase para que sólo tenga en cuenta la letra y no importe la mayúscula o minúscula
            if (respuesta.equalsIgnoreCase("s")) {
                mano.pedirCarta(mazo);
                System.out.println("Su mano es: " + mano);
                if (mano.finDeJuego()) {
                    System.out.println("Te has pasado de 21!");
                    break;
                } else if (mano.valorMano() == 21) {
                    System.out.println("GANASTE!!");
                    break;
                }

            } else if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Te has plantado. " + mano.valorMano());
                break;
            } else {
                System.out.println("Respuesta no válida. Por favor introduce S/N");
            }


        }
        //MOSTRAMOS LAS CARTAS DE LA MANO
        System.out.println("Su mano es: " + mano);
        //USAMOS EL TRY AND CATCH PARA IMPRIMIR EL RESULTADO EN UN XML
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Mano.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(mano, new File("C:\\Users\\edy_e\\Desktop\\CODING\\PROGRAMACIÓN\\ejemplos clase\\ProyectoTema5\\src\\PartidaBJ.xml"));
        } catch (JAXBException e) {
            e.printStackTrace(); // Imprime el error en la consola
        }

    }
}
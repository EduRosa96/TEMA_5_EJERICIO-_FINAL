package BlackJack;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
    public static void main(String[] args) throws JAXBException {
        Mazo mazo = new Mazo();

        Mano mano = new Mano();
        mano.barajar();

        System.out.println("Bienvenido a la mesa de black Jack");

        Scanner sc = new Scanner(System.in);
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
                }
                if (mano.valorMano() == 21){
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

        JAXBContext jaxbContext = JAXBContext.newInstance(Mano.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(mano, new File("C:\\Users\\edy_e\\Desktop\\PartidaBJ.xml"));
    }

}

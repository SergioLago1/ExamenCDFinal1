package examenfinalparte1;

import java.io.IOException;

/**
 * @author Sergio
 */
public class Prin {

    public static void main(String[] args) throws IOException {
        /**
         * Aqui creamos un objeto de tipo principal
         */
        Principal obj = new Principal();
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo SumaDistintos
         * introduciendole 2 valores
         */
        System.out.println("Es: " + obj.SumaNumDiferentes(10, 20));
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo sumaMismoNum
         * introduciendole 1 valor
         */

        System.out.println("Es: " + obj.sumaIgual(10));
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo menosUno que
         * retorna -1
         */

        System.out.println("Es: " + obj.menosUno());
    }
}


    /*
    He decidido usar el lenguaje de programación Java
    Esta es la URL oficial de Java: https://www.java.com/
    */

    // Esto es un comentario en una línea

    /* Esto es un comentario
                            en varias líneas */

    /** Esto es un comentario usado
     *  para documentación.
     */

public class mors {

    public static void main(String[] args) {

    /*
       Las variables siguen esta sintaxis:

       "tipo nombreVariable = valor"

    */

        // Por ejemplo:
        int dadAge = 46;

    /*
       Las constantes son similares, pero con la palabra clave "final".

       "final tipo nombreVariable = valor"

       El valor de la constante no podrá ser modificado.
    */

        // Por ejemplo:
        final int solarSystemPlanets = 8;

        // Existen varios tipos de datos primitivos, como lo son:

        byte myByte = 127; // De -128 a 127, incluyéndolos.
        short myShort = -32768; // De -32.768 a 32.767, incluyéndolos.
        int myInt = 0; // De -2.147.483.648 (-2^31) a 2.147.483.647 (2^31 -1), incluyéndolos.
        long myLong = 0; // De -9.223.372.036.854.775.808 (-2^63) a 9.223.372.036.854.775.807 (2^63 -1), incluyéndolos.
        float myFloat = 0; /*

        Su rango de valores se especifica en:
        https://docs.oracle.com/javase/specs/jls/se27/html/jls-4.html#jls-4.2.3

        */
        double myDouble = 3.5; /*

        Su rango de valores se especifica en:
        https://docs.oracle.com/javase/specs/jls/se27/html/jls-4.html#jls-4.2.3

        */
        boolean myBoolean = true; // Para condiciones de verdadero (true) o falso (false).
        myBoolean = false;

        char myChar = 'a'; // Carácter unicode de 16 bits, letra digito o símbolo.
        char number = '0';
        char letter = 'A';
        char symbol = '^';

        String myString = "Esto es una cadena de texto";
        //String no es un dato primitivo como tal, se le ha dado un trato especial.

        // Impresión de texto por terminal:
        IO.println("Esto es una forma de imprimir texto.");
        System.out.println("Esto es otra forma de imprimir texto.");

    }
}

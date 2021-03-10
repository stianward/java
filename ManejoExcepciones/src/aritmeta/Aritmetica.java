package aritmeta;

import excepciones.OperacionExcepciones;

public class Aritmetica {

    private static int rest;

    public static int division(int num1, int num2) throws OperacionExcepciones {
        //rest = num1 / num2;

        if (num2 == 0) {
            throw new OperacionExcepciones("Divion invalida!");
           

        } 

            return num1 / num2;

        

    }

}

package domain;

import java.util.LinkedList;

public class ValidarNumeroTarjeta {

    public static int a, b;
    public static boolean res;

    public static Boolean ValidarNumeroTarjeta(String numeroTarjeta) {

        String reves = new StringBuffer(numeroTarjeta).reverse().toString();
        System.out.println("::"+reves);
        for (int i = 0; i < numeroTarjeta.length(); i++) {
            int numeroTarjetaReves = Character.digit(reves.charAt(i), 10);
            if (i % 2 == 0) {
                a += numeroTarjetaReves;

            } else {
                b += 2 * numeroTarjetaReves;

                if (numeroTarjetaReves >= 5) {
                    b -= 9;
                }
            }

        }
        System.out.println("sumatoria: "+(a+b));
        if ((a + b) % 10 == 0) {

            System.out.println("LA TARJETA ES CORRECTA!");
            res = true;
        } else {
            System.out.println("LA TARJETA ES INCORRECTA!");
            res = false;
        }
        return res;

    }

}

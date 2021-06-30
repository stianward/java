package domain;

public class serieTaylor {

    static double acumulador, valorCercano = 0.0001d,angulo,sumaPotencias = 0;
    static int n = 0;
    

    public static double serieTaylor(double angulo) {

        //angulo=Math.toRadians(angulo);
        
        do{
           int z=(2*n)+1;
          acumulador = (Math.pow(-1, n) / calcularFactorial(z) )* Math.pow(angulo, z);
            sumaPotencias = sumaPotencias + acumulador;
            n = n + 1;
            
        }while(n<10);
        //for (int i = 0; Math.abs(acumulador) > valorCercano; i++) {
//
//            acumulador = Math.pow(-1, n) / calcularFactorial(2 * n) * Math.pow(angulo, 2 * n);
//            sumaPotencias = sumaPotencias + acumulador;
//            n = n + 1;
        //}

        return sumaPotencias;
    }

    public static double calcularFactorial(int n) {
        
        double factorial = 1.0d;
        while (n != 0) {
            factorial *= n--;

        }

        return factorial;
    }

}

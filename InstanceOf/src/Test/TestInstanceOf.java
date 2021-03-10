package Test;

import domain.*;
import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {
      //  Gerente gerente = new Gerente("edward", 20, 777);
        Empleado empleado = new Empleado("oso", 16);
        empleado=new Gerente("gato", 20, 10);
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("ES DE TIPO GERENTE");
            
            ((Gerente) empleado).suma(); //conversion del objeto padre empleado a objeto hijo Gerente
            System.out.println("empleado = " + ((Gerente) empleado).suma());
            
        } else if (empleado instanceof Empleado) {
            System.out.println("TIPO EMPLEAdO");
        } else if (empleado instanceof Object) {

            System.out.println("TIPO OBJETO");
        }

    }

}

package Test;

import domain.*;
import domain.Empleado;
import domain.Gerente;

public class Test {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("chrstian", 20, tiposEscritura.ESCRITURA_MODERNA);
        
        
        //polimorfismo
        System.out.println("e1 = " + empleado.obtDetalles());
        
        //DOWNCASTING LA CLASE PADRE PUEDE UTILIZAR METODOS DE LA CLASE HIJA SIEMPRE QUE SEA COMUN
        Escritor escritor=(Escritor) empleado;
        
        
        //UPCASTING no es necesaria una conversion
        Empleado empleado2=escritor;
        System.out.println(""+empleado2.obtDetalles());
        
    }

}

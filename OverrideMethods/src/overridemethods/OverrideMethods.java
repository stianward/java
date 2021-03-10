package overridemethods;

import domain.*;

public class OverrideMethods {

    public static void main(String[] args) {
        Gerente g = new Gerente("edward", 20, 777);
        Empleado e=new Empleado("oso",16);
        //System.out.println("" + g.obtDetalles());
        imprimir(g);
        imprimir(e);
        
        
    }
    
    
    /*CONCEPTO DE POLIMORFISMO
    SE USA UN MISMO METODO PERO QUE TIENE DIFERENTES COMPORTAMENTOS
    HACIENDO UNA REFERENCIA A LA CLASE PADRE EMPLEADO Y LLAMANDO SU METODO OBTENER DETALLES
    */
    
    public static void imprimir(Empleado empleado){
        System.out.println("= "+empleado.obtDetalles());
    
    }

}

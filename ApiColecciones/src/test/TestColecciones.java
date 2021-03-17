package test;

import java.util.ArrayList;
import java.util.List;

public class TestColecciones {
    public static void main(String[] args) {
        List lista=new ArrayList();
        lista.add("lunes");
        lista.add("martes");
        lista.add("miercoles");
        lista.add("jueves");
        lista.add("viernes");
        
        
        lista.forEach(elemento ->{System.out.println(""+elemento);});
        
        for(Object elemento: lista){
            System.out.println("lista = " + elemento);
        }
        
    }
}

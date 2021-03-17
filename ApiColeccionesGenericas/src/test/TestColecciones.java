package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        
        /*LISTA*/
        
        List <String>lista=new ArrayList<>();
        lista.add("lunes");
        lista.add("martes");
        lista.add("miercoles");
        lista.add("jueves");
        lista.add("viernes");
        String elementox =lista.get(1);
        
        //imprimir(lista);
        
        /*SET*/
        Set <String>miSet=new HashSet<>();
        miSet.add("LUNES");
        miSet.add("MARTES");
        miSet.add("MIERCOLES");
        miSet.add("JUEVES");
        //imprimir(miSet);
        
        /*MAP*/
        
        Map <String,String>miMapa=new HashMap<>(); /*ENTRE <> SE DEFINE EL TIPO DE LA COLECCION, EN ESTE CASO; STRING*/
        miMapa.put("valor1", "EDWARD");
        miMapa.put("VALOR2", "MARCOS");
        miMapa.put("valor3", "KAREN");
        miMapa.put("valor3", "eileen"); /*NO PERMITE VALORES DUPLICADOS, ENTONCES SE SUSTITUYE CON EL ULTIMO VALOR*/
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
        
        

        
    }
    
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento->{
            
        /*IMPRIMIR CON FUNCION FLECHA*/    
       // System.out.println("coleccion = " + coleccion);
        System.out.println("elemento = " + elemento);
        });
        
        /*IMPIRMIR CON FOREACH*/
        
        for(String Collection:coleccion){
            System.out.println("Collection = " + Collection);
        }
    
    }
}


package Test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado e1=new Empleado("edwardX", 20);
        Empleado e2=new Empleado("edward", 20);
        
        if(e1==e2){
            System.out.println("misma referencia en memoriA");
        }else{
            System.out.println("diferente referencia en memoria");
        }
        /*EQUALS*/
        
        if(e1.equals(e2)){
            System.out.println("tienen el mismo contenido");
        }
        else{
            System.out.println("tienen diferente contenido");
        }
        
        /*HASHCODE*/
        
        if(e1.hashCode()==e2.hashCode()){
            System.out.println("mismo hashcod" +e1.hashCode());
        }
        else{
            System.out.println("diferente hashcode"+e1.hashCode());
        }
        
    }
}

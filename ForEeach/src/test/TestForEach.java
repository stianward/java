package test;
public class TestForEach {
 
    public static void main(String[] args) {
        int edad[]={2,3,4,5};
        
        for(int edades:edad){
            System.out.println("edades = " + edades);
        }
        
        Persona personas[]={new Persona("xxx"),new Persona("Edward")};
        for(Persona obtPersonas:personas){
            System.out.println("obtPersonas = " + obtPersonas);
        }
    }
    
    
}


package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        numeros(1,2,3,4,5);
        
    }
    
    
    public static void numeros(int ...numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + numeros[i]);
            int val=numeros[i]*(i);
            System.out.println("val = " + val);
        }
    
    }
    
    
}

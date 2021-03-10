
package arrreglos;

import java.util.Scanner;

public class Arrreglos {

    public static void main(String[] args) {
 
        String frutas[][]={{"naranja","mandarina"},{"fresas","uvas","mora"}};
        
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                
                System.out.println("frutas: "+ren+" "+col+" :"+ frutas[ren][col]);
                
                
            }
        }
        
        
        
    }
    
}

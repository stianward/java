
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class Test {
    public static void main(String[] args) {
        
        FiguraGeometrica figura=new Rectangulo("RECTANGULO GRANDE");
        
        figura.dibujar();
        
    }
}

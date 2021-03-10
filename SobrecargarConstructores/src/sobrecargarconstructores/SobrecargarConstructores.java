
package sobrecargarconstructores;


public class SobrecargarConstructores {


    public static void main(String[] args) {

        Sobrecarga sc=new Sobrecarga("SSS", "1989", 2, 3);
        Automovil a=new Automovil();
      

        System.out.println("color: "+sc);
        System.out.println("CANTIAD DE RUEDAS:"+sc.getCantidadRuedas());
        
        System.out.println("x="+Automovil.x);
        
    }
    
}

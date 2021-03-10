package sobrecargarconstructores;

public class Sobrecarga extends Automovil{


    public Sobrecarga () {
            
        super();
    }
    public Sobrecarga(String color,String modelo,int cantru ,int año){
        this();
        this.color=color;
        this.modelo=modelo;
        this.cantidadRuedas=cantru;
        this.año=año;
  
       
       
    
    }

}

package beans;
public class Rectangulo {
    private int base,altura;
    
    public Rectangulo(){
    
    }
    
    public void setBase(int base){
    this.base=base;
    }
    public void setAltura(int altura){
        
        this.altura=altura;
    }
    public int getBase(){
    
        return this.base;
    }
    public int getAltura(){
        
        return this.altura;
    }
    
    public int getareaRectangulo(){
        
        return this.base*this.altura;
    }
    
}

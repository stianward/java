package enumeracion;

public enum Dias {
    AMERICA(12),
    AFRICA(4),
    EUROPA(2),
    ASIA(111);
    //la vairable se declara como privada y final por ser una constante.
//Esta variable se encargara de obtener el valor de ada numeracion
    private int numPaises;
   

    private Dias(int numPaises) {
        this.numPaises = numPaises;

    }
 //se declara un metodo publico para accededrlo desde afuera  
    public int Dias(int dat) {
        return this.numPaises;
    }

}

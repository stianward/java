package com.gm.mundopc;

public class Raton extends DispositivosEntrada {

    private int idRaton;
    private static int contadorRatones;
    
    public Raton(){
    this.idRaton=++Raton.contadorRatones;
        
    }
    
    
    public Raton(String tipoEntrada, String marca) {
     this();
     this.tipoEntrada=tipoEntrada;
     this.marca=marca;

    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones +" tipoEntrada:"+this.tipoEntrada+" marca: "+this.marca+ '}';
    }

}

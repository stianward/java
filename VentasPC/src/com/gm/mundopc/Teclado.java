package com.gm.mundopc;

public class Teclado extends DispositivosEntrada {

    private int idRTeclado;
    private static int contadorTeclados;

    public Teclado() {
        super();
        this.idRTeclado = ++Teclado.contadorTeclados;
    }

    public Teclado(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada=tipoEntrada;
        this.marca=marca;
       
        

    }

    @Override
    public String toString() {
        return "Teclado{" + "idRTeclado=" + idRTeclado +" tipoEntrada"+this.tipoEntrada+" marca: "+this.marca+ '}';
    }

 
}

package com.gm.mundopc;

public class DispositivosEntrada {

    protected String tipoEntrada;
    protected String marca;
    private static int contadorDispositivos;
    private int idProducto;
    public DispositivosEntrada(){
    
    this.idProducto=++DispositivosEntrada.contadorDispositivos;
    }
    
    public DispositivosEntrada(String tipoEntrada, String marca) {
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;

    }

    public String getTipoEntrada() {

        return this.tipoEntrada;
    }

    public void setEntrada(String entrada) {
        this.tipoEntrada = entrada;

    }

    public String getMarca() {

        return this.marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }

}

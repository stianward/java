package com.gm.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static int MAX_COMPUTADORAS = 2;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];//tamano del array
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {

            this.computadoras[this.contadorComputadoras++] = computadora;//INCREMENTA EL INDICE EN EL ARREGLO E INCREMENTA CONTADOR COMPUTADORAS

        } else {
            System.out.println("SUPERADO EL MAXIMO DE PRODUCTOS");
        }

    }

    public void mostrarOrden() {

        System.out.println("ID ORDEN: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("COMPUTADORA: " + this.computadoras[i]);
        }

    }

}

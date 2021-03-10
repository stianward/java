package com.gm.mundopc;

public class Monitor {

    private int idMonitor;
    private String Marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor() {

        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.Marca = marca;
        this.tamaño = tamaño;

    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", Marca=" + Marca + ", tama\u00f1o=" + tamaño + '}';
    }

}

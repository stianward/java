package sobrecargarconstructores;

public class Automovil {

    protected String color, modelo;
    protected int cantidadRuedas, año;
    public static int x=2;
    private int t;

    public Automovil() {
    }

    public Automovil(String color, String modelo, int cantidadRuedas, int año) {

        this.color = color;
        this.modelo = modelo;
        this.cantidadRuedas = cantidadRuedas;
        this.año = año;
        System.out.println("DATOS RECOLECTADOS");

    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadRuedas() {
        return this.cantidadRuedas*2;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getAño() {

        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}

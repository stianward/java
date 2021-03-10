package domain;

public class Empleado {

    protected String name;
    protected int edad;

    public Empleado(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String obtDetalles() {

        return this.name + " - " + this.edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}

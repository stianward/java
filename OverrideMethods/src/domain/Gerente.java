package domain;

public class Gerente extends Empleado {

    private int identification;

    public Gerente(String name, int edad, int identification) {
        super(name, edad);
        this.identification = identification;

    }

    @Override
    public String obtDetalles() {
        return super.obtDetalles() + " - " + this.identification;
    }

}

package domain;

public enum tiposEscritura {
    ESCRITURA_CLASICA("escritura a mano"),
    ESCRITURA_MODERNA("escritura digital");
    //la vairable se declara como privada y final por ser una constante.
//Esta variable se encargara de obtener el valor de cada numeracion
    private final String descripcion;




    private tiposEscritura(String descripcion) {
        this.descripcion = descripcion;

    }
//se declara un metodo publico para accededrlo desde afuera
    public String getDescripcion() {
        return this.descripcion;
    }
}


package domain;

public class Escritor extends Empleado{
    
    tiposEscritura tipoEscritura; //CREAMOS UN OBJETO DE TIPO_ESCRITURA DE LA ENUMERACION
    
    public Escritor(String name,int edad,tiposEscritura tipoEscritura){
    super(name,edad);
    this.tipoEscritura=tipoEscritura;
    }
    
    @Override
    public String obtDetalles(){
    return super.obtDetalles() +", tipo escritura "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+super.toString();
    }
    
    public tiposEscritura getTpoEscritura(){
    return this.tipoEscritura;
    }
}


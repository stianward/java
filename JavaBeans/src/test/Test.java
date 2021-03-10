package test;

import domain.PersonaBean;

public class Test {

    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("EDWARD");
        persona.setApellido("BARRIOS");
        System.out.println("persona = " + persona);
        System.out.println("NOMBRE" + persona.getNombre());
        System.out.println("APELLIDO" + persona.getApellido());
        
    }
}

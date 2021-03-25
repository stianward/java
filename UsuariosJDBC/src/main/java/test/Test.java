package test;

import datos.usuariosDAO;
import domain.Usuarios;

public class Test {
    
    public static void main(String[] args) {
        
        /*INSERTAR USUARIO*/
        Usuarios u=new Usuarios("christian BR", "roma234RR");
        usuariosDAO.insertar(u);
        
        /*ACTUALIZAR USUARIO*/
        Usuarios uAct=new Usuarios("EILEEN", "FOCA", 4);
        usuariosDAO.actualizar(uAct);
        
        /*ELIMINAR USUARIO*/
        Usuarios uElim=new Usuarios(7);
        usuariosDAO.eliminar(uElim);
        /*CONSULTAR USUARIO*/
        usuariosDAO.obtener().forEach(usuarios -> {
            System.out.println("usuarios = " + usuarios);
        });
        
    }
}

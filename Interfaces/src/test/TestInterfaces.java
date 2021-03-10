package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        IAccesoDatos datos=new ImplementacionMysql();
        //datos.listar();
        imprimir(datos);
        datos=new ImplementacionOracle();
        imprimir(datos);
        //datos.listar();
    }
    
    public static void imprimir(IAccesoDatos datos){
    datos.listar();
        
    }
    
    
}

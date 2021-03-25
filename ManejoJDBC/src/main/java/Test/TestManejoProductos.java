package Test;

import datos.productoDAO;
import domain.producto;

import java.util.List;

public class TestManejoProductos {

    public static void main(String[] args) {
        productoDAO pdao = new productoDAO();

//       producto p=new producto("20210303", "chaqueta roja GAP DE CREMALLERA", 15000, 20000);
//       pdao.insertar(p);
//      
//        producto p = new producto(1);
//        pdao.elmininar(p);
        producto p = new producto(2, "CHAQUETA NEGRA", "CHAQUETA NEGRA NIKE", 20000, 400000);
        pdao.actualizar(p);
        

        List<producto> prd = pdao.seleccionar();
        prd.forEach(item -> {
            System.out.println("producto = " + prd);
        });

    }

}

package accesodatos;
public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("LISTAR DESDE MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR DESDE MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("ELIMINAR DESDE MYSQL");
    }
    
}

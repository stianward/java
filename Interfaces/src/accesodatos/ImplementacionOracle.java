package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE oracle");
    }

    @Override
    public void listar() {
        System.out.println("listar DESDE oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar DESDE oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar DESDE oracle");
    }

}

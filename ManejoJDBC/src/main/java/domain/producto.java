package domain;
public class producto {
    private int id;
    private String referenciaProducto;
    private String nombreProducto;
    private double precioCosto;
    private double precioVenta;
    
    
    public producto(){
    }

    public producto(int id) {
        this.id = id;
    }

    public producto(String referenciaProducto, String nombreProducto, double precioCosto, double precioVenta) {
        this.referenciaProducto = referenciaProducto;
        this.nombreProducto = nombreProducto;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public producto(int id, String referenciaProducto, String nombreProducto, double precioCosto, double precioVenta) {
        this.id = id;
        this.referenciaProducto = referenciaProducto;
        this.nombreProducto = nombreProducto;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferenciaProducto() {
        return referenciaProducto;
    }

    public void setReferenciaProducto(String referenciaProducto) {
        this.referenciaProducto = referenciaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "producto{" + "id=" + id + ", referenciaProducto=" + referenciaProducto + ", nombreProducto=" + nombreProducto + ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
}

package domain;

public class Usuarios {

    private String usuario;
    private String password;
    private int id;

    public Usuarios(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;

    }

    public Usuarios(String usuario, String password, int id) {
        this.usuario = usuario;
        this.password = password;
        this.id = id;
    }

    public Usuarios(int id) {
        this.id = id;
    }
    

    public String getUsuario() {

        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", password=" + password + ", id=" + id + '}';
    }
    
    
}

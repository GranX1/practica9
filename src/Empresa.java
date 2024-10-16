import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nombre;
    private String telefono;
    private String direccion;
    private Flota flota;

    public Empresa(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.flota = new Flota();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Flota getFlota() {
        return flota;
    }
}

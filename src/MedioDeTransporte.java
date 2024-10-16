import java.util.ArrayList;
import java.util.List;

public abstract class MedioDeTransporte {
    protected String nombre;
    protected int id;
    protected int anioCreacion;
    protected List<Mantenimiento> historialMantenimientos;

    public MedioDeTransporte(String nombre, int id, int anioCreacion) {
        this.nombre = nombre;
        this.id = id;
        this.anioCreacion = anioCreacion;
        this.historialMantenimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public List<Mantenimiento> getHistorialMantenimientos() {
        return historialMantenimientos;
    }

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimientos.add(mantenimiento);
    }

    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();
}

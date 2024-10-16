import java.util.ArrayList;
import java.util.List;

class Flota {
    private List<MedioDeTransporte> mediosDeTransporte;

    public Flota() {
        this.mediosDeTransporte = new ArrayList<>();
    }

    public void agregarMedioDeTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.add(medio);
        System.out.println(medio.nombre + " ha sido agregado a la flota.");
    }

    public void eliminarMedioDeTransporte(MedioDeTransporte medio) {
        if (mediosDeTransporte.remove(medio)) {
            System.out.println(medio.nombre + " ha sido eliminado de la flota.");
        } else {
            System.out.println(medio.nombre + " no se encuentra en la flota.");
        }
    }

    public List<MedioDeTransporte> getMediosDeTransporte() {
        return mediosDeTransporte;
    }

    public int cantidadMediosDeTransporte() {
        return mediosDeTransporte.size();
    }
}

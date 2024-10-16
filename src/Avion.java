public class Avion extends MedioDeTransporteMecanico {
    public Avion(int id, int anioCreacion) {
        super("Avión", id, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println(nombre + " avanzando.");
    }

    @Override
    public void retroceder() {
        System.out.println(nombre + " retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println(nombre + " virando.");
    }
}

public class Bicicleta extends MedioDeTransporte {
    public Bicicleta(int id, int anioCreacion) {
        super("Bicicleta", id, anioCreacion);
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

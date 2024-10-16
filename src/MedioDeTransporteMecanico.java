public abstract class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombre, int id, int anioCreacion) {
        super(nombre, id, anioCreacion);
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(nombre + " encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(nombre + " apagado.");
    }

    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();
}

public class VehiculoTodoterreno extends MedioDeTransporteMecanico {
    public VehiculoTodoterreno(int id, int anioCreacion) {
        super("Vehículo Todo Terreno", id, anioCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println(nombre + " avanzando en terreno difícil.");
    }

    @Override
    public void retroceder() {
        System.out.println(nombre + " retrocediendo en terreno difícil.");
    }

    @Override
    public void virar() {
        System.out.println(nombre + " virando en terreno difícil.");
    }
}

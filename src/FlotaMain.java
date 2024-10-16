import java.util.List;

public class FlotaMain {
    public static void main(String[] args) {
        // Crear empresa con teléfono y dirección
        Empresa empresa = new Empresa("Turistas Felices", "6864253606", "Carretera Estatal No 1, Ejido Morelia B");

        // Crear medios de transporte
        Autobus autobus = new Autobus(1, 2015);
        Bicicleta bicicleta = new Bicicleta(2, 2020);
        Caballo caballo = new Caballo(3, 2018);
        Avion avion = new Avion(4, 2010);
        VehiculoTodoterreno todoterreno = new VehiculoTodoterreno(5, 2019);

        // Agregar medios de transporte a la flota
        empresa.getFlota().agregarMedioDeTransporte(autobus);
        empresa.getFlota().agregarMedioDeTransporte(bicicleta);
        empresa.getFlota().agregarMedioDeTransporte(caballo);
        empresa.getFlota().agregarMedioDeTransporte(avion);
        empresa.getFlota().agregarMedioDeTransporte(todoterreno);

        // Mostrar información de la empresa
        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Teléfono: " + empresa.getTelefono());
        System.out.println("Dirección: " + empresa.getDireccion());
        System.out.println();

        // Probar métodos
        for (MedioDeTransporte medio : empresa.getFlota().getMediosDeTransporte()) {
            System.out.println(medio.getNombre() + " está en la flota.");
            medio.avanzar();
            medio.retroceder();
            medio.virar();
            System.out.println("Historial de mantenimientos:");
            for (Mantenimiento mantenimiento : medio.getHistorialMantenimientos()) {
                mantenimiento.mostrarInfo();
            }
            System.out.println();
        }
    }
}

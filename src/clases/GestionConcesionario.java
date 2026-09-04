package clases;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar los vehículos
 * disponibles en el concesionario y registrar
 * las compras realizadas.
 *
 * @author Jeferson Alvarez
 */
public class GestionConcesionario {

    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Venta> ventas;

    /**
     * Constructor de la clase GestionConcesionario.
     */
    public GestionConcesionario() {

        vehiculos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    /**
     * Agrega un nuevo vehículo al concesionario.
     *
     * @param vehiculo vehículo que se desea agregar
     */
    public void agregarNuevoVehiculo(Vehiculo vehiculo) {

        vehiculos.add(vehiculo);
    }

   
}

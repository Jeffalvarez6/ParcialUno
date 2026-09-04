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

    /**
     * Registra una compra realizada por un cliente.
     *
     * @param comprador cliente que realiza la compra
     * @param vehiculo vehículo que se compra
     */
    public void registrarCompra(Cliente comprador, Vehiculo vehiculo) {

        if (vehiculos.contains(vehiculo)) {

            Venta nuevaVenta = new Venta(comprador, vehiculo);

            ventas.add(nuevaVenta);

            vehiculos.remove(vehiculo);

            System.out.println("Compra registrada correctamente.");
            System.out.println(nuevaVenta);

        } else {

            System.out.println(
                    "El vehículo no se encuentra disponible."
            );
        }
    }

    /**
     * Busca la compra de mayor valor.
     *
     * Recorre todas las ventas registradas y compara
     * el valor de cada una para encontrar la más alta.
     *
     * @return venta con el mayor valor
     */
    public Venta buscarCompraMasAlta() {

        if (ventas.isEmpty()) {

            return null;
        }

        Venta compraMasAlta = ventas.get(0);

        for (Venta venta : ventas) {

            if (venta.calcularValorVenta()
                    > compraMasAlta.calcularValorVenta()) {

                compraMasAlta = venta;
            }
        }

        return compraMasAlta;
    }

    /**
     * Obtiene la lista de vehículos disponibles.
     *
     * @return lista de vehículos
     */
    public ArrayList<Vehiculo> getVehiculos() {

        return vehiculos;
    }

    /**
     * Obtiene la lista de ventas realizadas.
     *
     * @return lista de ventas
     */
    public ArrayList<Venta> getVentas() {

        return ventas;
    }

    /**
     * Muestra todos los vehículos disponibles.
     */
    public void mostrarVehiculos() {

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println(vehiculo);
        }
    }

    /**
     * Muestra todas las ventas realizadas.
     */
    public void mostrarVentas() {

        for (Venta venta : ventas) {

            System.out.println(venta);
            System.out.println("--------------------------------");
        }
    }
   
}

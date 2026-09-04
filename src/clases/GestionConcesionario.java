package clases;

import java.util.ArrayList;


public class GestionConcesionario {


    private ArrayList<Vehiculo> vehiculos;

  
    public GestionConcesionario() {

        vehiculos = new ArrayList<>();
    }

  
    public void agregarNuevoVehiculo(Vehiculo vehiculo) {

        vehiculos.add(vehiculo);
    }

  
    public ArrayList<Vehiculo> getVehiculos() {

        return vehiculos;
    }

   
    public void mostrarVehiculos() {

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println(vehiculo);
        }
    }
}

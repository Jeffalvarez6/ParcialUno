package clases;

/**
 * Clase principal para probar la gestión
 * del concesionario.
 *
 * @author Jeferson Alvarez
 */
public class Main {

    public static void main(String[] args) {

      
        GestionConcesionario gestion =
                new GestionConcesionario();

        
        Auto auto = new Auto(
                "A001",
                "Mazda",
                (short) 2022,
                30000,
                45000000,
                (short) 4
        );

      
        Camioneta camioneta = new Camioneta(
                "C001",
                "Toyota",
                (short) 2023,
                20000,
                80000000,
                (short) 250
        );

     
        Motocicleta motocicleta = new Motocicleta(
                "M001",
                "Yamaha",
                (short) 2021,
                15000,
                12000000,
                (short) 250
        );

       
        gestion.agregarNuevoVehiculo(auto);
        gestion.agregarNuevoVehiculo(camioneta);
        gestion.agregarNuevoVehiculo(motocicleta);


        gestion.mostrarVehiculos();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import clases.Auto;
import clases.Camioneta;
import clases.Cliente;
import clases.Motocicleta;
import clases.Vehiculo;
import clases.Venta;
import java.util.ArrayList;

/**
 *
 * @author rodrigoaranda
 */
public class TestConcesionario {

    public static void main(String[] args) {

        ArrayList<Venta> registroVentas = new ArrayList<>();

        // caso 1: Vamos a vender un auto a un cliente
        Auto auto1 = new Auto("cod1", "mazda", (short) 2015, 1000, 5000000, Short.parseShort("4"));
        Cliente cliente1 = new Cliente((short) 12356, "Juanito Alimaña");
        Venta venta1 = new Venta(cliente1, auto1);
        registroVentas.add(venta1);
        //Caso 2: vamos a vender 2 vehiculos una camioneta y una moto a un cliente pasandolos como arreglo
        Cliente cliente2 = new Cliente((short) 172723, "Maria Casquitos");
        Motocicleta moto1 = new Motocicleta("cod2", "suzuki", (short) 2014, 10000, 7000000, (short) 180);
        Camioneta camioneta1 = new Camioneta("cod3", "toyota", (short) 2013, 5550, 6000000, (short) 10000);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(moto1);
        vehiculos.add(camioneta1);
        Venta venta2 = new Venta(cliente2, vehiculos);
        registroVentas.add(venta2);

        // Caso 3 : iniciamos la venta con un vehiculo y una vez creada le adicionamos otro
        Auto auto2 = new Auto("cod4", "Renault", (short) 2015, 0, 27000000, Short.parseShort("5"));
        Cliente cliente3 = new Cliente((short) 98723, "Pedro Navajas");
        Venta venta3 = new Venta(cliente3, auto2);
        Motocicleta moto2 = new Motocicleta("cod5", "Auteco", (short) 2015, 500, 9000000, (short) 220);
        venta3.adicionarVehiculo(moto2);
        registroVentas.add(venta3);
        
        //Vamos ahora a mostrar las ventas del día
         mostrarVentas(registroVentas);       
    }
    
    
    //mètodo para mostrar el contenido del arreglo que almacena las ventas
    public void mostrarVentas( ArrayList<Venta> ventas){
        for (Venta venta : ventas) {
            System.out.println(venta+"\n");
            
        }
    }

}

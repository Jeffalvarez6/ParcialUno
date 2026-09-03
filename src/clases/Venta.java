/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase registra una venta de uno mas vehiculos y calcula el valor de la
 * venta para ello es necesario tener un vehiculo y un cliente
 *
 * @see Vehiculo, Auto, Camioneta, Motocicleta
 * @author rodrigoaranda
 */
public class Venta {

    private Date fechaVenta = null;
    private Cliente comprador;
    private ArrayList<Vehiculo> vehiculosVendidos=new ArrayList<>();
    private long valorVenta=0;  // variable auxiliar local por lo cual no requiere get ni set

  //como mínimo para realizar una venta se requiere de un comprador y uno o mas vehiculos
  // se ha sobrecargado el metodo constructor para considerar las dos situaciones
    public Venta(Cliente comprador, Vehiculo vehiculoVendido) {
        fechaVenta = new Date();
        this.comprador = comprador;
        this.vehiculosVendidos.add(vehiculoVendido);
    }

    public Venta(Cliente comprador, ArrayList<Vehiculo> vehiculosVendidos) {
        fechaVenta = new Date();   // se toma la hora del sistema
        this.comprador = comprador;
        this.vehiculosVendidos = vehiculosVendidos;
    }

    public String getFechaVenta() {
       // con esta Clase le estamos dando formato a la fecha ya que por default el formato es: 
       // Thu Aug 20 10:56:51 COT 2015
        SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
        return formato.format(fechaVenta);
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Vehiculo> getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    // este metodo cambia la asiganción porque los vehiculos unicamente se pasan al registrar la venta. de lo contrario no se deben pasar
    // lo que se puede hacer es adicionar elementos a la venta
    public void setVehiculosVendidos(ArrayList<Vehiculo> vehiculosVendidos) {
        this.vehiculosVendidos.addAll(vehiculosVendidos);
    }

    public void adicionarVehiculo(Vehiculo vehiculo) {
        vehiculosVendidos.add(vehiculo);

    }
    
    public long calcularValorVenta(){
        for (Vehiculo vehiculoTemp : vehiculosVendidos) {
            valorVenta+=vehiculoTemp.getPrecioUnitario();
        }
        return valorVenta;
    }

    // vamos a sobre escribir el método toString para que nos muestre el detalle de la venta
    // Para dar formato al valor de la venta, vamos a utilizar la clase DecimalFormat que requiere un patron de como se mostrara la cantidad

    @Override
    public String toString() {
        return "Detalle de Venta : " + " \n Fecha de Venta=" + getFechaVenta() + " \n " + comprador + " \n Vehiculos Vendidos : \n" + vehiculosVendidos + " \n Total a Pagar = "+new DecimalFormat("$ ###,###.##").format(calcularValorVenta()) ;
    }
    
    
}

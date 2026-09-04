package clases;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private Date fechaVenta = null;
    private Cliente comprador;
    private ArrayList<Vehiculo> vehiculosVendidos = new ArrayList<>();
    private long valorVenta = 0;


    public Venta(Cliente comprador, Vehiculo vehiculoVendido) {

        fechaVenta = new Date();
        this.comprador = comprador;
        this.vehiculosVendidos.add(vehiculoVendido);
    }

   
    public Venta(Cliente comprador,
                 ArrayList<Vehiculo> vehiculosVendidos) {

        fechaVenta = new Date();
        this.comprador = comprador;
        this.vehiculosVendidos = vehiculosVendidos;
    }

 
    public String getFechaVenta() {

        SimpleDateFormat formato =
                new SimpleDateFormat("dd-MM-yyyy");

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

    public void setVehiculosVendidos(
            ArrayList<Vehiculo> vehiculosVendidos) {

        this.vehiculosVendidos.addAll(vehiculosVendidos);
    }

  
    public void adicionarVehiculo(Vehiculo vehiculo) {

        vehiculosVendidos.add(vehiculo);
    }

   
    public long calcularValorVenta() {

        valorVenta = 0;

        for (Vehiculo vehiculoTemp : vehiculosVendidos) {

            valorVenta += vehiculoTemp.getPrecioUnitario();
        }

        return valorVenta;
    }

    
    @Override
    public String toString() {

        return "Detalle de Venta : "
                + "\nFecha de Venta = " + getFechaVenta()
                + "\n" + comprador
                + "\nVehiculos Vendidos : \n"
                + vehiculosVendidos
                + "\nTotal a Pagar = "
                + new DecimalFormat("$ ###,###.##")
                        .format(calcularValorVenta());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author rodrigoaranda
 */
public class Auto extends Vehiculo{
    private short numeroPuertas;

    public Auto(String código, String marca, short modelo, int kilometraje, int precioUnitario, short numberDoors) {
        super(código, marca, modelo, kilometraje, precioUnitario);
        this.numeroPuertas=numberDoors;
    }   

    public short getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(short numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    
    @Override
    public String toString() {
        return "Vehiculo tipo Auto : " + super.toString()+" Número puertas = "+numeroPuertas+"\n";
    }
    
    
}

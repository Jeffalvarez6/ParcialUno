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
public class Motocicleta extends Vehiculo{
    private short cilindraje;

    public Motocicleta(String código, String marca, short modelo, int kilometraje, int precioUnitario, short cilindraje) {
        //indica que estos datos pertenecen a la superclase
        super(código, marca, modelo, kilometraje, precioUnitario);
        this.cilindraje=cilindraje;
        
    }

    public short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return  " Vehiculo tipo Motocicleta :  " + super.toString()+" cilindraje = " + cilindraje+"\n";
    }
    
    
    
}

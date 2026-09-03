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
public class Camioneta extends Vehiculo {
    private short potencia;

    public Camioneta(String código, String marca, short modelo, int kilometraje, int precioUnitario, short potencia) {
        super(código, marca, modelo, kilometraje, precioUnitario);
        this.potencia=potencia;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {       
        return  " Vehiculo tipo Camioneta : " + super.toString()+" potencia = " + potencia+"\n";
    }
    
    
    
}

package clases;

/**
 * Clase que representa una camioneta.
 *
 * Hereda los atributos y métodos de la clase Vehiculo
 * y agrega la potencia.
 *
 * @author Jeferson Alvarez
 */
public class Camioneta extends Vehiculo {

    private short potencia;

  
    public Camioneta(String código, String marca, short modelo,
                     int kilometraje, int precioUnitario,
                     short potencia) {

        super(código, marca, modelo, kilometraje, precioUnitario);
        this.potencia = potencia;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Vehiculo tipo Camioneta : "
                + super.toString()
                + ", potencia = "
                + potencia
                + "\n";
    }
}

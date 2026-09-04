package clases;

/**
 * Clase que representa una motocicleta.
 *
 * Hereda los atributos y métodos de la clase Vehiculo
 * y agrega el cilindraje.
 *
 * @author Jeferson Alvarez
 */
public class Motocicleta extends Vehiculo {

    private short cilindraje;

    public Motocicleta(String código, String marca, short modelo,
                       int kilometraje, int precioUnitario,
                       short cilindraje) {

        super(código, marca, modelo, kilometraje, precioUnitario);
        this.cilindraje = cilindraje;
    }

    public short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Vehiculo tipo Motocicleta : "
                + super.toString()
                + ", cilindraje = "
                + cilindraje
                + "\n";
    }
}

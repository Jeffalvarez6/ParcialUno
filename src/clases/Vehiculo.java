package clases;

/**
 * Clase base que representa un vehículo.
 *
 * Esta clase es utilizada como superclase para:
 * Auto, Camioneta y Motocicleta.
 *
 * @author Jeferson Alvarez
 */
public class Vehiculo {

    private String código;
    private String marca;
    private short modelo;
    private int kilometraje;
    private int precioUnitario;

  
    public Vehiculo(String código, String marca, short modelo,
                    int kilometraje, int precioUnitario) {

        this.código = código;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precioUnitario = precioUnitario;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public short getModelo() {
        return modelo;
    }

    public void setModelo(short modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "código = " + código
                + ", marca = " + marca
                + ", modelo = " + modelo
                + ", kilometraje = " + kilometraje
                + ", precioUnitario = " + precioUnitario;
    }
}

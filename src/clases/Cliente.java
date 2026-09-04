package clases;

/**
 * Clase que representa a un cliente del concesionario.
 *
 * @author Jeferson Alvarez
 */
public class Cliente {

    private short documentoIdentidad;
    private String nombreCompleto;

    public Cliente(short documentoIdentidad, String nombreCompleto) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
    }

    public short getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(short documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Datos del Cliente : "
                + "Cedula = " + documentoIdentidad
                + ", Nombre Completo = " + nombreCompleto;
    }
}

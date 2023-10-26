package Entidades;

/**
 * @author Ivana
 */
public class Pasaje {
    
    private int idPasaje;
    private String tipoTransporte;
    private double importe;
    private Ciudad nombre;
    private boolean estado;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, String tipoTransporte, double importe, Ciudad nombre, boolean estado) {
        this.idPasaje = idPasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getNombre() {
        return nombre;
    }

    public void setNombre(Ciudad nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + idPasaje + " - " + tipoTransporte + ", $" + importe + "";
    }
    
}

package Entidades;

import java.time.LocalDate;

/**
 * @author Ivana
 */
public class Alojamiento {
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOn;
    private boolean estado;
    private String tipo;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDestino;

    public Alojamiento() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOn, boolean estado,String tipo, String servicio, double importeDiario, Ciudad ciudadDestino) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.tipo = tipo;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOn, boolean estado,String tipo, String servicio, double importeDiario, Ciudad ciudadDestino) {
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.tipo = tipo;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOn() {
        return fechaOn;
    }

    public void setFechaOn(LocalDate fechaOn) {
        this.fechaOn = fechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", fechaIn=" + fechaIn + ", fechaOn=" + fechaOn + ", estado=" + estado + ", servicio=" + servicio + ", importeDiario=" + importeDiario + ", ciudadDestino=" + ciudadDestino + '}';
    }
    
               
       
    
}

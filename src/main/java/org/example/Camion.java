package org.example;

public class Camion {
    private int codigoCamion;
    private String patente;
    private String descripcion;
    private String estado; // "out of service" o "on service”
    private Sucursal sucursalAsociada;
    public Camion(int codigoCamion, String patente, String estado, Sucursal sucursalAsociada) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.estado = estado;
        this.sucursalAsociada = sucursalAsociada;
    }
    public int getCodigoCamion() {
        return codigoCamion;
    }

    public void setCodigoCamion(int codigoCamion) {
        this.codigoCamion = codigoCamion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sucursal getSucursalAsociada() {
        return sucursalAsociada;
    }

    public void setSucursalAsociada(Sucursal sucursalAsociada) {
        this.sucursalAsociada = sucursalAsociada;
    }
}

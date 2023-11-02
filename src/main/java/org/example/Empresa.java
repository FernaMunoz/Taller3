package org.example;
import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private String nombreComercial;
    private String direccion;
    List<Sucursal> sucursales;

    public Empresa(String nombreComercial, String direccion) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.sucursales = new ArrayList<>();
    }
    public String getNombreComercial() {
        return this.nombreComercial;
    }
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
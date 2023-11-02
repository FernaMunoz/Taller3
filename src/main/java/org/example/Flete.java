package org.example;

import java.util.List;

public class Flete {
    private int codigoFlete;
    private String descripcion;

    private Camion camionAsociado;
    private Pack listaPacks;
    public Flete(int codigoFlete, String descripcion, Camion camionAsociado, Pack listaPacks) {
        this.codigoFlete = codigoFlete;
        this.descripcion = descripcion;
        this.camionAsociado = camionAsociado;
        this.listaPacks = listaPacks;
    }

    public int calcularPrecio() {
        //return listaPacks.size() * 5000;  determinar cuántos productos hay en la lista packs y multiplicar esa cantidad por 5000 (cada producto cuesta 5000 su transporte)
        return 0;
    }

    public int getCodigoFlete() {
        return codigoFlete;
    }

    public void setCodigoFlete(int codigoFlete) {
        this.codigoFlete = codigoFlete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Camion getCamionAsociado() {
        return camionAsociado;
    }

    public void setCamionAsociado(Camion camionAsociado) {
        this.camionAsociado = camionAsociado;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int codigoSucursal;
    private String regionAsociada;
    private Empresa empresaAsociada;
    List<Camion> camiones;
    public Sucursal(int codigoSucursal, String regionAsociada, Empresa empresaAsociada) {
        this.codigoSucursal = codigoSucursal;
        this.regionAsociada = regionAsociada;
        this.empresaAsociada = empresaAsociada;
        this.camiones = new ArrayList<>();
    }
    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegionAsociada() {
        return regionAsociada;
    }

    public void setRegionAsociada(String regionAsociada) {
        this.regionAsociada = regionAsociada;
    }

    public Empresa getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(Empresa empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

}

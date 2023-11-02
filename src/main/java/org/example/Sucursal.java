package org.example;

public class Sucursal {
    private int codigoSucursal;
    private String regionAsociada;
    private Empresa empresaAsociada;
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

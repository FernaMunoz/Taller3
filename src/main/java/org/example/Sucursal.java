package org.example;
public class Sucursal {

	private int codigoSucursal;
	private String regionAsociada;
	private Empresa empresaAsociada;

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getRegionAsociada() {
		return this.regionAsociada;
	}

	public void setRegionAsociada(String regionAsociada) {
		this.regionAsociada = regionAsociada;
	}

	public Empresa getEmpresaAsociada() {
		return this.empresaAsociada;
	}

	public void setEmpresaAsociada(Empresa empresaAsociada) {
		this.empresaAsociada = empresaAsociada;
	}

}
package org.example;
public class Producto {

	private int codigoProducto;
	private String tipoProducto;

	public Producto(int codigoProducto, String tipoProducto) {
		this.codigoProducto = codigoProducto;
		this.tipoProducto = tipoProducto;
	}
	public int getCodigoProducto() {
		return this.codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getTipoProducto() {
		return this.tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

}
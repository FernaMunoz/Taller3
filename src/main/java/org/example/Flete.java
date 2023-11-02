package org.example;
public class Flete {

	private int codigoFlete;
	private String descripcion;
	private Camion camionAsociado;
	private Pack listaPacks;

	public int getCodigoFlete() {
		return this.codigoFlete;
	}

	public void setCodigoFlete(int codigoFlete) {
		this.codigoFlete = codigoFlete;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Camion getCamionAsociado() {
		return this.camionAsociado;
	}
	public void setCamionAsociado(Camion camionAsociado) {
		this.camionAsociado = camionAsociado;
	}

	public void calcularPrecio() {

		throw new UnsupportedOperationException();
	}

	public void agregarProducto(Producto producto) {

		throw new UnsupportedOperationException();
	}

	public void quitarProducto(Producto producto) {

		throw new UnsupportedOperationException();
	}

}
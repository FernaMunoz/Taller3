package org.example;
import java.util.ArrayList;
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
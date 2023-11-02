package org.example;
import java.util.List;

public class Flete {
	private int codigoFlete;
	private String descripcion;
	private Camion camionAsociado;
	private List<Pack> listaPacks;

	public Flete(int codigoFlete, String descripcion, Camion camionAsociado, List<Pack> listaPacks) {
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

	public void agregarPack(Pack pack) {
		listaPacks.add(pack);
	}

	public void quitarPack(Pack pack) {
		listaPacks.remove(pack);
	}

	public double calcularPrecioTotal() {
		int cantidadProductos = 0;

		for (Pack pack : listaPacks) {
			cantidadProductos += pack.getListaProductos().size();
		}

		double precioPorProducto = 5000.0;
		double precioTotal = cantidadProductos * precioPorProducto;

		return precioTotal;
	}
}

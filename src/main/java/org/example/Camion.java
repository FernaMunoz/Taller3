package org.example;
import java.util.ArrayList;
import java.util.List;
public class Camion {

	private int codigoCamion;
	private String patente;
	private String descripcion;
	private String estado;
	private Sucursal sucursalAsociada;
	public Camion(int codigoCamion, String patente, String descripcion, String estado, Sucursal sucursalAsociada) {
		this.codigoCamion = codigoCamion;
		this.patente = patente;
		this.descripcion = descripcion;
		this.estado = estado;
		this.sucursalAsociada = sucursalAsociada;
	}
	public int getCodigoCamion() {
		return this.codigoCamion;
	}

	public void setCodigoCamion(int codigoCamion) {
		this.codigoCamion = codigoCamion;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void agregarNuevoCamion(int codigoCamion, String patente, String descripcion, int estado, Sucursal sucursal) {
		// TODO - implement Camion.agregarNuevoCamion
		throw new UnsupportedOperationException();
	}

	public void desvincularCamion() {
		// TODO - implement Camion.desvincularCamion
		throw new UnsupportedOperationException();
	}

	public void estadoCamion() {
		// TODO - implement Camion.estadoCamion
		throw new UnsupportedOperationException();
	}

}
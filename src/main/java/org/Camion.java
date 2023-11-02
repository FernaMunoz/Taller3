public class Camion {

	private int codigoCamion;
	private string patente;
	private string descripcion;
	private string estado;
	private Sucursal sucursalAsociada;

	public int getCodigoCamion() {
		return this.codigoCamion;
	}

	/**
	 * 
	 * @param codigoCamion
	 */
	public void setCodigoCamion(int codigoCamion) {
		this.codigoCamion = codigoCamion;
	}

	public string getPatente() {
		return this.patente;
	}

	/**
	 * 
	 * @param patente
	 */
	public void setPatente(string patente) {
		this.patente = patente;
	}

	public string getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(string descripcion) {
		this.descripcion = descripcion;
	}

	public string getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(string estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @param codigoCamion
	 * @param patente
	 * @param descripcion
	 * @param estado
	 * @param sucursal
	 */
	public void agregarNuevoCamion(int codigoCamion, string patente, string descripcion, int estado, Sucursal sucursal) {
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
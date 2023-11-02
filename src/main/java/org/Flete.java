public class Flete {

	private int codigoFlete;
	private string descripcion;
	private Camion camionAsociado;
	private Pack listaPacks;

	public int getCodigoFlete() {
		return this.codigoFlete;
	}

	/**
	 * 
	 * @param codigoFlete
	 */
	public void setCodigoFlete(int codigoFlete) {
		this.codigoFlete = codigoFlete;
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

	public Camion getCamionAsociado() {
		return this.camionAsociado;
	}

	/**
	 * 
	 * @param camionAsociado
	 */
	public void setCamionAsociado(Camion camionAsociado) {
		this.camionAsociado = camionAsociado;
	}

	public void calcularPrecio() {
		// TODO - implement Flete.calcularPrecio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto) {
		// TODO - implement Flete.agregarProducto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public void quitarProducto(Producto producto) {
		// TODO - implement Flete.quitarProducto
		throw new UnsupportedOperationException();
	}

}
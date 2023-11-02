public class Sucursal {

	private int codigoSucursal;
	private string regionAsociada;
	private Empresa empresaAsociada;

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	/**
	 * 
	 * @param codigoSucursal
	 */
	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public string getRegionAsociada() {
		return this.regionAsociada;
	}

	/**
	 * 
	 * @param regionAsociada
	 */
	public void setRegionAsociada(string regionAsociada) {
		this.regionAsociada = regionAsociada;
	}

	public Empresa getEmpresaAsociada() {
		return this.empresaAsociada;
	}

	/**
	 * 
	 * @param empresaAsociada
	 */
	public void setEmpresaAsociada(Empresa empresaAsociada) {
		this.empresaAsociada = empresaAsociada;
	}

}
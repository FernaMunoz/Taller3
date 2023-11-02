package org.example;

class Empresa {

    private String nombreComercial;
    private String direccion;

    public String getNombreComercial() {
        return this.nombreComercial;
    }


    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return this.direccion;
    }


    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

}

class Camion {

    private int codigoCamion;
    private String patente;
    private String descripcion;
    private String estado;
    private Sucursal sucursalAsociada;

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

    }

    public void desvincularCamion() {

    }

    public void estadoCamion() {

    }
}

class Sucursal {

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

    /**
     *
     * @param empresaAsociada
     */
    public void setEmpresaAsociada(Empresa empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

}

class Flete {

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

    }

    public void agregarProducto(Producto producto) {

    }


    public void quitarProducto(Producto producto) {

    }

}
class Pack {

    private int listaProducto;

}

class Producto {

    private int codigoProducto;
    private String tipoProducto;
    public String nombre;
    public int stock;
    public CodigoBarra codigoBarra;
    public int precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

    public int getCodigoBarra() {

    }


    public void setCodigoBarra(int codigoBarra) {

    }


    public void venderProductos(int cantidad) {

    }


    public boolean verifcarDisponibilidad(int cantidad) {

    }


    public void aplicarDescuento(double descuento) {

    }

}
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
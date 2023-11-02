package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


    public void setSucursalAsociada(Sucursal sucursal) {
        this.sucursalAsociada = sucursal;
    }
}

class Sucursal {

    private int codigoSucursal;
    private String regionAsociada;
    private Empresa empresaAsociada;

    private List<Camion> camiones = new ArrayList<>();

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

    public void agregarCamion(Camion nuevoCamion) {

        nuevoCamion.setSucursalAsociada(this);
        camiones.add(nuevoCamion);
    }


    public void estadoCamion() {
        System.out.println("Estado de los camiones en esta sucursal:");
        for (Camion camion : camiones) {
            System.out.println("Código del Camión: " + camion.getCodigoCamion());
            System.out.println("Patente: " + camion.getPatente());
            System.out.println("Estado: " + camion.getEstado());
            System.out.println("-----------------------------");
        }

    }

    public void devincularCamion(Camion camion) {
        camion.setSucursalAsociada(null);
        camiones.remove(camion);
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

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Empresa
        System.out.println("Ingrese el nombre comercial de la empresa:");
        String nombreComercial = scanner.nextLine();
        System.out.println("Ingrese la dirección de la empresa:");
        String direccion = scanner.nextLine();
        Empresa empresa = new Empresa();
        empresa.setNombreComercial(nombreComercial);
        empresa.setDireccion(direccion);

        // Crear la primera sucursal del objeto Empresa
        System.out.println("Ingrese el código de la sucursal:");
        int codigoSucursal = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Ingrese la región asociada a la sucursal:");
        String regionAsociada = scanner.nextLine();
        Sucursal sucursal = new Sucursal();
        sucursal.setCodigoSucursal(codigoSucursal);
        sucursal.setRegionAsociada(regionAsociada);
        sucursal.setEmpresaAsociada(empresa);

        // Asociar el primer camión a la Sucursal
        System.out.println("Ingrese el código del camión:");
        int codigoCamion = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Ingrese la patente del camión:");
        String patente = scanner.nextLine();
        System.out.println("Seleccione el estado del camión: 1 para \"out of service\", 2 para \"on service\"");
        int opcionEstado = scanner.nextInt();
        String estado;
        if (opcionEstado == 1) {
            estado = "out of service";
        } else if (opcionEstado == 2) {
            estado = "on service";
        } else {
            System.out.println("Opción no válida. Se asignará por defecto \"out of service\"");
            estado = "out of service";
        }

        Camion camion = new Camion();
        camion.setCodigoCamion(codigoCamion);
        camion.setPatente(patente);
        camion.setEstado(estado);
        camion.setSucursalAsociada(sucursal);
        sucursal.agregarCamion(camion);
        sucursal.devincularCamion(camion);
        sucursal.estadoCamion();


        System.out.println("\nDetalles de la Empresa:");
        System.out.println("Nombre Comercial: " + empresa.getNombreComercial());
        System.out.println("Dirección: " + empresa.getDireccion());


        System.out.println("\nDetalles de la Sucursal:");
        System.out.println("Código de Sucursal: " + sucursal.getCodigoSucursal());
        System.out.println("Región Asociada: " + sucursal.getRegionAsociada());


        System.out.println("\nDetalles del Camión:");
        System.out.println("Código del Camión: " + camion.getCodigoCamion());
        System.out.println("Patente: " + camion.getPatente());
        System.out.println("Estado: " + camion.getEstado());
    }
}
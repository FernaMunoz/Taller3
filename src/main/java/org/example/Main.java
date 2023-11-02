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
    private String estado; // "out of service" o "on service”
    private Sucursal sucursalAsociada;
    public Camion(int codigoCamion, String patente, String estado, Sucursal sucursalAsociada) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.estado = estado;
        this.sucursalAsociada = sucursalAsociada;
    }
    public int getCodigoCamion() {
        return codigoCamion;
    }

    public void setCodigoCamion(int codigoCamion) {
        this.codigoCamion = codigoCamion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sucursal getSucursalAsociada() {
        return sucursalAsociada;
    }

    public void setSucursalAsociada(Sucursal sucursalAsociada) {
        this.sucursalAsociada = sucursalAsociada;
    }

}

class Sucursal {
    private int codigoSucursal;
    private String regionAsociada;
    private Empresa empresaAsociada;
    List<Camion> camiones;
    public Sucursal(int codigoSucursal, String regionAsociada, Empresa empresaAsociada) {
        this.codigoSucursal = codigoSucursal;
        this.regionAsociada = regionAsociada;
        this.empresaAsociada = empresaAsociada;
        this.camiones = new ArrayList<>();
    }
    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegionAsociada() {
        return regionAsociada;
    }

    public void setRegionAsociada(String regionAsociada) {
        this.regionAsociada = regionAsociada;
    }

    public Empresa getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(Empresa empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }
    public void agregarCamion(Camion nuevoCamion) {

        nuevoCamion.setSucursalAsociada(this);
        camiones.add(nuevoCamion);
    }
    public void quitarCamion(Camion camion) {
        camion.setSucursalAsociada(null);
        camiones.remove(camion); 
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
        Empresa empresa = new Empresa(nombreComercial, direccion);

        // Crear la primera sucursal del objeto Empresa
        System.out.println("Ingrese el código de la sucursal:");
        int codigoSucursal = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Ingrese la región asociada a la sucursal:");
        String regionAsociada = scanner.nextLine();
        Sucursal sucursal = new Sucursal(codigoSucursal, regionAsociada, empresa);

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

        Camion camion = new Camion(codigoCamion, patente, estado, sucursal);

        // Imprimir los detalles de la Empresa
        System.out.println("\nDetalles de la Empresa:");
        System.out.println("Nombre Comercial: " + empresa.getNombreComercial());
        System.out.println("Dirección: " + empresa.getDireccion());

        // Imprimir los detalles de la Sucursal
        System.out.println("\nDetalles de la Sucursal:");
        System.out.println("Código de Sucursal: " + sucursal.getCodigoSucursal());
        System.out.println("Región Asociada: " + sucursal.getRegionAsociada());

        // Imprimir los detalles del Camión
        System.out.println("\nDetalles del Camión:");
        System.out.println("Código del Camión: " + camion.getCodigoCamion());
        System.out.println("Patente: " + camion.getPatente());
        System.out.println("Estado: " + camion.getEstado());

        // Menú para agregar un nuevo camión a una sucursal
        while (true) {
            System.out.println("\n¿Deseas agregar un nuevo camión a una sucursal? (1: Sí, 2: No)");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            if (opcion == 1) {
                // Solicitar los detalles del nuevo camión
                System.out.println("Ingrese el código del nuevo camión:");
                int codigoCamionNuevo = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                System.out.println("Ingrese la patente del nuevo camión:");
                String patenteNuevo = scanner.nextLine();
                System.out.println("Seleccione el estado del nuevo camión: 1 para \"out of service\", 2 para \"on service\"");
                int opcionEstadoNuevo = scanner.nextInt();
                String estadoNuevo;
                if (opcionEstadoNuevo == 1) {
                    estadoNuevo = "out of service";
                } else if (opcionEstadoNuevo == 2) {
                    estadoNuevo = "on service";
                } else {
                    System.out.println("Opción no válida. Se asignará por defecto \"out of service\"");
                    estadoNuevo = "out of service";
                }

                // Crear el nuevo camión y agregarlo a la sucursal
                Camion nuevoCamion = new Camion(codigoCamionNuevo, patenteNuevo, estadoNuevo, sucursal);
                sucursal.agregarCamion(nuevoCamion);

                System.out.println("¡Nuevo camión agregado exitosamente!");
            } else if (opcion == 2) {
                break; // Salir del bucle y terminar el programa
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }
}
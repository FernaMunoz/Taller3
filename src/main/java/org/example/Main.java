package org.example;
import java.util.Scanner;

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
    }
}

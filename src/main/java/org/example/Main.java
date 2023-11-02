package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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

        // Menú principal
        while (true) {
            System.out.println("\n¿Qué te gustaría hacer?");
            System.out.println("1. Agregar un nuevo camión a una sucursal");
            System.out.println("2. Realizar un flete");
            System.out.println("3. Finalizar");
            int opcionMenu = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            if (opcionMenu == 1) {
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
            } else if (opcionMenu == 2) {
                // Crear los packs de productos
                List<Pack> packs = new ArrayList<>();
                for (int i = 0; i < 5; i++) { // Límite de 5 packs
                    Pack pack = new Pack();
                    for (int j = 0; j < 20; j++) { // Cada pack es de 20 productos
                        System.out.println("Ingrese el código del producto " + (j+1) + " del pack " + (i+1) + ":");
                        int codigoProducto = scanner.nextInt();
                        scanner.nextLine(); // consume newline left-over
                        System.out.println("Ingrese el tipo del producto " + (j+1) + " del pack " + (i+1) + ":");
                        String tipoProducto = scanner.nextLine();

                        Producto producto = new Producto();
                        producto.setCodigoProducto(codigoProducto);
                        producto.setTipoProducto(tipoProducto);

                        pack.getProductos().add(producto);
                    }
                    packs.add(pack);
                }

                // Seleccionar la sucursal asociada
                System.out.println("Ingrese el código de la sucursal asociada al flete:");
                int codigoSucursalFlete = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                Sucursal sucursalFlete = null;
                for (Sucursal suc : empresa.getSucursales()) {
                    if (suc.getCodigoSucursal() == codigoSucursalFlete) {
                        sucursalFlete = suc;
                        break;
                    }
                }

                if (sucursalFlete == null) {
                    System.out.println("No se encontró ninguna sucursal con el código proporcionado.");
                    continue;
                }

                // Seleccionar un camión en estado "on service" asociado a la sucursal
                Camion camionFlete = null;
                for (Camion cam : sucursalFlete.getCamiones()) {
                    if ("on service".equals(cam.getEstado())) {
                        camionFlete = cam;
                        break;
                    }
                }

                if (camionFlete == null) {
                    System.out.println("No se encontró ningún camión en estado \"on service\" en la sucursal seleccionada.");
                    continue;
                }

                // Crear el flete y asociarlo al camión seleccionado
                System.out.println("Ingrese el código del flete:");
                int codigoFlete = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                System.out.println("Ingrese la descripción del flete:");
                String descripcionFlete = scanner.nextLine();

                Flete flete = new Flete(codigoFlete, descripcionFlete, camionFlete, packs.get(0)); // Asociar el primer pack al flete
                camionFlete.setFletes(flete);

                System.out.println("¡Flete realizado exitosamente!");
            } else if (opcionMenu == 3) {
                break; // Salir del bucle y terminar el programa
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }
}


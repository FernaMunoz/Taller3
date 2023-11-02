package org.example;

import java.util.List;

public class Flete {
    private int codigoFlete;
    private String descripcion;
    private List<Pack> listaPacks; // lista de cada vez que se cree un pack de max 20 agregar aca
    private Camion camionAsociado;

    public int calcularPrecio() {
        return listaPacks.size() * 5000; // determinar cuántos productos hay en la lista packs y multiplicar esa cantidad por 5000 (cada producto cuesta 5000 su transporte)
    }

    // agregarProducto y quitarProducto métodos
}

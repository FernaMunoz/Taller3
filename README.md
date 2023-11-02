# Taller3

Identificar clases:

clase Empresa
atributos:
String nombreComercial
String dirección
clase Camion
atributos:

int codigoCamion 
String patente
String descripcion 
String estado // "out of service" o "on service”
Sucursal sucursalAsociada
clase Sucursal
atributos:
int codigoSucursal
String regionAsociada
Empresa empresaAsociada

    -  clase Flete
            atributos:

int codigoFlete
String descripción
listaPacks// lista de cada vez que se cree un pack de max 20 agregar aca 
Camion CamionAsociado
metodo:
calcularPrecio()// determinar cuantos productos hay en la lista packs y multiplicar esa cantidad por 5000 (cada producto cuesta 5000 su transporte)


- clase Producto
           atributos:
int codigoProducto
String tipoProducto
- clase Pack
             atributos:
ListaProductos//max 20 
- menu(Main)

// primero le pide al usuario los datos para crear un objeto empresa
//después le pide los datos para crear la primera sucursal del objeto empresa creado anteriormente 
después le pide los datos para asociar el primer camión a la sucursal 
//opción realizar un flete, primero consultar por los productos y cuando sean 20 crear un pack, hasta llegar al límite de 5 packs (cada pack es de 20 productos) y preguntar la sucursal asociada y posteriormente mostrar de opción de camiones asociados a la sucursal en estado “on service” para seleccionar uno
por último mostrar el precio del flete usando el método calcular Precio() del flete 
//opción AgregarCamion, primero consultar a que sucursal le quiere agregar un camión 
//opción desvincular camión de una sucursal 
//opción agregar producto a un flete 
//opción quitar producto a un flete
//opción cambiar de estado a un camión 
// opción calcular precio a un flete determinado 


Relación entre clases:

Empresa (1) - Sucursal(1..*)  //asociacion
(Sin una Sucursal no puede haber una empresa y viceversa)

Sucursal (1) - Camión (1..*) // agregación
( Una sucursal está asociada a al menos un camion)

Camión(1) - Fletes (*) // asociación
(Un camión está asociado a varios fletes)

Flete(1..*) - Pack (1...5) //composición
(Sin un pack no hay flete y viceversa)

Pack (1) - Producto (1…20) // agregación
(A un pack se le agregan varios productos, máximo 20)


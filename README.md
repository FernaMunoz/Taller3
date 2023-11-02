# Taller3

Taller Lab03: Caso empresa transportista
Objetivo:
Evaluar el nivel de apropiación de los contenidos revisados en clases, para modelar un dominio problema con diag. de clases UML usando VP y entregar un solución usando LDP Java.
Dominio del problema:
Dado el auge que han tenido las compras vía internet desde la pandemia de COVID-19, se ha expandido el mercado del transporte de carga.
Así, una empresa de desarrollo de software evalúa la opción de desarrollar un prototipo de sistema de software que permita a empresas de transportes de carga, gestionar los embarques de su empresa.
Hasta el momento el analista ha logrado recopilar la siguiente información:
Una empresa transportista está compuesta de al menos una sucursal en el país. Luego, cada sucursal cuenta con al menos un camión. También es claro que un camión pertenece a sólo una sucursal de la empresa.
Además, cada camión es capaz de realizar muchos fletes, y cada flete transportado se considera compuesto de al menos 1 y un máximo de 5 packs. Cada pack se considera compuesto de 20 productos.
Desde el punto de vista de los datos, se tiene que:
- Una empresa transportista, tiene un nombre comercial y una dirección
- Una sucursal, tiene un código de sucursal y región asociada
- Un camión tiene un código de camión, una patente, una descripción y un estado ("out of service" o "on service)
- Un flete tiene un código de flete y una descripción del mismo
- Un producto, tiene un código de producto y un tipo de producto.
Dominio de la Solución:
Al culminar c/u de las siguientes actividades, si tiene dudas informe al profesor para chequear la misma y avanzar a la siguiente, lo que permite llevar así un control de avance al detalle.
1.) (9:00) 1er commit: lista de clases identificadas y sus relaciones (archivo TXT o PDF).
En este punto, deben decidir qué hará cada integrante y c/u subir su aporte en su respectiva rama del repositorio github, en los horarios definidos.
Sólo la versión final considera el uso de la rama principal con la integración de la solución completa.
2.) (9:30) 2do commit: modelo de clases con UML usando la herramienta VP, considerando clases, roles, estereotipos, atributos, métodos, etc. (archivo PNG, JPG) y archivo .VPP con su modelo creado en VP.
3.) (10:00 y 10:30) 3ro y 4to commit: se requiere de una aplicación Java que tenga una GUI por consola que permita al usuario agregar y quitar productos (add & remove) a un flete, que permita cambiar el estado del camión, agregar nuevos camiones a la flota y desvincular camiones de la flota.
Además, se requiere calcular el valor total de un flete para un camión, en un momento determinado, considerando que por cada producto transportado se cobra $5000 independiente de su tamaño o peso.
Entrega: link a su repositorio github con toda su solución.
NOTA ES INDIVIDUAL: 50% TRABAJO GRUPAL + 50% TRABAJO DE SU PROPIA RAMA REPOSITORIO
OBS:
- La clase termina a las 10:30hrs, pero puede entregar su resultado final en Github para 3.) hasta las 11:00, con la integración final.
- Considere el uso de las buenas prácticas en el modelado de sus clases y su código fuente.
- Cualquier intento o atisbo de soluciones idénticas ==>  1,0 para TOD@S los implicados.

- Identificar clases:

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
clase Sucursal
atributos:
int codigoSucursal
String regionAsociada
Empresa empresaAsociada
    -  clase Flete
            atributos:

int codigoFlete
String descripción
Camion CamionAsociado


- clase Producto
           atributos:
int codigoProducto
String tipoProducto
- clase Pack
             atributos:
ListaProductos//max 20 


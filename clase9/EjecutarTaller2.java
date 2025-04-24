package clase9;

import java.util.*;

public class EjecutarTaller2 {

    public static void main(String[] args) {

        // Creación de los objetos:

        // ObjetosFoto
        Foto[] f = new Foto[3]; // Arreglo foto y tres objetos.
        f[0] = new Foto(".jpg");
        f[1] = new Foto(".png");
        f[2] = new Foto(".gif");

        // ObjetosProducto
        Producto[] p = new Producto[2]; // Areglo producto y dos objetos
        p[0] = new Impresion(null, f, 0, 0);
        p[1] = new Camara(null, null, 0, 0);

        Scanner leer = new Scanner(System.in); // Se declara un escaner para leer lo que digite el usuario
        int opc;
        do {

            System.out.print("*** MENU PRINCIPAL ***");
            System.out.println();
            System.out.print("1. Servicio de Impresión");
            System.out.println();
            System.out.print("2. Servicio Compra de Cámaras");
            System.out.println();
            System.out.print("3. Salir");
            System.out.println();
            opc = leer.nextInt(); // Para almacenar el valor que digitó el usuario (entre 1 y 3).

            switch (opc) {
                case 1:
                    System.out.println("Servicio de Impresión");
                    System.out.println();

                    // Llama al método digCliente para registrar nuevo cliente
                    Cliente objCliente1 = Cliente.digCliente();
                    System.out.println();
                    System.out.println("Cliente registrado exitosamente");
                    System.out.println();
                    System.out.println("Seleccione el formato que desea imprimir la foto");

                    // Muestra las 3 opciones disponibles para imprimir fotos (JPG, PNG, GIF)
                    for (int i = 0; i < f.length; i++) {
                        System.out.println((i + 1) + ". " + f[i].getFichero());
                    }
                    System.out.print("Opción: ");
                    int formatoSeleccionado = leer.nextInt();
                    leer.nextLine();

                    // Validar que la opción esté en el rango válido (entre 1 y 3)
                    if (formatoSeleccionado >= 1 && formatoSeleccionado <= 3) {
                        Foto foto = f[formatoSeleccionado - 1];
                        System.out.println("\nFormato seleccionado: " + foto.getFichero());
                        Foto[] fotoImprimir = { foto };

                        // Preguntar el tipo de impresión ("A color" - "Blanco y negro")
                        System.out.println("Seleccione el tipo de impresión:");
                        System.out.println("1. A color (Valor: $1.500)");
                        System.out.println("2. Blanco y negro (Valor: $800)");
                        System.out.print("Opción: ");
                        int tipoColor = leer.nextInt();
                        leer.nextLine();

                        // Asignar precio a Tipo de impresión
                        String tipoImpresion;
                        long precio;

                        if (tipoColor == 1) {
                            tipoImpresion = "A color";
                            precio = 1500;
                        } else if (tipoColor == 2) {
                            tipoImpresion = "Blanco y negro";
                            precio = 800;
                        } else {
                            System.out.println("Opción inválida. Se asignará A color por defecto.");
                            tipoImpresion = "A color";
                            precio = 1500;
                        }

                        // Preguntar cuántas unidades desea imprimir
                        System.out.print("¿Cuántas unidades desea imprimir? ");
                        int cantidad = leer.nextInt();
                        leer.nextLine();

                        // Crear el objeto Impresion con el tipo de impresión y precio correctos
                        Impresion producto = new Impresion(tipoImpresion, fotoImprimir, formatoSeleccionado, precio);

                        // Calcular el total
                        long totalPagar = precio * cantidad;

                        System.out.print("Ingrese el número de tarjeta de crédito: ");
                        String tarjeta = leer.nextLine();

                        Producto[] productos = { producto };
                        Date fecha = new Date();
                        Pedido pedido = new Pedido(objCliente1, productos, fecha, tarjeta);

                        System.out.println("\nPedido creado exitosamente:");
                        System.out.println(pedido.toString());
                        System.out.println("CANTIDAD: " + cantidad);
                        System.out.println("TOTAL A PAGAR: $" + totalPagar);
                        System.out.println();

                        // Si no estan en el rango (entre 1 y 3) sale error.
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Servicio de Compra Cámaras");
                    System.out.println();

                    // Llama al método digCliente para registrar nuevo cliente
                    Cliente objCliente2 = Cliente.digCliente();
                    System.out.println();
                    System.out.println("Cliente registrado exitosamente");
                    System.out.println();
                    System.out.println("Seleccione la cámara que desea comprar:");

                    // Muestra las 3 opciones disponibles de camaras con precios
                    System.out.println("1. Sony Alpha APS - $380.000");
                    System.out.println("2. Nikon COOLPIX - $390.500");
                    System.out.println("3. Canon EOS R6 - $880.500");
                    System.out.print("\nOpción: ");
                    int opcCamara = leer.nextInt();
                    leer.nextLine();

                    // Se evalúa el valor digitado por el usuario (opcCamara - entre 1 y 3)
                    Camara camara = null;
                    switch (opcCamara) {
                        case 1:
                            // Se crea un objeto Camara con marca, modelo, código y precio
                            camara = new Camara("Sony", "Alpha APS", 1, 380000);
                            break;
                        case 2:
                            camara = new Camara("Nikon", "COOLPIX", 2, 390500);
                            break;
                        case 3:
                            camara = new Camara("Canon", "EOS R6", 3, 880500);
                            break;
                        // En caso de digitar una opcion incorrecta
                        default:
                            System.out.println("Debe seleccionar una de las tres opciones");
                            break;
                    }

                    if (camara != null) { // Si cámara es distinto a null es decir que tiene un valor (entre 1 y 3)
                        System.out.print("¿Cuántas unidades desea comprar? ");
                        int cantidad = leer.nextInt();
                        leer.nextLine();

                        // Calcula el total a pagar
                        long totalPagar = camara.getPrecio() * cantidad;

                        System.out.print("Ingrese el número de tarjeta de crédito: ");
                        String tarjeta = leer.nextLine();

                        Producto[] productos = new Producto[1]; // Crea un arreglo de productos con tamaño 1
                        productos[0] = camara; // Almacena el objeto camara en la primera posición del arreglo

                        Date fecha = new Date();
                        Pedido pedido = new Pedido(objCliente2, productos, fecha, tarjeta);

                        System.out.println("\nPedido creado exitosamente:");

                        // Muestra la información del pedido usando su método toString()
                        System.out.println(pedido.toString());
                        System.out.println("CANTIDAD: " + cantidad);
                        System.out.println("TOTAL A PAGAR: $" + totalPagar);
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("ERROR: Debe seleccionar una de las 3 opciones");
                    break;
            }

        } while (opc != 3);
    }
}
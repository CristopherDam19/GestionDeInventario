package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        final double iva = 0.12;
        // Lista de los tipos
        ArrayList<Double> preciosProductos = new ArrayList<>();
        ArrayList<String> nombreProducto = new ArrayList<>();
        ArrayList<String> fechaCaducidad = new ArrayList<>();
        ArrayList<String> fabricante = new ArrayList<>();

        //Variables del bloque principal
        int op = 0;
        double precioIva;
        String respuesta;
        String buscaNameProduct;


        do {
            System.out.println("Bienvenido al Sistema");
            System.out.println("1. Agregar producto \n2.Listar productos" +
                    "\n3.Actualizar producto \n4.Eliminar producto  \n5.Salir");
            System.out.print("->");
            op = s.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println(" Agregar productos");

                        System.out.println("Ingrese el nombre del producto: ");
                        String productoName = s.next();
                        nombreProducto.add(productoName);

                        System.out.println("Ingrese el precio del producto");
                        double productoPrice = s.nextDouble();
                        precioIva =  productoPrice+(productoPrice * iva);
                        preciosProductos.add(precioIva);

                        System.out.println("Ingrese la fecha de caducidad");
                        String productDate = s.next();
                        fechaCaducidad.add(productDate);

                        System.out.println("Ingrese el fabricante");
                        String marca = s.next();
                        fabricante.add(marca);
                        System.out.println("Quiere seguir agregando productos (Si (Y) o No (N))");
                        respuesta = s.next();


                    } while (respuesta.toLowerCase().equalsIgnoreCase("Y"));

                    break;

                case 2:
                    System.out.println("Productos en Sistema");
                    for (int i = 0; i < preciosProductos.size()-1; i++) {
                        System.out.println("Nombre del producto: " + nombreProducto.get(i));
                        System.out.println("Precio del producto: " + preciosProductos.get(i));
                        System.out.println("Fecha de caducidad: " + fechaCaducidad.get(i));
                        System.out.println("Fabricante: " + fabricante.get(i));
                    }
                    break;

                case 3:

                    System.out.println("Actualizar un producto");
                    System.out.println("Ingrese el nombre del producto (#Cereal_Chocolate)");
                    buscaNameProduct = s.next();

                    for (int i = 0; i < nombreProducto.size(); i++) {
                        if (nombreProducto.get(i).equalsIgnoreCase(buscaNameProduct)) {
                            System.out.println("Actualizando datos ");


                            System.out.println("Detalles actuales:");
                            System.out.println("Precio: " + preciosProductos.get(i));
                            System.out.println("Fecha de caducidad: " + fechaCaducidad.get(i));
                            System.out.println("Fabricante: " + fabricante.get(i));


                            System.out.println("Ingrese el nuevo precio:");
                            double nuevoPrecio = s.nextDouble();
                            precioIva =  nuevoPrecio+(nuevoPrecio * iva);
                            preciosProductos.add(precioIva);
                            preciosProductos.set(i, precioIva);

                            System.out.println("Ingrese la nueva fecha de caducidad:");
                            String nuevaFecha = s.next();
                            fechaCaducidad.set(i, nuevaFecha);

                            System.out.println("Ingrese el nuevo fabricante:");
                            String nuevoFabricante = s.next();
                            fabricante.set(i, nuevoFabricante);

                            System.out.println("Producto actualizado con éxito.");
                        }

                    }


                    break;


                case 4:
                    System.out.println("Ingrese el nombre del producto (#Cereal_Chocolate)");
                    buscaNameProduct = s.next();

                    for (int i = 0; i < nombreProducto.size(); i++) {
                        if (nombreProducto.get(i).equalsIgnoreCase(buscaNameProduct.toLowerCase())) {
                            nombreProducto.remove(i);
                            fechaCaducidad.remove(i);
                            preciosProductos.remove(i);
                            fabricante.remove(i);
                        }
                        break;
                    }
            }
            }
            while (op != 5) ;

        }

    }

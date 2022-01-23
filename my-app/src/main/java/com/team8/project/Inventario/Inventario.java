package com.team8.project.Inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    /**
     * Sistema CRUD
     *
     * */

    public boolean printPase(ArrayList<String> userProducto){

        boolean confirm = true;
        boolean validation = false;
        ArrayList<String> arrayList = new ArrayList<>();

        while(confirm){
            System.out.println("-----------------------------");
            System.out.println("1. Agregar producto inventario");
            System.out.println("2. Eliminar producto inventario");
            System.out.println("3. Editar producto inventario");
            System.out.println("4. Listar productos inventario");
            System.out.println("5. Export Excel");
            System.out.println("6. Retroceder");

            // toma de datos para el menu
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            if (number == 1) {
                // Nombre del producto
                System.out.println("Nombre del producto: ");
                Scanner inputproduct = new Scanner(System.in);
                String producto = inputproduct.nextLine();
                arrayList.add(producto);

                // Cantidad del producto
                System.out.println("Cantidad: ");
                String cantidad = inputproduct.nextLine();
                arrayList.add(cantidad);
            } else if (number == 2) {
                // Eliminar producto
                System.out.println("------------------------");
                arrayList.clear();
                System.out.println("Producto Eliminado");
            } else if (number == 3) {
                // Editar productos
                System.out.println("Campo a modificar: ");
                System.out.println("0. Producto");
                System.out.println("1. Cantidad");
                System.out.println("-----------------------");
                System.out.println(arrayList);
                Scanner inputchange = new Scanner(System.in);
                int change = inputchange.nextInt();
                Scanner inputNewValue = new Scanner(System.in);
                String newValue = inputNewValue.nextLine();
                arrayList.set(change, newValue);
                System.out.println("Valores modificados");
            } else if (number == 4) {
                // Listar productos
                for(int i = 0; i < arrayList.size(); i++) {
                    if(i % 2 == 0) {
                        System.out.println("Producto: " + arrayList.get(i));
                    }
                    else {
                        System.out.println("Cantidad: " + arrayList.get(i));
                    }
                }
            }else if (number == 5) {
                // Send Email
               // CategoriaProducto.SendEmail.SendList(arrayList);
            }
            else if (number == 6) {
                // Regresar
                confirm = false;
            }
            else {
                System.out.println("Por favor, marque solo los numeros de seleccion disponibles");
            }
        }
        validation = true;
        return validation;
    }
}

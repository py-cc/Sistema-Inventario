package com.mycompany.app;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class InicioSesión {

    /**
     * Funcionalidades del usuario Admi - Menú interactivo
     *
     * */

    public ArrayList<String> categoria = new ArrayList<>();
    public ArrayList<String> userList = new ArrayList<>();
    ArrayList<String> producto = new ArrayList<>();

    public boolean UserSesion() {

        boolean confirm = true;

        while(confirm){
            System.out.println("Selecciona el numero requerido");
            System.out.println("-------------------------------");
            System.out.println("1. Añadir Facturas");
            System.out.println("2. Inventario");
            System.out.println("3. Gestion de Producto");
            System.out.println("4. Creacion de categoria de producto");
            System.out.println("0. Exit");

            // toma de datos para el menu
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // Llamada de clase Factura
            factura usuario = new factura();


            // Llamada de clase Inventario
            Inventario adm = new Inventario();

            // Llamada gestion producto
            GestionProductos userAdm = new GestionProductos();

            if (number == 1){
                // añadir facturas
                factura.UserFactura();
            }
            else if (number == 2){
                // llevar a la clase inventario
                confirm = adm.printPase(producto);
            }
            else if (number == 3){
                // Gestion de producto
                producto = userAdm.escogerOperacion(categoria);
                System.out.println(producto);
            }
            else if (number == 4){
                CategoriaProducto userCategoria = new CategoriaProducto();
                userList = userCategoria.crudCategoriaProducto();
                for (int i = 0; i<userList.size(); i++){
                    categoria.add(userList.get(i));
                }
            }
            else if (number == 0){
                confirm = false;
            }
            else{
                System.out.println("Por favor, marque solo los numeros de seleccion disponibles");
            }

            if (number == 0){
                confirm = false;
                input.close();
            }
            else {
                confirm = true;
            }
        }
        return(confirm);
    }

}

package com.team8.project.Inventario;
//import Producto;
import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;
/*
*
* Clase para llevar control de las acciones de producto
*
*/
@Data
public class GestionProductos extends Producto {
    Scanner sc = new Scanner(System.in);
    private int operacion;
    ArrayList<String> producto = new ArrayList<>();

    public ArrayList<String> escogerOperacion(ArrayList<String> categoria){
        do {
            System.out.println("========¿Qué operación deseas hacer?========");
            System.out.println("1>>>Registrar productos"+"\n"+
                    "2>>>Eliminar productos" +"\n"+
                    "3>>>Mostrar productos"  +"\n"+
                    "4>>>Modificar productos" + "\n"+
                    "5>>>Regresar" + "\n"+"\n"+
                    "-***Interactúe con el menú ingresando el dígito correspondiente a una acción: ");
            operacion = sc.nextInt();
            switch (operacion){
                case 1:
                    registrarProducto(categoria);
                    continue;
                case 2:
                    eliminarProducto();
                    continue;
                case 3:
                    mostrarProductos();
                    continue;
                case 4:
                    modificarProducto();
                    continue;
                case 5:
            }
        }while (operacion!=5);
        return categoria;
    }

}

package com.team8.project.Inventario;
import lombok.Data;
import java.util.ArrayList;
import java.util.Scanner;
/*
*SuperClase encargada de definir campos y métodos para
* @author Jonathan
*
* */
@Data
public class Producto {

    private int id;
    private String nombreProducto;
    private String categoria;
    Scanner sc = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();
    ArrayList<String> categoriaList;


    public Producto() {

    }


    public Producto(int id, String nombreProducto, String categoria) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;

    }

    public void registrarProducto(ArrayList<String> categoriaList) {
        boolean ans = categoriaList.isEmpty();
        System.out.println("*==Ingresa el ID del producto: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("*==Ingresa el nombre de producto: ");
        nombreProducto = sc.nextLine();

        System.out.println("*==Ingresa la categoría del producto: ");
        categoria = sc.nextLine();

        if (ans == true) {
            System.out.println("No hay ninguna categoria creada");
            return;
        }

        for (int i = 0; i < categoriaList.size(); i++) {
            boolean areEqual = categoria.equals(categoriaList.get(i));
            if (areEqual) {
                break;
            } else {
                System.out.println("Esta categoria no se encuentra creada, por favor dirigase al menu de creacion de categoria");
                return;
            }
        }

        productos.add(new Producto(id, nombreProducto, categoria));

        System.out.println("Se creo correctamente el producto");
    }


}





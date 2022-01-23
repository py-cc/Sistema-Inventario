package com.team8.project.Control;
import com.team8.project.Inventario.Producto;
import java.util.Scanner;

public class PermisosAdministrador implements Gestion {

    Producto productos;
    Scanner sc = new Scanner(System.in);

    @Override
    public void agregarProducto() {

    }

    @Override
    public void mostrarProductos() {

    }

    @Override
    public void visualizarCategorias() {

    }

    @Override
    public void exportarExcel() {

    }
    public void editarProducto(){
        if (productos.getProductos().isEmpty()) {
            System.out.println("===========================================================");
            System.out.println("Parece que no hay nada por acá, ¡ingrese un producto antes!");
            System.out.println("===========================================================");

        } else {
            System.out.println("*==Ingrese el ID del producto para modificar sus datos: ");
            int idModificar = sc.nextInt();
            int pos = -1;
            for (int i = 0; i < productos.getProductos().size(); i++) {
                if (productos.getProductos().get(i).getId() == idModificar)
                    pos = i;
            }
            if (pos != -1) {
                productos.registrarProducto(productos.getTemp());
                productos.getProductos().get(pos).setId(productos.getId());
                productos.getProductos().get(pos).setNombreProducto(productos.getNombreProducto());
                productos.getProductos().get(pos).setCategoria(productos.getCategoria());
                System.out.println("==========================================================");
                System.out.println("Producto actualizado con éxito, puede ver sus nuevos datos");
                System.out.println("==========================================================");

            } else {
                System.out.println("===================================================");
                System.out.println("¿Se equivocó? ¡no tenemos este ID en nuestra lista!");
                System.out.println("===================================================");
            }

        }
    }//Listo
    public void eliminarProducto(){
        System.out.println("*==Ingrese el ID del producto para eliminarlo: ");
        int idEliminar = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < productos.getProductos().size(); i++) {
            if (productos.getProductos().get(i).getId() == idEliminar)
                pos = i;
        }
        if (pos != -1) {
            productos.getProductos().remove(pos);
            System.out.println("======================================");
            System.out.println("Se ha eliminado el producto con éxito.");
            System.out.println("======================================");


        } else {
            System.out.println("===================================================");
            System.out.println("¿Se equivocó? ¡no tenemos este ID en nuestra lista!");
            System.out.println("===================================================");
        }
    }


}

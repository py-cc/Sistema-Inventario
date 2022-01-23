package com.team8.project.Control;
import com.team8.project.Inventario.Producto;

public class PermisosCliente implements Gestion {
    Producto productos;


    @Override
    public void mostrarProductos() {
        if (productos.getProductos().isEmpty()) {
            System.out.println("===========================================================");
            System.out.println("Parece que no hay nada por acá, ¡ingrese un producto antes!");
            System.out.println("===========================================================");
        } else {
            for (int i = 0; i < productos.getProductos().size(); i++) {
                System.out.println("===========================");
                System.out.println("->ID de producto: " + productos.getProductos().get(i).getId());
                System.out.println("->Nombre de producto: " + productos.getProductos().get(i).getNombreProducto());
                System.out.println("->Categoria de producto: " + productos.getProductos().get(i).getCategoria());

            }
        }
    }
    @Override
    public void agregarProducto() {
        System.out.println("-***Error: No tienes permiso para ejecutar esta acción.");
    }
    @Override
    public void visualizarCategorias() {
        System.out.println("-***Error: No tienes permiso para ejecutar esta acción.");
    }

    @Override
    public void exportarExcel() {
        //Esta función está en SendEmail
    }

    @Override
    public void eliminarProducto() {
        System.out.println("-***Error: No tienes permiso para ejecutar esta acción.");

    }

    @Override
    public void editarProducto() {
        System.out.println("-***Error: No tienes permiso para ejecutar esta acción.");
    }
}

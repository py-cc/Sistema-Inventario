package com.team8.project.Control;
/*
Interface dedicada para asignar los permisos globales
 */
public interface Gestion {
    void agregarProducto(); //Administrador
    void eliminarProducto();//Administrador
    void editarProducto(); //Administrador
    void mostrarProductos();
    void exportarExcel();
    void visualizarCategorias();


}

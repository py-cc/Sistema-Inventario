package com.team8.project.Inventario;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//Modificar este código

public class CategoriaProducto {

    public ArrayList<String> crudCategoriaProducto(){

        boolean mientras = true;
        boolean bandera = false;
        ArrayList<String> arrayList = new ArrayList<>();

        while(mientras){
            System.out.println("*******************");
            System.out.println("1. Agregar categoría");
            System.out.println("2. Eliminar categoría");
            System.out.println("3. Editar categoría");
            System.out.println("4. Listar categorías");
            System.out.println("5. Retroceder");

            Scanner lector = new Scanner(System.in);
            // valores enteros para el menú
            int number = lector.nextInt();

            if (number == 1) {
                // Agregando la categoría al arreglo
                System.out.println("Nombre de la categoría: ");
                Scanner lectorCategoria = new Scanner(System.in);
                String categoria = lectorCategoria.nextLine();
                arrayList.add(categoria);

            } else if (number == 2) {
                // Eliminando categoría
                System.out.println("******************");
                arrayList.clear();
                System.out.println("Categoría(s) Eliminada(s)");
            } else if (number == 3) {
                // Editando categorías
                System.out.println("Campo a modificar: ");
                System.out.println("0. Categoría");
                System.out.println("-----------------------");
                System.out.println(arrayList);
                Scanner lectorCambiar = new Scanner(System.in);
                int cambiar = lectorCambiar.nextInt();
                Scanner lectorNuevo = new Scanner(System.in);
                String nuevo = lectorNuevo.nextLine();
                arrayList.set(cambiar, nuevo);
                System.out.println("Campos Actualizados");
            } else if (number == 4) {
                // Listando categorías
                for(int i = 0; i < arrayList.size(); i++) {
                    System.out.println("Categorías: " + arrayList.get(i));
                }
            } else if (number == 5) {
                // Retornar
                mientras = false;
            }
            else {
                System.out.println("Marque un número válido...");
            }
        }
        bandera = true;
        return(arrayList);
    }
}

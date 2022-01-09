package com.mycompany.app;
import java.util.Scanner;

public class factura {
    private int numeroFactura;
    private String nombreproducto;
    private int cantidadProducto;
    private double valorUnd;
    private double valorTotal;
    private String nombreProveedor;
    private Scanner datos;
    private int seguir;
    //constructor empty

    public factura(){
    }

    public void Inicializar(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto:");
        nombreproducto= datos.nextLine();
        System.out.println("Cantidad del producto:");
        cantidadProducto= datos.nextInt();
        System.out.println("Escribe el precio: " +
                "$");
        valorUnd= datos.nextDouble();
        valorTotal=cantidadProducto * valorUnd;
        System.out.println("Nombre de el proveedor:");
        nombreProveedor= datos.next();
        datos.nextLine();
    }

    public void Imprimir(){
        System.out.println("Numero de factura: 1" );
        System.out.println("Producto:" + nombreproducto);
        System.out.println("Cantidad:" + cantidadProducto);
        System.out.println("Precio Unidad: $" + valorUnd);
        System.out.println("Valor Total: $" + valorTotal);
        System.out.println("Proveedor:" + nombreProveedor);
    }

    public int pregunta(){
        datos = new Scanner(System.in);
        System.out.println("¿Desea ingresar otro dato? 1 para si, 2 para no");
        seguir=datos.nextInt();
        while(seguir!=1 && seguir !=2){
            System.out.println("No se ingreso la respuesta correcta ingrese 1 o 2");
            seguir=datos.nextInt();
        }
        return seguir;
    }

    public static void UserFactura(){
        factura Yolo;
        Yolo = new factura();
        int cont=1;
        while (cont==1) {
            Yolo.Inicializar();
            Yolo.Imprimir();
            cont=Yolo.pregunta();
        }
        System.out.print("Thanks for your purchase!" + "\n");
    }

}


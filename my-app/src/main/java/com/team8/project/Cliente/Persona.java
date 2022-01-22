package com.team8.project.Cliente;

import java.io.*;
import java.util.Scanner;


public class Persona implements Serializable {
    private String nombre;
    private int dni;
    private int telefono;
    public String usuario;
    public String contraseña;
    public String userName;
    public String userPass;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }



    public void registroUsuario() throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "---------------------------------------------------------" + "\n" +
                "Registrate:" + "\n" + "---------------------------------------------------------");
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();


        System.out.println("Ingresa tu dni:");
        dni = sc.nextInt();


        System.out.println("Ingresa tu telefono:");
        telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa tu usuario:");
        usuario = sc.nextLine();

        System.out.println("Ingresa tu contraseña:");
        contraseña = sc.nextLine();
        printPersona();
        createTXT();

    }

    public void createTXT() throws FileNotFoundException, IOException{
        File datos = new File("datos.txt");
        if(!datos.exists()) {
            datos.createNewFile();
        }
        PrintWriter pw = new PrintWriter(datos);
        pw.println("Nombre:" + getNombre());
        pw.println("DNI:" + getDni());
        pw.println("Telefono:" + getTelefono());
        pw.println("Usuario:" + getUsuario());
        pw.println("Contraseña:" + getContraseña());
        pw.close();
        System.out.println("===========================================================" + "\n" +
                "Archivo local generado con éxito." + "\n" +
                "===========================================================");
    }

    public void printPersona(){
        System.out.println("===========================================================" + "\n" +
                "Registro completado con éxito. Sus datos son:" + "\n" +
                "===========================================================");
        System.out.print("Tu nombre: ");
        System.out.println(getNombre());
        System.out.print("Tu DNI: ");
        System.out.println(getDni());
        System.out.print("Tu telefono: ");
        System.out.println(getTelefono());
        System.out.print("Tu usuario: ");
        System.out.println(getUsuario());
        System.out.print("Tu contraseña: ");
        System.out.println(getContraseña());
    }

    public void loginUsuario() throws FileNotFoundException, IOException{
        registroUsuario();
        Scanner input = new Scanner(System.in);

        System.out.println("\n" + "---------------------------------------------------------" + "\n" +
                "Inicio de sesion:" + "\n" + "---------------------------------------------------------");
        boolean check = true;

        while(check) {
            System.out.println("Ingresa tu usuario: ");
            userName = input.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            userPass = input.nextLine();
            check = validacionUsuario(userName, userPass);
        }
    }

    public boolean validacionUsuario(String a, String b){

        boolean bandera;

        if (!a.equals(usuario))
        {
            System.out.println("Usuario incorrecto, por favor, intente nuevamente" + "\n" +
                    "-----------------------------------------------------");
        }else if(!b.equals(contraseña)){
            System.out.println("Contraseña incorrecta, por favor, intente nuevamente." + "\n" +
                    "-----------------------------------------------------");
        } else {
            System.out.println("===========================================================" + "\n" +
                    "Iniciaste sesion correctamente. Bienvenido!");
                    InicioSesión userReturn = new InicioSesión();
                    bandera = userReturn.UserSesion();
                    return (bandera);
        }
        return (true);
    }

}

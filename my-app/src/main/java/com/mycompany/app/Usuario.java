package com.mycompany.app;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Usuario extends Persona{


    public static void main(String[] args)throws FileNotFoundException, IOException{
        Usuario programm = new Usuario();
        programm.start();
    }

    public void start()throws FileNotFoundException, IOException{
        Persona usuario = new Persona();
        usuario.loginUsuario();
    }


}

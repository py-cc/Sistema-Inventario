package com.team8.project;
import com.team8.project.Cliente.Persona;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App extends Persona {


    public static void main(String[] args)throws FileNotFoundException, IOException{
        App programm = new App();
        programm.start();
    }

    public void start()throws FileNotFoundException, IOException{
        Persona usuario = new Persona();
        usuario.loginUsuario();
    }


}

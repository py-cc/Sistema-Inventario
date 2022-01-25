package com.team8.project;
import com.team8.project.Control.PermisosCliente;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App extends PermisosCliente {


    public static void main(String[] args)throws FileNotFoundException, IOException{
        App programm = new App();
        programm.start();
    }

    public void start()throws FileNotFoundException, IOException{
        PermisosCliente usuario = new PermisosCliente();

    }


}

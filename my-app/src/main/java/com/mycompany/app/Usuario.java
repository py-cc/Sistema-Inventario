package com.mycompany.app;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**Entry point**/
public abstract class Usuario extends Persona{


    public static void main(String[] args)throws FileNotFoundException, IOException{
        Usuario user = new Usuario() {
            @Override
            public boolean UsersAdministrador() {
                return false;
            }

            @Override
            public boolean UsersUsuario() {
                return false;
            }
        };
        user.start();
    }

    public void start()throws FileNotFoundException, IOException{
        Persona user = new Persona() {
            @Override
            public boolean UsersAdministrador() {
                return false;
            }

            @Override
            public boolean UsersUsuario() {
                return false;
            }
        };
        user.loginUsuario();
    }
}

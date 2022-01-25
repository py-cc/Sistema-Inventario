package com.team8.project.Control.factory;

import com.team8.project.Control.Gestion;
import com.team8.project.Control.PermisosCliente;

public class ClienteFactory extends PermisosFactory{
    @Override
    public Gestion asignarPermisos() {
        return new PermisosCliente();
    }
}

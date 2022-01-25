package com.team8.project.Control.factory;

import com.team8.project.Control.Gestion;
import com.team8.project.Control.PermisosAdministrador;

public class AdministradorFactory extends PermisosFactory{

    @Override
    public Gestion asignarPermisos() {
        return new PermisosAdministrador();
    }
}

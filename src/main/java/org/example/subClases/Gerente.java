package org.example.subClases;

import org.example.clasesPrincipales.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {
    private List<Desarrollador> equipo;

    public Gerente(String nombre, int id, double salario) {
        super(nombre, id, salario, "Recursos Humanos");
        this.equipo = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador dev) {
        equipo.add(dev);
    }

    public int getTamanoEquipo() {
        return equipo.size();
    }
}

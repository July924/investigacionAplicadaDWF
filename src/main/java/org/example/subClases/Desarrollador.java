package org.example.subClases;

import org.example.clasesPrincipales.Empleado;

// Subclases especializadas
public class Desarrollador extends Empleado {
    private String proyecto;

    public Desarrollador(String nombre, int id, double salario, String proyecto) {
        super(nombre, id, salario, "Desarrollo de Software");
        this.proyecto = proyecto;
    }

    public boolean tieneProyecto() {
        return proyecto != null && !proyecto.isEmpty();
    }
}

package org.example.clasesAbstractas;

import org.example.clasesPrincipales.Empleado;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta Departamento
public abstract class Departamento {
    protected List<Empleado> empleados;

    public Departamento() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void removerEmpleado(Empleado e) {
        empleados.remove(e);
    }


    public abstract void contratar(Empleado e);

    public abstract double calcularPresupuesto();
}

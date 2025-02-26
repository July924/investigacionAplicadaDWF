package org.example.subClases;

import org.example.clasesPrincipales.Empleado;

public class Contador extends Empleado {
    public Contador(String nombre, int id, double salario) {
        super(nombre, id, salario, "Finanzas");
    }
}

package org.example.clasesPrincipales;

// Superclase Empleado
public class Empleado {
    public String nombre;
    protected int id;
    public double salario;
    public String departamento;
    protected boolean activo;

    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
        this.activo = true;
    }

    public double getSalario() { return salario; }
    public boolean isActivo() { return activo; }
    public boolean despedir() { this.activo = false;
        return false;
    }
}

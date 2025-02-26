package org.example.clasesAbstractas.Departamentos;

import org.example.Interfaz.Gestionable;
import org.example.clasesAbstractas.Departamento;
import org.example.clasesPrincipales.Empleado;
import org.example.subClases.Gerente;

// Recursos Humanos
public class RecursosHumanos extends Departamento implements Gestionable {
    private double presupuesto;
    private Finanzas finanzas;

    public RecursosHumanos(double presupuesto, Finanzas finanzas) {
        this.presupuesto = presupuesto;
        this.finanzas = finanzas;
    }

    @Override
    public void contratar(Empleado e) {
        if (presupuesto >= e.getSalario()) {
            System.out.println("Se contrató al empleado: "+ e.nombre+" en el departamento de: "+e.departamento);
            agregarEmpleado(e);
            presupuesto -= e.getSalario();
            finanzas.recibirNotificacion(e);
        } else {
            System.out.println("No hay suficiente presupuesto para contratar a " + e.nombre);
        }
    }

    @Override
    public void despedir(Empleado e) {
        if (e instanceof Gerente && ((Gerente) e).getTamanoEquipo() < 3) {
            System.out.println("No se puede despedir a un gerente con menos de 3 desarrolladores");
            return;
        }
        if (!e.despedir()) {
                    System.out.println("Se ha despedido al empleado: " + e.nombre);
        }else{
            System.out.println("No se ha despedido al empleado: " + e.nombre);
        }
        e.despedir();
        removerEmpleado(e);
    }

    @Override
    public void procesarPago(Empleado e) {}

    @Override
    public double calcularPresupuesto() {
        return presupuesto;
    }
}

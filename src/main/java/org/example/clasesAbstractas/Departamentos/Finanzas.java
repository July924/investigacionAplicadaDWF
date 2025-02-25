package org.example.clasesAbstractas.Departamentos;

import org.example.Interfaz.Gestionable;
import org.example.clasesAbstractas.Departamento;
import org.example.clasesPrincipales.Empleado;

// Finanzas
public class Finanzas extends Departamento implements Gestionable {
    @Override
    public void contratar(Empleado e) {}

    @Override
    public void despedir(Empleado e) {}

    @Override
    public void procesarPago(Empleado e) {
        if (e.isActivo()) {
            System.out.println("Procesando pago a: " + e.nombre);
            System.out.println("El pago ha sido realizado exitosamente por la cantidad de: "+e.salario);
        } else {
            System.out.println("No se puede pagar a un empleado inactivo");
        }
    }

    public void recibirNotificacion(Empleado e) {
        System.out.println("Finanzas ha recibido notificación sobre la contratación de " + e.nombre);
    }

    @Override
    public double calcularPresupuesto() {
        return empleados.stream().mapToDouble(Empleado::getSalario).sum();
    }
}

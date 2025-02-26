package org.example;

import org.example.clasesAbstractas.Departamentos.Finanzas;
import org.example.clasesAbstractas.Departamentos.RecursosHumanos;
import org.example.clasesPrincipales.Empresa;
import org.example.subClases.Contador;
import org.example.subClases.Desarrollador;
import org.example.subClases.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(100000);
        RecursosHumanos rh = empresa.getRecursosHumanos();
        Finanzas finanzas = empresa.getFinanzas();

        // Crear y contratar un gerente
        Gerente gerente = new Gerente("Juan Lopez", 3, 10000);
        rh.contratar(gerente);

        // Contratación de empleado Desarrolador
        Desarrollador dev1 = new Desarrollador("Carlos", 1, 50000, "Proyecto A");
        Desarrollador dev2 = new Desarrollador("Julissa", 4, 50000, "Proyecto A");
        Desarrollador dev3 = new Desarrollador("Meylin", 5, 2000, "Proyecto A");

        // Procesar pago
        //finanzas.procesarPago(dev1);

        //asignar un empleado desarrollador a gerente
        gerente.agregarDesarrollador(dev1);
//        gerente.agregarDesarrollador(dev2);
//        gerente.agregarDesarrollador(dev3);
//
//        // contratar al gerente
//
//        rh.contratar(dev2);
//        rh.contratar(dev3);


        // Intentar despedir al gerente
        //rh.despedir(gerente);


    }
}

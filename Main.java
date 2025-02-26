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

        // Contratación de empleado
        Desarrollador dev1 = new Desarrollador("Carlos", 1, 50000, "Proyecto A");
        Contador cont1 = new Contador("Laura", 2, 5000);
        rh.contratar(dev1);

        // Procesar pago
        finanzas.procesarPago(dev1);



        // Agregar desarrolladores al gerente
        Desarrollador dev2 = new Desarrollador("Julissa", 4, 50000, "Proyecto A");
        Desarrollador dev3 = new Desarrollador("Meylin", 5, 2000, "Proyecto A");

        gerente.agregarDesarrollador(dev1);
        gerente.agregarDesarrollador(dev2);
        gerente.agregarDesarrollador(dev3);

        rh.contratar(dev2);
        rh.contratar(dev3);


        // Intentar despedir al gerente
        rh.despedir(gerente);


    }
}

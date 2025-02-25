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

            //contratacion
            Desarrollador dev1 = new  Desarrollador("Carlos", 1, 2000, "Proyecto A");
            Contador cont1 = new Contador("Laura", 2, 5000);
            rh.contratar(dev1);

            //procesar  pago
            finanzas.procesarPago(dev1);

            //despedir
            Gerente gerente = new Gerente("Juan cacas", 2, 5000);
            rh.despedir(gerente);

        }
    }

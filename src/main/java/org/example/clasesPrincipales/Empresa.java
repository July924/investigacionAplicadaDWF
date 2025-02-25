package org.example.clasesPrincipales;

import org.example.clasesAbstractas.Departamentos.Finanzas;
import org.example.clasesAbstractas.Departamentos.RecursosHumanos;

// Empresa
public class Empresa {
    private RecursosHumanos rh;
    private Finanzas finanzas;

    public Empresa(double presupuestoRH) {
        this.finanzas = new Finanzas();
        this.rh = new RecursosHumanos(presupuestoRH, finanzas);
    }

    public RecursosHumanos getRecursosHumanos() {
        return rh;
    }

    public Finanzas getFinanzas() {
        return finanzas;
    }
}

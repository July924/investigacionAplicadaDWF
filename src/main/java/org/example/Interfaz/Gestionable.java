package org.example.Interfaz;

import org.example.clasesPrincipales.Empleado;

// Interfaz para gestión de empleados
public interface Gestionable {
    void contratar(Empleado e);

    void despedir(Empleado e);

    void procesarPago(Empleado e);

}

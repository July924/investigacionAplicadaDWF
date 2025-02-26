import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.clasesAbstractas.Departamentos.Finanzas;
import org.example.clasesAbstractas.Departamentos.RecursosHumanos;
import org.example.clasesPrincipales.Empresa;
import org.example.subClases.Desarrollador;
import org.example.subClases.Gerente;

public class ContratarEmpleadoTest {
    private Empresa empresa;
    private RecursosHumanos rh;
    private Finanzas finanzas;

    @BeforeEach
    void setUp() {
        //inicializo el presupuesto de la empresa
        empresa = new Empresa(100000);
        rh = empresa.getRecursosHumanos();
        finanzas = empresa.getFinanzas();
    }

    @Test
    void testContratarGerente() {
        Gerente gerente = new Gerente("Juan Lopez", 3, 10000);
        rh.contratar(gerente);
    }

    @Test
    void testContratarDesarrolladorYAsignarloAGerente() {
        Gerente gerente = new Gerente("Juan Lopez", 3, 10000);
        rh.contratar(gerente);

        Desarrollador dev1 = new Desarrollador("Carlos", 1, 50000, "Proyecto A");
        rh.contratar(dev1);

        // Asignar desarrollador al gerente
        gerente.agregarDesarrollador(dev1);
    }
}

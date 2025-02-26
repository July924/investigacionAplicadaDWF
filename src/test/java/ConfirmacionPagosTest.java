import org.example.subClases.Contador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.clasesAbstractas.Departamentos.Finanzas;
import org.example.clasesAbstractas.Departamentos.RecursosHumanos;
import org.example.clasesPrincipales.Empresa;
import org.example.subClases.Gerente;
import org.example.subClases.Desarrollador;

public class ConfirmacionPagosTest {
    private RecursosHumanos rh;
    private Empresa empresa;
    private Finanzas finanzas;

    @BeforeEach
    void setUp() {
        //inicializo el presupuesto de la empresa
        empresa = new Empresa(100000);
        rh = empresa.getRecursosHumanos();
        finanzas = empresa.getFinanzas();
    }

    @Test
    void testContratarEmpleadoValidacionPago() {
        Contador contador = new Contador("Juana", 3, 10000);
        rh.contratar(contador);
    }
}

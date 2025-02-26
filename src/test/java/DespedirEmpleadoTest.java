import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.clasesAbstractas.Departamentos.Finanzas;
import org.example.clasesAbstractas.Departamentos.RecursosHumanos;
import org.example.clasesPrincipales.Empresa;
import org.example.subClases.Gerente;
import org.example.subClases.Desarrollador;

public class DespedirEmpleadoTest {
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
    void testDespedirGerenteConMenosDeTresDesarrolladores() {
        Gerente gerente = new Gerente("Juan Lopez", 3, 10000);
        rh.contratar(gerente);

        // Intentar despedirlo sin asignar 3 desarrolladores
        rh.despedir(gerente);
        Object e = new Object();
        if (e instanceof Gerente && ((Gerente) e).getTamanoEquipo() < 3) {
            System.out.println("No se puede despedir a un gerente con menos de 3 desarrolladores");
        }
    }

    @Test
    void testDespedirGerenteConTresDesarrolladores() {
        Gerente gerente = new Gerente("Juan Lopez", 3, 10000);
        rh.contratar(gerente);

        // Asignar 3 desarrolladores al gerente
        Desarrollador dev1 = new Desarrollador("Carlos", 1, 50000, "Proyecto A");
        Desarrollador dev2 = new Desarrollador("Julissa", 4, 50000, "Proyecto A");
        Desarrollador dev3 = new Desarrollador("Meylin", 5, 2000, "Proyecto A");

        rh.contratar(dev1);
        rh.contratar(dev2);
        rh.contratar(dev3);

        gerente.agregarDesarrollador(dev1);
        gerente.agregarDesarrollador(dev2);
        gerente.agregarDesarrollador(dev3);

        // Ahora sí se puede despedir
        rh.despedir(gerente);
        }
}

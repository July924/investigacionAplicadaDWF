Problema Seleccionado: PROBLEMA #1

Gestion Empresarial Modular
El sistema garantiza la gestión eficiente de los empleados mediante la abstracción, la implementación de reglas de negocio y la interacción entre departamentos. Esto permite una administración organizada y asegura que se cumplan las condiciones necesarias antes de ejecutar acciones críticas como contrataciones, despidos y pagos.

Para obtener dicho resultad hacemos uso de las diferentes propiedades o caracteristias de la POO, como herencia, polimorfismo, abstraccion para comunicar de manera eficiente las clases para su correcto funcionamiento

donde incluimos : 
Clase Empleado como superclase, con atributos generales como id, nombre, salario, y departamento.
Subclases para los distintos roles (Desarrollador, Gerente, Contador), cada una con atributos y reglas específicas.
Clase Departamento como clase abstracta que define métodos clave (agregarEmpleado(), removerEmpleado(), calcularPresupuesto()).
Clase Empresa que administra los departamentos y registra eventos importantes.
Interfaz Gestionable con métodos contratar(Empleado e), despedir(Empleado e), y procesarPago(Empleado e).

casos de prueba 
Recursos Humanos verifica el presupuesto antes de contratar:

Si el presupuesto de Finanzas es insuficiente, no se permite la contratación.
Al contratar, Recursos Humanos notifica a Finanzas para gestionar el salario.
Finanzas solo paga a empleados activos:

Antes de procesar un pago, Finanzas verifica si el empleado sigue activo.
Un gerente debe supervisar al menos 3 desarrolladores:

No se permite despedir a un gerente si tiene menos de 3 desarrolladores bajo su supervisión.
Un desarrollador debe estar asignado a un proyecto para recibir salario:

Antes de que Finanzas procese el pago de un Desarrollador, debe verificar su asignación a un proyecto.

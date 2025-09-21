package features;

import core.Ejecutable;
import core.Empleado;
import utils.ContextColor;
import utils.UtilsColor;

public class ListarEmpleados implements Ejecutable {
    @Override
    public void execute() {
        int cantEmpleados = Empleado.mostrarTotalEmpleados();

        //Muestra resultado
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Cantidad de empleados: "+cantEmpleados);
    }
}

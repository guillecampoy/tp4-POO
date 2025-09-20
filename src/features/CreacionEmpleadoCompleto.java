package features;

import core.Ejecutable;
import core.Empleado;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.Scanner;

public class CreacionEmpleadoCompleto implements Ejecutable {
    @Override
    public void execute() {
        UtilsColor.imprimirBloque(ContextColor.INFO, "Se procede a creación de empleado completo:");
        Scanner scanner = new Scanner(System.in);
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el ID del empleado: ",'n');
        int idEmpleado = scanner.nextInt();
        scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el Nombre del empleado: ",'n');
        String nombreEmpleado = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el puesto del empleado: ",'n');
        String puestoEmpleado = scanner.nextLine();
        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese el salario del empleado: ",'n');
        double salarioEmpleado = scanner.nextDouble();
        scanner.nextLine();

        Empleado empleado = new Empleado(idEmpleado, nombreEmpleado, puestoEmpleado, salarioEmpleado);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Empleado cargado: "+empleado);
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nIncrementos salariales");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "1-Monto fijo");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, "2-Porcentaje");

        UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese su opción: ",'n');
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1: {
                UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese monto de incremento: ",'n');
                double incrementoSalario = scanner.nextDouble();
                scanner.nextLine();
                empleado.incrementarSalarioMontoFijo(incrementoSalario);
                break;
            }
            case 2: {
                UtilsColor.imprimirBloque(ContextColor.INFO, "Ingrese porcentaje: ",'n');
                double porcentajeSalario = scanner.nextDouble();
                scanner.nextLine();
                empleado.incrementarSalarioPorPorcentaje(porcentajeSalario);
                break;
            }
            default: break;
        }

        UtilsColor.imprimirEncabezado();
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Estado Final empleado");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT, empleado.toString());
    }
}

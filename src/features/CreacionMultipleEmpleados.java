package features;

import core.Ejecutable;
import core.Empleado;
import utils.ContextColor;
import utils.UtilsColor;

public class CreacionMultipleEmpleados implements Ejecutable {
    @Override
    public void execute() {

        UtilsColor.imprimirBloque(ContextColor.INFO, "Se procede a creación de empleados:");
        System.out.println("Empleado 1, empleado completo:\nID: 1, Nombre: Lucas Manuel Simpson, Puesto: Operario, Salario: 1000000\n");
        System.out.println("Empleado 2, empleado simple:\nNombre: Jose Maria Traverso, Puesto: Atención al cliente\n");
        System.out.println("Empleado 3, empleado simple:\nNombre: Javier Mansilla, Puesto: Representante ventas\n");

        // Variables auxiliares
        double salarioEmpleadoUno = 1000000.00;
        int IDEmpleadoUno = 1;
        String nombreEmpleadoUno = "Lucas Manuel Simpson";
        String nombreEmpleadoDos = "Jose Maria Traverso";
        String nombreEmpleadoTres = "Javier Mansilla";
        String puestoEmpleadoUno = "Operario";
        String puestoEmpleadoDos = "Atención al cliente";
        String puestoEmpleadoTres = "Representante ventas";

        // Creación de objetos
        Empleado empleadoCompleto = new Empleado(IDEmpleadoUno, nombreEmpleadoUno, puestoEmpleadoUno, salarioEmpleadoUno);
        Empleado primerEmpleadoSimple = new Empleado(nombreEmpleadoDos, puestoEmpleadoDos);
        Empleado segundoEmpleadoSimple = new Empleado(nombreEmpleadoTres, puestoEmpleadoTres);

        UtilsColor.imprimirBloque(ContextColor.INFO, "Empleados creados:");
        System.out.println("Primer empleado (constructor completo) - "+empleadoCompleto);
        System.out.println("Segundo empleado (constructor simplificado) - "+primerEmpleadoSimple);
        System.out.println("Tercer empleado (constructor simplificado) - "+segundoEmpleadoSimple);

        // Manipulación de salarios
        UtilsColor.imprimirBloque(ContextColor.INFO, "\nManipulación de salarios:");

        // Empleado UNO (Completo)
        UtilsColor.imprimirBloque(ContextColor.INFO, empleadoCompleto.getNombre(),'n');
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, ": Incremento monto fijo 500.000");
        empleadoCompleto.incrementarSalarioMontoFijo(500000);

        // Empleado DOS (simplificado)
        UtilsColor.imprimirBloque(ContextColor.INFO, primerEmpleadoSimple.getNombre(),'n');
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, ": Incremento porcentual 10%");
        primerEmpleadoSimple.incrementarSalarioPorPorcentaje(10);

        // Empleado TRES (simplificado)
        UtilsColor.imprimirBloque(ContextColor.INFO, segundoEmpleadoSimple.getNombre(),'n');
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, ": Incremento porcentual 28%");
        segundoEmpleadoSimple.incrementarSalarioPorPorcentaje(28);

        // Listado final empleados
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "\nEstado final empleados");
        UtilsColor.imprimirBloque(ContextColor.INFO, empleadoCompleto.toString());
        UtilsColor.imprimirBloque(ContextColor.INFO, primerEmpleadoSimple.toString());
        UtilsColor.imprimirBloque(ContextColor.INFO, segundoEmpleadoSimple.toString());
        UtilsColor.imprimirBloque(ContextColor.SUCCESS, "Cantidad de empleados: ",'n');
        System.out.println(Empleado.mostrarTotalEmpleados());
    }
}

package core;

public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados;

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}

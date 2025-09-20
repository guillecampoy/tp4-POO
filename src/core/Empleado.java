package core;

import java.text.NumberFormat;
import java.util.Locale;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    // Constantes
    private static final double SALARIO_BASE = 500_000.00;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = redondear2(salario);
        totalEmpleados++;
    }

    public Empleado (String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_BASE;
        this.id = buildId(nombre,puesto);
        totalEmpleados++;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Utilitario para construir IDs si los mismos no son enviados
    // esta estrategia es básica a los espectos prácticos del TP, pero
    // al tenerlo modularizado, permite modificar el enfoque de forma muy simple

    /**
     *
     * @param nombre, nombre del empleado
     * @param posicion, posición dentro de la empresa
     * @return int
     */
    private static int buildId(String nombre, String posicion) {
        int h = 31 * nombre.hashCode() + posicion.hashCode();
        return h & 0x7fffffff; // siempre retorna un valor positivo
    }

    /** Incrementa monto fijo al salario actual */
    public void incrementarSalarioMontoFijo(double incremento) {
        this.salario += redondear2(incremento);
    }

    /** Incrementa por porcentaje recibe número como dobule (ej: 5 => +5%). */
    public void incrementarSalarioPorPorcentaje(double porcentaje) {
        double factor = 1.0 + (porcentaje / 100.0);
        this.salario = redondear2(this.salario * factor);
    }

    // Utilitario simple para redondear dos decimales
    private static double redondear2(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "AR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + nf.format(salario) +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}

package app;

import core.*;
import features.CreacionEmpleadoCompleto;
import features.CreacionEmpleadoSimple;
import features.CreacionMultipleEmpleados;
import features.ListarEmpleados;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            Ejecutable ejercicio = obtenerEjercicio(opcion);
            if (ejercicio != null) {
                ejercicio.execute();
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
            if (opcion != 0) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }

        }
        while (opcion != 0);
        System.out.println("Chau!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===========================================================");
        System.out.println("   Trabajo Práctico 4 - Programación Orientada a Objetos");
        System.out.println("===========================================================");
        System.out.println("Seleccionae Caso de uso");
        System.out.println("1. Creación 3 empleados (1x completo, 2x nombre y puesto)");
        System.out.println("2. Creación empleado completo");
        System.out.println("3. Creación empleado nombe y puesto");
        System.out.println("4. Cantidad empleados creados");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion () {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Ejecutable obtenerEjercicio(int opcion) {
        return switch (opcion) {
            case 1  -> new CreacionMultipleEmpleados();
            case 2  -> new CreacionEmpleadoCompleto();
            case 3  -> new CreacionEmpleadoSimple();
            case 4  -> new ListarEmpleados();
            default -> null;
        };
    }
}
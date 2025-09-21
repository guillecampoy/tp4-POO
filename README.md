# Trabajo Práctico 4 – Programación Orientada a Objetos II

> **Cátedra:** Programación II  
> **Alumno:** Guillermo Campoy  
> **Docente:** Giuliano Espejo  
> **Año/Cuat.**: 2025 / 2C  
> **Lenguaje:** Java (>= 21)
> 
## 📌 Objetivo
Implementar un **sistema de gestión de empleados** aplicando conceptos avanzados de **Programación Orientada a Objetos (POO)** en Java:

- Uso de `this` en constructores y métodos.
- Constructores sobrecargados.
- Métodos sobrecargados.
- Método `toString()`.
- Encapsulamiento (getters y setters).
- Atributos y métodos estáticos.

---

## 📂 Estructura del Proyecto

```bash
TP4-POO/
├── src/
│   ├── core/
│   │   ├── Empleado.java                   # Clase principal con atributos, constructores y lógica
│   │   └── Ejecutable.java                 # Interfaz con método ejecutar()
│   │
│   ├── app/
│   │   └── Main.java                       # Clase con método main, crea y prueba empleados
│   │
│   ├── features/
│   │   ├── CreacionEmpleadoCompleto.java   # Creación de empleado usando constructor con atributos completos.
│   │   ├── CreacionEmpleadoSimpole.java    # Creación de empleado con construtor simplificado y dos atributos, utilización de mecanismos de auto generación y asignación de atributos
│   │   ├── CreacionMultipleEmpleados.java  # Creación de 3 empleados realizando combinaciones de casos
│   │   └── ListarCantidadEmpleados.java    # Utiliza método que accede a atributo estático con cantidad de empleados creados.
│   │
│   └── utils/
│      ├── ContextColor.java                # Enumerado para establecer contextos para mensajes
│      └── UtilsColor.java                  # Utilitarios para impresión con colores
├── README.md
└── .gitignore
```

---

## 📖 Desarrollo

### Clase **Empleado**
- Atributos privados:
    - `int id`
    - `String nombre`
    - `String puesto`
    - `double salario`
    - `static int totalEmpleados`

- Constructores:
    - Uno con todos los parámetros.
    - Otro con solo nombre y puesto (id auto y salario por defecto).

- Métodos:
    - `incrementarSalarioPorPorcentaje(double porcentaje)`
    - `incrementarSalarioMontoFijo(double incremento)`
    - `toString()`
    - `mostrarTotalEmpleados()`
    - `buildId(String nombre, String posicion)`
    - `double redondear2(double valor)`

- Encapsulamiento con getters y setters.

---

### Clase **Main**, con menú que permite:
- Crear empleados con ambos constructores, aplica incrementos.
- Crear un usuario completo, da opción de esquema de aumento.
- Crear usuario con constructor simplificado, da opción de esquema de aumento.
- Muestra el total de empleados con el método estático.

En todas las opciones se hace uso del método toString() del objeto para mostrar los resultados.

---

### Interfaz **Ejecutable**
```java
public interface Ejecutable {
    void ejecutar();
}
```

Todas las clases features (casos de uso) implementan esta interfaz para mantener consistencia en la ejecución.

---
✍️ **Autor:** Guillermo Campoy  
📅 **Año:** 2025

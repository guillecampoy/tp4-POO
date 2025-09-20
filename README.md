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
│   │   ├── Empleado.java          # Clase principal con atributos, constructores y lógica
│   │   └── Ejecutable.java        # Interfaz con método ejecutar()
│   │
│   ├── app/
│   │   └── Main.java              # Clase con método main, crea y prueba empleados
│   │
│   └── utils/
│      └── UtilsColor.java        # Utilitarios para impresión con colores
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
    - `actualizarSalario(double porcentaje)`
    - `actualizarSalario(int cantidad)`
    - `toString()`
    - `static mostrarTotalEmpleados()`

- Encapsulamiento con getters y setters.

---

### Clase **Main**
- Crea empleados con ambos constructores.
- Aplica incrementos de salario.
- Imprime cada objeto con `toString()`.
- Muestra el total de empleados con el método estático.

---

### Interfaz **Ejecutable**
```java
public interface Ejecutable {
    void ejecutar();
}
```

Todas las clases principales podrán implementar esta interfaz para mantener consistencia en la ejecución.

---
✍️ **Autor:** Guillermo Campoy  
📅 **Año:** 2025

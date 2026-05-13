# 💪 Sistema de Gestión de Gimnasio

---

## 🏋️ Descripción del Sistema

Sistema desarrollado en Java para la administración de un gimnasio, permitiendo gestionar:

- Clientes
- Entrenadores
- Membresías
- Rutinas de entrenamiento
- Clases grupales
- Pagos
- Inventario de equipos
- Evaluaciones físicas
- Sedes del gimnasio

El proyecto fue desarrollado aplicando Programación Orientada a Objetos (POO) y los principios SOLID.

---
## 👥 Integrantes

| Nombre | Correo |
|--------|--------|
| Giovanny Andrey Puentes Alape | ganpuentes-2025a@corhuila.edu.co |
| Melannie Lizeth Sanchez Polania | mlsanchez-2025a@corhuila.edu.co |
---
## 📊 Diagrama de Clases UML

<img src="https://github.com/GiovannyPuentes/Grupo8_Puentes_Sanchez/blob/main/WhatsApp%20Image%202026-05-13%20at%2012.43.17%20AM.jpeg" width="5000">
---

# 🏗️ Estructura del Proyecto

```plaintext
src/
└── com/
    └── gimnasio/
        ├── interfaces/
        │   ├── Evaluable.java
        │   ├── Inscribible.java
        │   ├── Mantenible.java
        │   └── Reservable.java
        │
        ├── modelo/
        │   ├── Persona.java
        │   ├── Cliente.java
        │   ├── Entrenador.java
        │   ├── Gimnasio.java
        │   ├── Sede.java
        │   ├── Membresia.java
        │   ├── Pago.java
        │   ├── Rutina.java
        │   ├── Ejercicio.java
        │   ├── ClaseGrupal.java
        │   ├── InscripcionClase.java
        │   ├── EvaluacionFisica.java
        │   └── InventarioEquipo.java
        │
        ├── servicio/
        │   ├── ServicioCliente.java
        │   ├── ServicioClase.java
        │   ├── ServicioInventario.java
        │   ├── ServicioMembresia.java
        │   ├── ServicioPago.java
        │   └── ServicioRutina.java
        │
        └── Main.java
```

---

## 🔗 Explicación de Relaciones

### 👤 Persona → Cliente
- **Tipo de relación:** Herencia
- **Multiplicidad:** No aplica
- **Descripción:**  
La clase `Cliente` hereda atributos y métodos de la clase abstracta `Persona`, reutilizando información general como nombre, correo, teléfono y documento.

```plaintext
Persona <|── Cliente
```

---

### 👤 Persona → Entrenador
- **Tipo de relación:** Herencia
- **Multiplicidad:** No aplica
- **Descripción:**  
La clase `Entrenador` hereda de `Persona`, permitiendo reutilizar información básica de identificación.

```plaintext
Persona <|── Entrenador
```

---

### 🏢 Gimnasio → Persona
- **Tipo de relación:** Asociación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un gimnasio puede registrar múltiples personas dentro del sistema.

```plaintext
Gimnasio 1 ───── 0..* Persona
```

---

### 🏢 Gimnasio → Sedes
- **Tipo de relación:** Agregación
- **Multiplicidad:** `1` a `1..*`
- **Descripción:**  
Un gimnasio puede estar compuesto por una o varias sedes.

```plaintext
Gimnasio ◇──── 1..* Sedes
```

---

### 🏢 Gimnasio → ClaseGrupal
- **Tipo de relación:** Agregación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un gimnasio puede ofrecer múltiples clases grupales.

```plaintext
Gimnasio ◇──── 0..* ClaseGrupal
```

---

### 📋 Rutina → Ejercicio
- **Tipo de relación:** Composición
- **Multiplicidad:** `1` a `1..*`
- **Descripción:**  
Una rutina está compuesta por uno o varios ejercicios.

```plaintext
Rutina ◆──── 1..* Ejercicio
```

---

### 👥 Cliente → Rutina
- **Tipo de relación:** Asociación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un cliente puede tener varias rutinas asignadas.

```plaintext
Cliente 1 ───── 0..* Rutina
```

---

### 🏋️ Entrenador → Rutina
- **Tipo de relación:** Agregación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un entrenador puede gestionar varias rutinas de entrenamiento.

```plaintext
Entrenador ◇──── 0..* Rutina
```

---

### 💳 Cliente → Membresia
- **Tipo de relación:** Asociación
- **Multiplicidad:** `1` a `0..1`
- **Descripción:**  
Un cliente puede tener una membresía activa dentro del sistema.

```plaintext
Cliente 1 ───── 0..1 Membresia
```

---

### 📊 Cliente → EvaluacionFisica
- **Tipo de relación:** Composición
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un cliente puede tener múltiples evaluaciones físicas registradas.

```plaintext
Cliente ◆──── 0..* EvaluacionFisica
```

---

### 💰 Cliente → Pago
- **Tipo de relación:** Dependencia (Use)
- **Multiplicidad:** No aplica
- **Descripción:**  
La clase `Pago` utiliza información de `Cliente` para procesar transacciones y generar facturas.

```plaintext
Cliente ─────▶ Pago
```

---

### 🏋️‍♂️ Sedes → InventarioEquipo
- **Tipo de relación:** Agregación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Una sede puede contener múltiples equipos dentro de su inventario.

```plaintext
Sedes ◇──── 0..* InventarioEquipo
```

---

### 📝 ClaseGrupal → InscripcionClase
- **Tipo de relación:** Asociación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Una clase grupal puede tener múltiples inscripciones de clientes.

```plaintext
ClaseGrupal 1 ───── 0..* InscripcionClase
```

---

### 🏋️ Entrenador → ClaseGrupal
- **Tipo de relación:** Asociación
- **Multiplicidad:** `1` a `0..*`
- **Descripción:**  
Un entrenador puede dirigir varias clases grupales.

```plaintext
Entrenador 1 ───── 0..* ClaseGrupal
```

---

# 📌 Resumen General de Relaciones

| Clases Relacionadas | Tipo de Relación | Multiplicidad | Descripción |
|---|---|---|---|
| `Persona` → `Cliente` | Herencia | No aplica | `Cliente` hereda atributos y métodos de la clase abstracta `Persona`. |
| `Persona` → `Entrenador` | Herencia | No aplica | `Entrenador` hereda atributos y métodos de la clase abstracta `Persona`. |
| `Gimnasio` → `Persona` | Asociación | `1` a `0..*` | Un gimnasio puede registrar múltiples personas dentro del sistema. |
| `Gimnasio` → `Sedes` | Agregación | `1` a `1..*` | Un gimnasio puede estar compuesto por una o varias sedes. |
| `Gimnasio` → `ClaseGrupal` | Agregación | `1` a `0..*` | Un gimnasio puede ofrecer múltiples clases grupales. |
| `Rutina` → `Ejercicio` | Composición | `1` a `1..*` | Una rutina está compuesta por uno o varios ejercicios. |
| `Cliente` → `Rutina` | Asociación | `1` a `0..*` | Un cliente puede tener varias rutinas asignadas. |
| `Entrenador` → `Rutina` | Agregación | `1` a `0..*` | Un entrenador puede gestionar varias rutinas de entrenamiento. |
| `Cliente` → `Membresia` | Asociación | `1` a `0..1` | Un cliente puede tener una membresía activa dentro del sistema. |
| `Cliente` → `EvaluacionFisica` | Composición | `1` a `0..*` | Un cliente puede tener múltiples evaluaciones físicas registradas. |
| `Cliente` → `Pago` | Dependencia (Use) | No aplica | La clase `Pago` utiliza información del cliente para procesar pagos y generar facturas. |
| `Sedes` → `InventarioEquipo` | Agregación | `1` a `0..*` | Una sede puede contener múltiples equipos dentro de su inventario. |
| `ClaseGrupal` → `InscripcionClase` | Asociación | `1` a `0..*` | Una clase grupal puede tener múltiples inscripciones de clientes. |
| `Entrenador` → `ClaseGrupal` | Asociación | `1` a `0..*` | Un entrenador puede dirigir varias clases grupales. |

---

# ⚙️ Aplicación de Principios SOLID

---

## 🔴 S — Single Responsibility Principle (SRP)

Cada clase tiene una única responsabilidad dentro del sistema.

### ✅ ¿Dónde se aplica?

- `ServicioCliente` → Gestiona clientes
- `ServicioPago` → Gestiona pagos
- `ServicioRutina` → Gestiona rutinas
- `ClaseGrupal` → Gestiona información de clases grupales

Esto permitió que el proyecto tuviera una estructura organizada y fácil de mantener.

### 💻 Código Real del Proyecto

```java
public class ServicioPago {

    public void registrarPago(Pago pago) {

        System.out.println(
            "Pago registrado correctamente."
        );
    }
}
```

---

## 🟠 O — Open/Closed Principle (OCP)

Las clases están abiertas para extensión pero cerradas para modificación.

### ✅ ¿Dónde se aplica?

La clase `ClaseGrupal` puede utilizarse para crear distintos tipos de clases del gimnasio como:

- CrossFit
- Zumba
- Entrenamiento Funcional

sin necesidad de modificar la estructura principal de la clase.

### 💻 Código Real del Proyecto

```java
ClaseGrupal crossfit = new ClaseGrupal(
        1,
        "CrossFit Extremo",
        25,
        "Alta",
        "Salón Elite",
        120,
        true,
        true
);

ClaseGrupal zumba = new ClaseGrupal(
        2,
        "Zumba Dance",
        30,
        "Media",
        "Salón Ritmo",
        100,
        true,
        true
);
```

---

## 🟡 L — Liskov Substitution Principle (LSP)

Las clases hijas pueden sustituir correctamente a la clase padre.

### ✅ ¿Dónde se aplica?

`Cliente` y `Entrenador` heredan de `Persona`, por lo tanto pueden utilizarse como objetos de tipo `Persona`.

### 💻 Código Real del Proyecto

```java
Persona persona = new Cliente(
        1,
        "Juan",
        "Pérez",
        "123456",
        "juan@gmail.com",
        "3000000000",
        101
);
```

---

## 🟢 I — Interface Segregation Principle (ISP)

Las clases implementan únicamente las interfaces que realmente necesitan.

### ✅ Interfaces del Proyecto

| Interfaz | Implementada por |
|---|---|
| `Evaluable` | `EvaluacionFisica` |
| `Reservable` | `ClaseGrupal` |
| `Mantenible` | `InventarioEquipo`, `Sede` |
| `Inscribible` | `InscripcionClase` |

Esto evitó que las clases tuvieran métodos innecesarios.

### 💻 Código Real del Proyecto

```java
public class ClaseGrupal implements Reservable {

    @Override
    public void reservar() {

        System.out.println(
            "Clase reservada correctamente."
        );
    }
}
```

---

## 🔵 D — Dependency Inversion Principle (DIP)

Los módulos de alto nivel dependen de abstracciones y no de implementaciones concretas.

### ✅ ¿Dónde se aplica?

El proyecto utiliza interfaces para desacoplar funcionalidades y permitir mayor flexibilidad en el sistema.

### 💻 Código Real del Proyecto

```java
public class EvaluacionFisica
        implements Evaluable {

    @Override
    public void evaluar() {

        System.out.println(
            "Evaluación física realizada."
        );
    }
}
```

---

# 📝 Clases Implementadas

| Clase | Tipo | Atributos | Descripción |
|---|---|---|---|
| `Persona` | Abstracta | `idPersona:int`, `nombre:String`, `apellidos:String`, `dni:String`, `email:String`, `celular:String` | Clase base abstracta del sistema que contiene la información general de las personas. |
| `Cliente` | Concreta | `idCliente:int`, `nroSocio:String`, `fechaAfiliacion:Date`, `estadoActivo:boolean`, `huellaDigital:String` | Representa los clientes registrados dentro del gimnasio. |
| `Entrenador` | Concreta | `idEntrenador:int`, `codEmpleado:String`, `especialidad:String`, `turno:String`, `sueldo:double` | Representa los entrenadores encargados de rutinas y clases grupales. |
| `Gimnasio` | Concreta | `idGimnasio:int`, `nombre:String`, `nit:String`, `direccion:String`, `telefono:String` | Gestiona la información general del gimnasio. |
| `Sedes` | Concreta | `idSedes:int`, `nombre:String`, `direccion:String`, `ciudad:String`, `telefono:String`, `estadoDisponible:boolean`, `gimnasio:Gimnasio` | Representa las sedes físicas del gimnasio. |
| `Membresia` | Concreta | `idMembresia:int`, `codigo:String`, `nombrePlan:String`, `duracionMeses:int`, `precio:double` | Gestiona los planes de membresía ofrecidos a los clientes. |
| `Pago` | Concreta | `idPago:int`, `nroFactura:String`, `monto:double`, `fechaPago:Date`, `metodoPago:String`, `estado:String` | Gestiona la información relacionada con pagos y facturación. |
| `Rutina` | Concreta | `idRutina:int`, `nombreRutina:String`, `objetivo:String`, `dificultad:String`, `duracionSemanas:int` | Representa las rutinas de entrenamiento asignadas a clientes. |
| `Ejercicio` | Concreta | `idEjercicio:int`, `nombre:String`, `musculoPrincipal:String`, `series:int`, `repeticiones:int`, `descansoSeg:int` | Representa los ejercicios incluidos dentro de una rutina. |
| `ClaseGrupal` | Concreta | `idClase:int`, `nombre:String`, `capacidadMax:int`, `intensidad:String`, `nombreSalon:String`, `areaMetrosCuadrados:double`, `tieneSonido:boolean`, `estadoDisponible:boolean` | Gestiona las clases grupales disponibles en el gimnasio. |
| `InscripcionClase` | Concreta | `idInscripcion:int`, `fecha:Date`, `hora:String`, `estadoAsistencia:String` | Gestiona las inscripciones de clientes a clases grupales. |
| `EvaluacionFisica` | Concreta | `idEvaluacion:int`, `fechaEvaluacion:Date`, `pesoKg:double`, `porcentajeGrasa:double`, `imc:double` | Gestiona el seguimiento físico y médico de los clientes. |
| `InventarioEquipo` | Concreta | `idEquipo:int`, `nombreEquipo:String`, `tipoEquipo:String`, `estadoMantenimiento:String`, `fechaUltimaRevision:String` | Gestiona el inventario de máquinas y equipos del gimnasio. |

---

# 🧩 Interfaces Implementadas

| Interfaz | Implementada por |
|---|---|
| Evaluable | EvaluacionFisica |
| Reservable | ClaseGrupal |
| Mantenible | InventarioEquipo, Sede |
| Inscribible | InscripcionClase |

---

# 🛠️ Servicios Implementados

| Servicio | Función |
|---|---|
| ServicioCliente | Gestión de clientes |
| ServicioClase | Gestión de clases |
| ServicioInventario | Gestión de equipos |
| ServicioMembresia | Gestión de membresías |
| ServicioPago | Gestión de pagos |
| ServicioRutina | Gestión de rutinas |

---

# ▶️ Ejecución del Proyecto

El proyecto se ejecuta desde:

```plaintext
Main.java
```

El programa permite:

- Registrar clientes
- Registrar entrenadores
- Crear membresías
- Gestionar pagos
- Crear rutinas
- Registrar clases grupales
- Realizar evaluaciones físicas
- Gestionar inventario
- Administrar sedes

---

# 🎯 Conclusiones

- La aplicación de los principios SOLID permitió desarrollar un sistema más organizado, entendible y escalable. Durante el desarrollo del proyecto se comprendió la importancia de separar responsabilidades dentro de cada clase, evitando que una sola clase tuviera múltiples funciones. Gracias a esto, el código resultó más limpio y fácil de mantener.

- Uno de los principios más importantes dentro del proyecto fue el SRP (Single Responsibility Principle), ya que permitió dividir correctamente las responsabilidades entre las clases del paquete `servicio` y las clases del paquete `modelo`. Por ejemplo, `ServicioPago` se encarga únicamente de gestionar pagos, mientras que `ServicioCliente` administra exclusivamente clientes. Esto facilitó mucho el orden lógico del sistema.

- El principio que presentó mayor dificultad fue el ISP (Interface Segregation Principle), porque fue necesario analizar cuidadosamente qué clases realmente necesitaban implementar interfaces como `Reservable`, `Mantenible`, `Evaluable` o `Inscribible`. Inicialmente algunas clases tenían interfaces innecesarias, pero posteriormente se corrigió para que cada clase implementara únicamente el comportamiento que realmente requería.

- La herencia aplicada entre `Persona`, `Cliente` y `Entrenador` permitió comprender mejor el principio LSP (Liskov Substitution Principle), ya que las clases hijas pudieron sustituir correctamente a la clase padre sin afectar el funcionamiento del sistema. Esto ayudó a reutilizar atributos y métodos comunes evitando duplicación de código.

- El uso de interfaces dentro del proyecto facilitó el desacoplamiento de funcionalidades y fortaleció la aplicación del principio DIP (Dependency Inversion Principle). Gracias a esto, el sistema quedó preparado para futuras extensiones, permitiendo agregar nuevas funcionalidades sin modificar la estructura principal del código.

- Finalmente, el proyecto fortaleció conocimientos fundamentales en Programación Orientada a Objetos, UML, relaciones entre clases, encapsulamiento, herencia, polimorfismo e implementación de principios SOLID. Además, permitió desarrollar habilidades prácticas en organización de proyectos Java utilizando arquitectura por paquetes y buenas prácticas de programación.
---

# 📚 Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos (POO)
- UML
- Principios SOLID
- IntelliJ IDEA / VS Code

---

*Proyecto de Programación y Diseño Orientado a Objetos — Corhuila 2026*

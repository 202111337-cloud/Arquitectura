Aquí tienes **el archivo README completo**, perfectamente formateado y listo para pegar en tu repositorio GitHub:

---

# 🏥 Sistema de Reservas de Citas Médicas

### Actividad 10 – Patrones de Diseño (Creacionales, Estructurales y de Comportamiento)

---

## 📌 **Descripción del Proyecto**

Este proyecto es un sistema simple de **reservas de citas médicas** desarrollado en **Java** utilizando únicamente consola.
El objetivo principal es demostrar la correcta implementación de **tres patrones de diseño**:

* **Factory Method** (creacional)
* **Decorator** (estructural)
* **Command** (comportamiento)

El sistema permite registrar una cita, seleccionar un método de notificación (Email o SMS), confirmar la cita y notificar al paciente.

---

## 🧩 **Patrones de Diseño Implementados**

---

### 🔵 1. **Patrón Creacional: Factory Method**

**Archivo:** `NotificadorFactory.java`

Este patrón se utiliza para **crear el notificador adecuado** (Email o SMS) sin que el programa principal tenga que conocer la clase exacta que debe instanciar.

✔ Reduce acoplamiento
✔ Hace el sistema extensible (WhatsApp, Push Notification, etc.)
✔ Simplifica el código del `Main`

---

### 🟣 2. **Patrón Estructural: Decorator**

**Archivo:** `LoggingNotificador.java`

Permite **agregar funcionalidades adicionales** a los notificadores sin modificar su código original.
En este proyecto, el decorador añade un sistema de **logs** antes y después de enviar la notificación.

✔ No modifica EmailNotificador ni SmsNotificador
✔ Añade comportamiento extra sin romper nada
✔ Aumenta la flexibilidad

---

### 🟠 3. **Patrón de Comportamiento: Command**

**Archivos:**

* `Command.java`
* `ConfirmAppointmentCommand.java`
* `CommandExecutor.java`

Encapsula la acción completa de **confirmar una cita** dentro de un comando concreto.

✔ Separa la lógica del flujo
✔ Permite ejecutar acciones cuando se desee
✔ Facilita pruebas, mantenimiento y extensibilidad

---

## 📁 **Estructura del Proyecto**

```
src/
 ├── Main.java
 ├── Appointment.java
 ├── AppointmentManager.java
 ├── Paciente.java
 ├── Notifica.java
 ├── EmailNotificador.java
 ├── SmsNotificador.java
 ├── NotificadorFactory.java
 ├── LoggingNotificador.java
 ├── Command.java
 ├── ConfirmAppointmentCommand.java
 └── CommandExecutor.java
```

---

## ▶️ **Cómo Ejecutar**

### 1. Clonar el repositorio:

```
git clone https://github.com/202111337-cloud/Arquitectura.git
```

### 2. Entrar a la carpeta:

```
cd tu_repositorio
```

### 3. Compilar:

```
javac src/*.java
```

### 4. Ejecutar:

```
java src.Main
```

---

## 🧪 **Ejemplo de Ejecución**

```
=== SISTEMA DE RESERVA DE CITAS MÉDICAS ===
Ingrese el nombre del paciente: Ana López
Ingrese la fecha de la cita: 10/11/2025
Ingrese el nombre del doctor: Dr. García
Seleccione notificación:
1. Email
2. SMS
Opción: 1
Ingrese el correo: ana@gmail.com

🗓️ Cita registrada
📧 Email enviado a ana@gmail.com: Su cita con el Dr. García ha sido confirmada para el 10/11/2025
```

---

## 🧠 **Objetivos del Proyecto**

* Aplicar tres patrones de diseño: creacional, estructural y de comportamiento.
* Desarrollar un sistema limpio, modular y fácil de extender.
* Ejecutar todo por consola sin interfaces gráficas.
* Mantener el código simple, comprensible y funcional.

---

## 👨‍💻 **Autor**

**Jhonatan Albert Fuentes Cejas**
Carrera: Ingeniería Informática
Actividad 10 – Diseño de Software
Gestión 2025

---

## 🧷 **Repositorio GitHub**

```
https://github.com/202111337-cloud/Arquitectura.git
```

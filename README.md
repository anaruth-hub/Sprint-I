# 🎓 Sprint I – Programación en Java

Este repositorio contiene las actividades del Sprint I de Java, organizadas por temas y niveles de dificultad.
Cada apartado incluye ejercicios para practicar:

- Programación Orientada a Objetos (POO)
- Herencia y polimorfismo
- Interfaces
- Métodos estáticos y no estáticos
- Manejo de excepciones``
- Entrada segura por teclado

---

## 📁 Estructura del Proyecto

Los ejercicios están organizados dentro del paquete principal:



```
carrera01
│
├── Herencia y polimorfismo 01
│ ├── nivel01A → Clases abstractas y jerarquías (Instrumentos)
│ ├── nivel01B → Métodos estáticos vs no estáticos (Car)
│ └── nivel02A → Herencia entre clases (Teléfono / Smartphone)
│
└── Excepciones01 
├── nivel01A → Excepción personalizada (EmptySaleException) 
└── nivel02A → Lectura segura desde teclado (Entrada)
```



---

## 🟣 Clases principales
## 🟣 Clases auxiliares
## 🟣 Excepciones personalizadas
## 🟣 Archivo principal para ejecutar la práctica

---

# 📘 Descripción de los Ejercicios

---

## 1️⃣ Herencia y polimorfismo (Herencia y Polimorfismo)

### 🔹 Nivel 01A – Instrumentos musicales
**Objetivo:** practicar clases abstractas, herencia y jerarquías.

Incluye:
- Clase abstracta `Instrumento`
- Subclases: `Instrumento de viento`, `Instrumento de percusión`, `Instrumento de cuerda`
- Método abstracto `play()`
- Demostración de bloques estáticos

---

### 🔹 Nivel 01B – Clase de automóvil (métodos estáticos/no estáticos)

**Objetivo:** comprender la diferencia entre métodos estáticos y de instancia.

Incluye:
- Campos estáticos vs instanciados
- Métodos estáticos de utilidad
- Métodos que operan sobre el estado del objeto.

---

### 🔹 Nivel 02A – Teléfono / Smartphone

**Objetivo:** profundizar en herencia e interfaces.

Incluye:
- Clase base: `Teléfono`
- Subclase: `Smartphone`
- Interfaces adicionales según enunciado
- Uso de @Override

---

# 2️⃣ Excepciones – Manejo y Creación de Excepciones

### 🔹 Nivel 01A: excepción de venta vacía

**Objetivo:** crear una excepción personalizada.

Incluye:
- Clase `Producto`
- Clase `Venta` con lista de productos
- Excepción `EmptySaleException`
- Manejo de `IndexOutOfBoundsException`

---

### 🔹 Nivel 02A – Lector de entrada de consola (Entrada segura por teclado)

**Objetivo:** crear una clase utilitaria para lectura validada desde teclado.

Incluye:
- Clase estática `Entrada`
- Un único objeto `Escáner`
- Métodos validados:

Con InputMismatchException:
- `readByte(mensaje de cadena)`
- `readInt(mensaje de cadena)`
- `readFloat(mensaje de cadena)`
- `readDouble(mensaje de cadena)`

Con excepción personalizada `EntranceException`:
- `readChar(mensaje de cadena)`
- `readString(mensaje de cadena)`
- `leerSíNo(mensaje de cadena)`

Características:
- Bucle de reintentos hasta entrada válida
- Mensajes personalizados
- Código limpio y reutilizable

## 🟩 3. Colecciones Java (Colecciones)

En esta sección se practican las colecciones más usadas de la librería `java.util`, como:
- `ListaArray`
- `LinkedHashSet`
- `Mapa Hash`
- `ListIterador`

Cada ejercicio desarrolla un aspecto clave de las colecciones: duplicados, orden, iteración segura, uso de mapas y lectura/escritura de archivos.

---

### 🔹 Nivel 01A — Ejercicio 1: Duplicados (ArrayList & LinkedHashSet)

**Objetivos:**
- Crear una lista (`ArrayList`) con los meses del año dejando fuera “August”.
- Insertar “August” en su posición correcta.
- Comprobar el comportamiento de los duplicados.
- Convertir la lista en un `LinkedHashSet` para eliminar duplicados.
- Registrar la colección con: 
- `para-cada` 
- `Iterador`

**Clases creadas:**
- `Mes.java`
- `MesesMain.java`

**Estado del ejercicio:** ✔️ *Completado*

---

### 🔹 Nivel 01B — Ejercicio 2: Iteradores y Modificación Segura

**Objetivos:**
- Practicar el uso de `ListIterator`.
- Modificar elementos mientras se repiten sin generar errores.
- Evitar `ConcurrentModificationException`.

**Estado del ejercicio:** ⬜ *Pendiente*

---

### 🔹 Nivel 02A — Ejercicio 3: HashMap y Contadores

**Objetivos:**
- Usar `HashMap<String, Integer>` para contar elementos.
- Registrar claves y valores.
- Ordenar e imprimir resultados.

**Estado del ejercicio:** ⬜ *Pendiente*

---

### 🔹 Nivel 02B — Ejercicio 4: Lectura y Escritura de Archivos

**Objetivos:**
- Leer archivos con `BufferedReader`.
- Procesar datos y almacenarlos en una colección.
- Crear un archivo de salida con los resultados.

**Estado del ejercicio:** ⬜ *Pendiente*


---

## 🛠️ Tecnologías Utilizadas

-Java JDK 21
- Edición comunitaria IntelliJ IDEA
-Git y GitHub
- Consola / Terminal

---

## ▶️ Cómo Ejecutar los Ejercicios

1. Clonar el repositorio: 
```golpecito 
clon de git https://github.com/anaruth-hub/Sprint-I.git


Abre el proyecto en IntelliJ IDEA
Navega al ejercicio deseado dentro de:
src/sprint01/...
Ejecuta el archivo principal...


## 🤝 Aportaciones

Este repositorio forma parte del material de aprendizaje del Sprint I.
Se aceptan sugerencias, mejoras o correcciones.

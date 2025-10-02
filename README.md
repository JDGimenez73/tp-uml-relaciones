# Trabajo Práctico — Relaciones UML 1:1 (Java)
# Alumno: Gimenez Jose Dario

Implementación de relaciones **asociación**, **agregación**, **composición** y **dependencias (uso/creación)** en Java.  
Incluye **clases por ejercicio (e01–e14)**, **tests JUnit 5** y **mains de demostración**.

## Tech
- Java 17 · Maven 3.9+ · JUnit 5
- IDE : NetBeans

## Estructura
```
src/
  main/java/tp/
    e01 ... e14     # código por ejercicio
    demo/           # MainE01 ... MainE14 (demos)
  test/java/tp/     # tests JUnit por ejercicio
pom.xml
```

## Cómo correr
```bash
# Compilar
mvn -q -DskipTests compile

# Ejecutar todos los tests
mvn -q -DskipTests=false test

# Ejecutar una demo puntual (ej: e03)
java -cp target/classes tp.demo.MainE03
```

## Resumen por ejercicio
- **e01** Pasaporte–Foto–Titular (composición + bidireccional)  
- **e02** Celular–Batería–Usuario (agregación + bidireccional)  
- **e03** Libro–Autor–Editorial (unidireccional + agregación)  
- **e04** Tarjeta–Cliente–Banco (bidireccional + agregación)  
- **e05** Computadora–PlacaMadre–Propietario (composición + bidireccional)  
- **e06** Reserva–Cliente–Mesa (unidireccional + agregación)  
- **e07** Vehículo–Motor–Conductor (agregación + bidireccional)  
- **e08** Documento–FirmaDigital–Usuario (composición + agregación)  
- **e09** CitaMédica–Paciente–Profesional (dos unidireccionales)  
- **e10** Cuenta–Clave–Titular (composición + bidireccional)  
- **e11** Reproductor–Canción–Artista (dependencia de uso)  
- **e12** Calculadora–Impuesto–Contribuyente (dependencia de uso)  
- **e13** GeneradorQR–Usuario–CódigoQR (dependencia de creación)  
- **e14** EditorVideo–Proyecto–Render (dependencia de creación)

## Notas
- En composiciones, los componentes son **obligatorios** y no tienen setter público.
- En agregaciones, los objetos pueden existir por separado (se pueden **cambiar** o **quitar**).
- En relaciones bidireccionales, los setters **sincronizan** ambos extremos evitando recursión.

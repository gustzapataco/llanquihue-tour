# Llanquihue Tour

## Descripción (Semana 4)

Proyecto "Construyendo una lista de objetos desde archivo .txt" desarrollado en Java para la asignatura Desarrollo Orientado a Objetos I.

El sistema permite cargar información de tours turísticos desde un archivo de texto, transformando cada registro en objetos Java que son almacenados en una colección ArrayList.
Posteriormente, los datos pueden ser recorridos, mostrados y filtrados según diferentes criterios.

## Tecnologías utilizadas

- Lenguaje Java
- NetBeans
- Programación Orientada a Objetos (POO)
- Colecciones (ArrayList)
- Lectura de archivos de texto

## Estructura del proyecto

```text
src
├── data
│   └── GestorDatos.java
│
├── model
│   └── TourTuristico.java
│
└── ui
    └── Main.java

resources
└── tours.txt
```

## Funcionalidades

- Lectura de datos desde archivo TXT.
- Conversión de texto a objetos Java.
- Almacenamiento en ArrayList.
- Recorrido de colecciones.
- Filtrado de información según condiciones.
- Aplicación de encapsulamiento mediante getters y setters.
- Validación de datos en métodos set.

## Archivo de datos

El archivo utilizado para cargar los tours se encuentra en:

```text
resources/tours.txt
```

Ejemplo:

```text
LagoLlanquihue;PuertoVaras;15000
SaltosDelPetrohue;PuertoVaras;18000
VolcanOsorno;PuertoVaras;25000
IslaHuar;Calbuco;12000
FrutillarCultural;Frutillar;10000
```

## Ejecución

1. Abrir el proyecto en NetBeans.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Ejecutar la clase:

```text
src/ui/Main.java
```

4. Revisar la salida en consola.

## Autor
Gustavo Zapata Covarrubias

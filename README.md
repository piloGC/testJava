# Test Java

Desarrollo de evaluacion Java.

## Requisitos

- Java 22
- Maven 3.x

## Configuración

1. Clona el repositorio:

    ```bash
    git clone https://github.com/piloGC/testJava.git
    ```
   
2. Abrir y ejecutar proyecto en IDE de preferencia

3. Abrir el navegador y navegar a `http://localhost:8080/users` para ver la aplicación en funcionamiento.

4. Abrir el navegador y navegar a `http://localhost:8080/h2-console` para ver la base de datos en funcionamiento.


## Estructura del Proyecto

## Descripción de los Directorios y Archivos

- **src/main/java/com/test/Test/controller**: Este directorio contiene los controladores que maneja la solicitud HTTP solicitada, ademas de un método test() retornando un "HOLA MUNDO" visible al navegar a  `http://localhost:8100/users`

- **src/main/java/com/test/Test/entity**: En este directorio se encuentran las entidades de JPA que representan las tablas de la base de datos.

- **src/main/java/com/test/Test/repository**: Aquí se definen las interfaces de repositorio que extienden `JpaRepository` u otras interfaces de Spring Data JPA.

- **src/main/java/com/test/Test/service**: Este directorio contiene la capa de servicio, donde se implementa la lógica de negocio de la aplicación.

- **src/main/java/com/test/Test/util**: En este directorio se encuentran las clases:  'Validations' donde se implementa la validación del correo y contraseña. Además la clase 'ConfigYml' donde se implementa la lógica para obtener los regex de correo y contraseña definido en el archivo application.yml


## Tecnologías Utilizadas

- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database

## Licencia

Este proyecto está bajo la [Licencia MIT](https://opensource.org/licenses/MIT).

## Contacto

Si tienes alguna pregunta o sugerencia, puedes contactarme en [pilar.gonzalez@sermaluc.cl](mailto:pilar.gonzalez@sermaluc.cl).

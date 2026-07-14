# Entrega Final: API Artículos
Entrega final del curso "Backend JAVA"

## 📌 Descripción
API REST para gestionar artículos, construida con Spring Boot y JPA. Permite crear, leer, actualizar y eliminar artículos en una base de datos MySQL.

## 🧩 Tecnologías
- Java 17
- Spring Boot 4.1.0
- Spring Web MVC
- Spring Data JPA
- MySQL Connector/J

## 🚀 Funcionalidades principales
- Listar todos los artículos
- Obtener un artículo por ID
- Crear un artículo nuevo
- Actualizar un artículo existente
- Eliminar un artículo

## 📁 Modelo de datos
Entidad `Article` con los siguientes campos:
- `id` (Long)
- `name` (String)
- `price` (Double)
- `image` (String)

## 🌐 Endpoints disponibles
Base URL: `http://localhost:8080/api/articles`

| Método | Ruta | Descripción |
| --- | --- | --- |
| GET | `/api/articles` | Lista todos los artículos |
| GET | `/api/articles/{id}` | Obtiene un artículo por su ID |
| POST | `/api/articles` | Crea un nuevo artículo |
| PUT | `/api/articles/{id}` | Actualiza un artículo existente |
| DELETE | `/api/articles/{id}` | Elimina un artículo |

### Ejemplo de body para crear/actualizar
```json
{
  "name": "Nombre del artículo",
  "price": 123.45,
  "image": "https://ejemplo.com/imagen.jpg"
}
```

## ⚙️ Configuración de base de datos
Archivo: `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/articulos_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Aseguráte de tener MySQL ejecutándose y una base de datos llamada `articulos_db`.

## ▶️ Cómo ejecutar el proyecto
1. Desde la terminal, en la raíz del proyecto:
   ```bash
   ./mvnw spring-boot:run
   ```
2. O empaquetar y ejecutar el JAR:
   ```bash
   ./mvnw package
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

## 📌 Notas
- El proyecto permite CORS desde cualquier origen (`@CrossOrigin(origins = "*")`).
- La entidad `Article` se mapea a la tabla `article`.
- El servicio usa `ArticleRepository` para interactuar con la base de datos.

## 📺 Demostración
[El video demostración del funcionamiento del API](https://drive.google.com/file/d/1aOU73x-OLZXGMsaURvGs-ZhMaoHF2nXp/view?usp=sharing).
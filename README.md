# 🧙‍♂️ Registro de Magos - Hogwarts API Lab 2

## Readme generado por IA
Este proyecto es una API REST desarrollada con **Spring Boot** para la gestión y registro de magos en Hogwarts. Permite clasificar a los magos por su casa, patronus y afiliación como Mortífagos.

**Repositorio Oficial:** [https://github.com/IPineda24/Registro_de-_magos_lab2.git](https://github.com/IPineda24/Registro_de-_magos_lab2.git)

---

## 🚀 Tecnologías y Herramientas
* **Spring Web:** Para la creación de la API REST, manejo de endpoints y peticiones HTTP.
* **Spring Data JPA:** Para la persistencia de datos, repositorios e integración con el ORM (Hibernate).
* **PostgreSQL Driver:** Controlador JDBC para la conexión y operaciones con la base de datos PostgreSQL.
* **Spring Boot DevTools:** Herramienta para desarrollo ágil, permitiendo recargas rápidas (live reload).
* **Lombok:** Librería para reducir código repetitivo (generación automática de constructores, getters y setters).
---

## 📊 Tabla de Endpoints

| Acción | Método | Endpoint | Descripción |
| :--- | :---: | :--- | :--- |
| **Registrar Mago** | `POST` | `/api/wizards` | Registra un nuevo mago en el sistema. |
| **Listar Todos** | `GET` | `/api/wizards` | Devuelve la lista completa de magos registrados. |
| **Listar Mortífagos** | `GET` | `/api/wizards/deatheaters` | Filtra y devuelve solo magos con `isDeathEater: true`. |
| **Buscar por Patronus** | `GET` | `/api/wizards/patronus/{name}` | Busca magos que posean un patronus específico. |
| **Actualizar Mago** | `PUT` | `/api/wizards/{id}` | Actualiza los datos de un mago mediante su UUID. |
| **Eliminar Mago** | `DELETE` | `/api/wizards/delete/{id}` | Elimina permanentemente a un mago por su UUID. |

---

## 📝 Especificaciones de Datos

### Estructura del JSON (Payload)
Para las peticiones `POST` y `PUT`, se debe enviar el siguiente formato en el cuerpo (Body):

```json
{
    "name": "Harry Potter",
    "house": "Gryffindor",
    "patronus": "Stag",
    "isDeathEater": false
}

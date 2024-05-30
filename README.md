**Aplicación Web de la Obra Social - AlMedin**

**Descripción del Proyecto**

  La empresa **AlMedin**, líder en el sector de la salud y medicina privada en Latinoamérica, ha solicitado la digitalización de sus procesos operativos para mejorar la eficiencia y reducir errores en la gestión de turnos médicos, consulta de especialistas y descarga de recetas médicas. Este proyecto se divide en dos fases: desarrollo del backend y desarrollo del frontend.

**Fase 1:** Backend

 El backend se ha desarrollado utilizando **Java**, siguiendo el patrón de diseño **MVC** (Modelo-Vista-Controlador). Las funcionalidades principales incluyen la gestión de turnos médicos, visualización de la cartilla de especialistas y descarga de recetas médicas. Se ha utilizado el framework **Quarkus** para simplificar la configuración y el desarrollo, y la capa de persistencia se ha manejado con **JPA** (Java Persistence API) y Panache.

**Funcionalidades Backend**

-**Gestión de Turnos Médicos:** Crear, leer, actualizar y eliminar turnos médicos.

-**Visualización de Cartilla de Especialistas:** Consultar la lista de especialistas disponibles con sus horarios y áreas de especialización.

-**Descarga de Recetas Médicas:** Permitir a los pacientes autorizados descargar sus recetas médicas.
 
 **Requerimientos Técnicos Backend**
 
-**Lenguaje de Programación:** Java

-**Framework:** Quarkus

-**Persistencia de Datos:** JPA, Panache

-**Seguridad:** Implementación de autenticación y autorización (opcional con JWT)

-**Documentación de API:** Swagger

 
**Fase 2:** Frontend

El frontend se ha desarrollado utilizando **React.js** para crear una interfaz de usuario intuitiva y amigable. La aplicación permite a los usuarios gestionar eficientemente los turnos médicos, consultar la cartilla de especialistas y descargar recetas médicas. Se ha utilizado **React Router** para la navegación y **Axios** para la comunicación con el backend.

**Funcionalidades Frontend**

-**Solicitud de Turno Médico:** Formulario para programar un nuevo turno médico.

-**Consulta de Cartilla de Especialistas:** Visualización de la lista de especialistas disponibles.

-**Actualización y Cancelación de Turnos:** Formulario para actualizar o cancelar un turno médico existente.

-**Descarga de Receta Médica:** Funcionalidad para que los pacientes autorizados descarguen sus recetas médicas.

**Requerimientos Técnicos Frontend**

-**Lenguaje de Programación:** JavaScript

-**Framework:** React.js

-**Manejo de Estado:** React hooks (useState)

-**Estilo:** CSS/Sass, Bootstrap o Material-UI (opcional)

-**Gestión de Formularios:** Formik o React Hook Form (opcional)

-**Comunicación con Backend:** Axios

**Herramientas Utilizadas**

-**IDE:** Eclipse

-**Asignación de Tareas:** Trello

**Asignación de Tareas en Trello**
El proyecto ha sido gestionado y dividido en tareas a través de **Trello**, siguiendo la metodología ágil. Cada tarea se ha etiquetado según su tipo y área de trabajo (backend, frontend, API, componentes, etc.), y se ha asignado a los desarrolladores correspondientes para asegurar una gestión eficiente y organizada del proyecto.

**Instrucciones de Instalación**

1-**Clonar el repositorio:**
    
    git clone https://github.com/usuario/repositorio.git

2-**Backend:**

-Importar el proyecto en **Eclipse**.

-Configurar la base de datos y actualizar **'application.properties'**.

-Ejecutar la aplicación **Quarkus**.

3-**Frontend:**

Navegar a la carpeta del frontend:

    cd frontend
    
-Instalar las dependencias:

        npm install
  
-Ejecutar la aplicación:

    npm start

**Documentación**

La documentación del código y de la API ha sido generada utilizando **Swagger** para facilitar la comprensión y el uso de la API. Además, se han añadido comentarios explicativos en el código para describir las funcionalidades implementadas.

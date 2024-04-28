# Proyecto de Correos

Este proyecto consiste en una aplicación que permite enviar correos o mensajes al administrador. Los usuarios pueden redactar su asunto y mensaje mediante un formulario de contacto. Además, se lleva un historial de los mensajes redactados, indicando si han sido leídos y contestados. El administrador puede visualizar los mensajes recibidos, ordenados del más reciente al más viejo. También puede bloquear usuarios para dejar de recibir mensajes de ellos, y descargar un Excel con todos los correos recibidos, indicando cuáles ha leído y cuáles ha respondido. Por otro lado, los usuarios pueden descargar un PDF con el mensaje y la respuesta recibidos.

## Características

- Envío de mensajes mediante formulario de contacto.
- Registro de historial de mensajes redactados.
- Marcar mensajes como leídos y contestados.
- Visualización de mensajes para el administrador, ordenados por fecha.
- Bloqueo de usuarios para dejar de recibir mensajes.
- Descarga de Excel para el administrador con registros de correos recibidos, indicando estado de lectura y respuesta.
- Descarga de PDF para los usuarios con el mensaje y la respuesta recibidos.

## Interfaz de Usuario

La interfaz de usuario constará de:

- **Formulario de Contacto:** Permitirá a los usuarios redactar un asunto y un mensaje para enviar al administrador.
- **Historial de Mensajes:** Mostrará todos los mensajes enviados por el usuario, indicando su estado de lectura y respuesta.
- **Lista de Mensajes para el Administrador:** Mostrará todos los mensajes recibidos, ordenados por fecha. Los mensajes no leídos se destacarán en negritas y con un icono indicando su estado. Los mensajes respondidos también se marcarán con un icono adicional.
- **Opciones de Bloqueo de Usuarios:** Permitirá al administrador bloquear usuarios para dejar de recibir mensajes de ellos.
- **Descarga de Archivos:** Tanto el administrador como los usuarios podrán descargar archivos Excel (para el administrador) y PDF (para los usuarios) con la información de los mensajes recibidos.

## Tecnologías Utilizadas

- **Frontend:** HTML, CSS, JavaScript (con framework como React o Angular).
- **Backend:** Node.js con Express u otro framework para el servidor.
- **Base de Datos:** MongoDB, MySQL u otro sistema de gestión de bases de datos relacional o no relacional.
- **Librerías Adicionales:** Se podrían utilizar librerías como nodemailer para el envío de correos electrónicos, y librerías para la generación de archivos Excel y PDF.

## Diagrama de Flujo

A continuación se muestra un diagrama de flujo que representa las interacciones entre el usuario y el sistema:

[Diagrama de Flujo](link_al_diagrama_de_flujo)

## Instalación y Uso

1. Clonar el repositorio desde GitHub.
2. Instalar las dependencias del frontend y backend.
3. Configurar la conexión a la base de datos y el servidor de correo electrónico.
4. Ejecutar el servidor backend.
5. Ejecutar el servidor frontend.
6. Acceder a la aplicación desde el navegador.

## Contribución

Las contribuciones al proyecto son bienvenidas. Si desea contribuir, siga estos pasos:

1. Realice un fork del repositorio.
2. Cree una rama para su función (`git checkout -b feature/NombreDeLaFuncion`).
3. Realice sus cambios y haga commits (`git commit -am 'Agregar una nueva función'`).
4. Haga push a la rama (`git push origin feature/NombreDeLaFuncion`).
5. Cree una solicitud de extracción en GitHub.

## Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, consulte el archivo `LICENSE`.

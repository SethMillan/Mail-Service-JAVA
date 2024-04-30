# Proyecto de Correos

Este proyecto consiste en una aplicación que permite enviar correos o mensajes al administrador. Los usuarios pueden redactar su asunto y mensaje mediante un formulario de contacto. Además, se lleva un historial de los mensajes redactados, indicando si han sido leídos y contestados. El administrador puede visualizar los mensajes recibidos, ordenados del más reciente al más viejo. También puede bloquear usuarios para dejar de recibir mensajes de ellos, y descargar un Excel con todos los correos recibidos, indicando cuáles ha leído y cuáles ha respondido. Por otro lado, los usuarios pueden descargar un PDF con el mensaje y la respuesta recibidos.

## Características

- Envío de mensajes mediante formulario de contacto.
- Registro de historial de mensajes redactados.
- Marcar mensajes como leídos y contestados.
- Visualización de mensajes para el administrador, ordenados por fecha.
- Bloqueo de usuarios para dejar de recibir mensajes.
- Descarga de Excel para el administrador con registros de correos recibidos, indicando estado de lectura y respuesta.
- Descarga de PDF para los usuarios/administrador con el mensaje y la respuesta recibidos.

## Interfaz de Usuario

La interfaz de usuario constará de:

- **Formulario de Contacto:** Permitirá a los usuarios redactar un asunto y un mensaje para enviar al administrador.
- **Listado de Mensajes:** Mostrará todos los mensajes enviados por el usuario, indicando su estado de lectura y respuesta.
- **Lista de Usuarios para el Administrador:** Mostrará todos los usuarios, ordenados por fecha. Los usuarios bloqueados se indicaran como tal.
- **Opciones de Bloqueo de Usuarios:** Permitirá al administrador bloquear usuarios para dejar de recibir mensajes de ellos.
- **Descarga de Archivos:** Tanto el administrador como los usuarios podrán descargar archivos Excel (para el administrador) y PDF (para los usuarios y el administrador) con la información de los mensajes recibidos.

## Tecnologías Utilizadas

- **Frontend:** Java Swing
- **Backend:** Java puro y duro
- **Base de Datos:** MySQL
- **Librerías Adicionales:** lombook, itext7, edisonCore, Gson, mysql-connector-j

## Diagrama de Flujo

A continuación se muestra un diagrama de flujo que representa la base de datos:

[Diagrama de Flujo](link_al_diagrama_de_flujo)

## Comandos para crear la base de datos (copiar y pegar)

## Instalación y Uso

1. Clonar el repositorio desde GitHub.
2. Tener instalado NetBeans para poder visualizar la interfaz de JavaSwing.
3. Crear la base de datos local con los comandos que se escribieron con anterioridad.
4. Verifica que el jdk del proyecto y el tuyo coincidan
5. Ejecutar la aplicacion


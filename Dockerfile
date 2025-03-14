FROM ubuntu:latest
LABEL authors="PC"

ENTRYPOINT ["top", "-b"]

# Usamos una imagen de OpenJDK con JDK 11
FROM openjdk:11-jdk-slim

# Establecemos el directorio de trabajo
WORKDIR /app

# Copiamos el archivo JAR al contenedor
COPY build/libs/*.jar app.jar

# Exponemos el puerto de la app
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

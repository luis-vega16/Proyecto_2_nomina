# Usa una imagen base de Java (adapta la versión según la que estás usando en tu proyecto)
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado en el contenedor
COPY target/financial-api-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que tu aplicación escucha
EXPOSE 8080

# Define el comando para ejecutar tu aplicación
CMD ["java", "-jar", "app.jar"]
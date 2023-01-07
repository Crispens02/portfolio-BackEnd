# Especifica la imagen base que quieres utilizar para tu contenedor
FROM amazoncorretto:17-alpine-jdk

# Establece el autor del archivo Dockerfile (opcional)
MAINTAINER CristianCrispens

# Crea un directorio en el contenedor para almacenar el archivo JAR
RUN mkdir /app

# Copia el archivo JAR al directorio creado en el contenedor
COPY target/com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar /app/com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar

# Establece el directorio de trabajo del contenedor
WORKDIR /app

# Utiliza una variable de entorno para personalizar el nombre del archivo JAR
ENV JAR_FILE=com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar

# Ejecuta el archivo JAR al iniciar el contenedor
ENTRYPOINT ["java","-jar","com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar"]
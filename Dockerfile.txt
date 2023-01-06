FROM amazoncorretto:11-alpine-jdk

MAINTAINER CristianCrispens

COPY target/com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/com.portfolio.ProyectoFinal-0.0.1-SNAPSHOT.jar"]
# Usar uma imagem base com Java
FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY target/seu-aplicativo.jar app.jar


EXPOSE 8080


ENTRYPOINT ["java","-jar","app.jar"]

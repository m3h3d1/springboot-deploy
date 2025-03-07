FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/lib/springboot-demo-0.0.1-SNAPSHOT.jar springboot-demo.jar
EXPOSE 8080
CMD["java", "-jar", "springboot-demo.jar"]

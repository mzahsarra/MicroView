FROM openjdk:21-jdk
COPY target/MicroServiceA-0.0.1-SNAPSHOT.jar app.jar
ENV PORT=8080
ENV KAFKA_URL=http://localhost:29092
ENV POSTGRES_URL=localhost:5433
EXPOSE $PORT
ENTRYPOINT ["java","-jar","app.jar"]
FROM openjdk:21-jdk
COPY target/MicroServiceC-0.0.1-SNAPSHOT.jar app.jar
ENV PORT=8082
ENV KAFKA_URL=http://localhost:29092
ENV POSTGRES_URL=localhost:5433
ENV KAFKA_GROUP_ID=group_id_MS_C
ENV SERVICEB_URL=http://localhost:8081
EXPOSE $PORT
ENTRYPOINT ["java","-jar","app.jar"]
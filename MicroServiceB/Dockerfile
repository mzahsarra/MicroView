FROM openjdk:21-jdk
COPY target/MicroServiceB-0.0.1-SNAPSHOT.jar app.jar
ENV PORT=8081
ENV KAFKA_URL=http://localhost:29092
ENV POSTGRES_URL=localhost:5433
ENV SERVICEA_URL=http://localhost:8080
ENV KAFKA_GROUP_ID=group_id_MS_B
EXPOSE $PORT
ENTRYPOINT ["java","-jar","app.jar"]
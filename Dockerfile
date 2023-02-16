FROM openjdk:17
WORKDIR /usr/src/myapp
COPY ./target/my-service.jar my-service.jar
CMD ["java", "my-service.jar"]
EXPOSE 8080

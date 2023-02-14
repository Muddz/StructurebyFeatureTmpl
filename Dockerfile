FROM openjdk:17
WORKDIR /usr/src/myapp
COPY ./target/my-service.jar my-service.jar
CMD ["java", "my-service.jar"]
EXPOSE 8080


#CMD java ${JAVA_OPTS} -Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8" -jar pdsm-data-service.jar
FROM openjdk:17-ea-slim
VOLUME /tmp
COPY target/user-service-1.0.jar UserSerivce.jar
ENTRYPOINT ["java","-jar","UserService.jar"]
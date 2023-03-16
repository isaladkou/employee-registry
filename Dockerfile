FROM openjdk:11-jre
EXPOSE 8080
RUN mkdir /myappp
WORKDIR /myapp
ADD /target/employee-registry-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","employee-registry-0.0.1-SNAPSHOT.jar"]
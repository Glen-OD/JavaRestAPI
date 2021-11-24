FROM ubuntu:18.04
RUN apt-get update -y
WORKDIR /RestServiceApplication
ARG DEPENDENCY=./rest-servicetarget/rest-service-0.0.1-SNAPSHOT
COPY ./rest-service/target service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/rest-service-0.0.1-SNAPSHOT.jar"]
CMD ["RestServiceApplication.java"]
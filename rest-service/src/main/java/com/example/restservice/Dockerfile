FROM ubuntu:18.04
RUN apt-get update -y
WORKDIR /RestServiceApplication
ARG DEPENDENCY=target/rest-service-0.0.1-SNAPSHOT
COPY ./RestServiceApplication
EXPOSE 8080
ENTRYPOINT ["java","-jar","/rest-service-0.0.1-SNAPSHOT.jar"]
CMD ["RestServiceApplication.java"]
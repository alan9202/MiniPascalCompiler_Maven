FROM maven:3.5.3-jdk-8-alpine

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

CMD mvn compile
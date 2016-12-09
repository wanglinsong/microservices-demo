FROM ubuntu:14.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y software-properties-common

ENV LANG en_US.UTF-8
RUN locale-gen $LANG
RUN add-apt-repository ppa:openjdk-r/ppa
RUN apt-get update && apt-get install -y openjdk-8-jdk  && apt-get clean

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
RUN export JAVA_HOME
RUN java -version

VOLUME /tmp
EXPOSE 8888

ADD target/accounts-server-1.0.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]

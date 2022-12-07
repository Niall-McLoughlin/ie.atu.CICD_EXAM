FROM openjdk:17
COPY target/ /temp
WORKDIR /tmp
CMD java-jar projectname-1.0-SNAPSHOT.jar


FROM openjdk:11
COPY "./target/empresa-0.0.1-SNAPSHOT.jar" "app.jar"
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/app.jar"]
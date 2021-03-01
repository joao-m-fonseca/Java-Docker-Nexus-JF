FROM openjdk:16-jdk-alpine
COPY *.jar /app/calculator.jar
ENTRYPOINT ["java","-jar","/app/calculator.jar"]
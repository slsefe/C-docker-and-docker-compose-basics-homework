FROM java:8

ADD build/libs/bob-0.0.1-SNAPSHOT.jar app-bob.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app-bob.jar"]

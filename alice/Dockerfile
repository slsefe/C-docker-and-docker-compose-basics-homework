FROM java:8

ADD build/libs/alice-0.0.1-SNAPSHOT.jar app-alice.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app-alice.jar"]

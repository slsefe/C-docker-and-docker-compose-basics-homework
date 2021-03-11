FROM java:8

ADD bob/build/libs/bob-0.0.1-SNAPSHOT.jar app-bob.jar
ADD alice/build/libs/alice-0.0.1-SNAPSHOT.jar app-bob.jar
ADD wait-for-it.sh wait-for-it.sh

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app-bob.jar"]

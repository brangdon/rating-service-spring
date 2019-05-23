
# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine


# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/rating-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} rating-service.jar

# Run the jar file
ENTRYPOINT ["java","-Dcom.service.rating.ratingservice=file:/dev/./urandom","-jar","/rating-service.jar"]
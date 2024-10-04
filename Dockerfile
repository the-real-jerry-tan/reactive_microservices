
# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the project's build output to the container
COPY target/webfluxapp-1.0-SNAPSHOT.jar /app/webfluxapp.jar

# Expose the port on which the service runs
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "webfluxapp.jar"]

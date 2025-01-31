# Use OpenJDK 25 as the base image
FROM openjdk:25-jdk

# Copy the JAR file into the image
ADD target/rest-demo.jar rest-demo.jar

# Set the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/rest-demo.jar"]
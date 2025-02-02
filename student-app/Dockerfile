# Use OpenJDK 25 as the base image
FROM openjdk:25-jdk

# Copy the JAR file into the image
ADD target/student-app.jar student-app.jar

# Set the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/student-app.jar"]
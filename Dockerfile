FROM maven:3.8.2-jdk-11 AS base

# Install OpenJDK 17
RUN apt-get update && apt-get install -y openjdk-17-jdk

FROM base AS build

# Your build steps here

# Example:
WORKDIR /app
COPY . .
RUN mvn clean package

# Final stage
FROM openjdk:17-jdk-alpine
COPY --from=build /app/target/your-application.jar /app/your-application.jar
CMD ["java", "-jar", "/app/your-application.jar"]

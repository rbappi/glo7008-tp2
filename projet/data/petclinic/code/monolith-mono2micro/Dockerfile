# syntax=docker/dockerfile:1
FROM maven:3.8.6-openjdk-18-slim
WORKDIR /app
COPY . .
CMD ["./mvnw", "jetty:run-war"]
EXPOSE 8080
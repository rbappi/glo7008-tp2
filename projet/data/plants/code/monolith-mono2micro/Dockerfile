FROM gradle:5.2.1-jdk8-slim
WORKDIR /app
USER root
COPY . .
RUN ./gradlew clean installApps copyServerLibs
EXPOSE 9080
ENTRYPOINT ["/app/gradlew", "libertyRun", "--no-daemon"]

./mvnw clean install -DskipTests
docker build -t koalaa13/user-service:latest .
docker push koalaa13/user-service:latest
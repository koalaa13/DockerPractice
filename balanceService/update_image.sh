./mvnw clean install -DskipTests
docker build -t koalaa13/balance-service:latest .
docker push koalaa13/balance-service:latest
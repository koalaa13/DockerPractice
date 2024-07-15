./mvnw clean install -DskipTests
docker build -t koalaa13/hw2-repository:latest .
docker push koalaa13/hw2-repository:latest
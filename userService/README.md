***Basics:***
1) To build application use script ```./mvnw clean install -DskipTests``` on unix or ```mvnw.cmd``` on windows
2) To build image locally using docker use command: ```docker build -t <name>```
3) This image is public on docker hub, so you can just run it with ```docker run koalaa13/user-service``` or ```docker run -p 8000:8000 koalaa13/user-service```

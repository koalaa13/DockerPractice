1) To build application use script ```./mvnw``` on unix or ```mvnw.cmd``` on windows
2) To build image locally using docker use command: ```docker build -t <name>```
3) This image is public on docker hub, so you can just run it with ```docker run koalaa13/hw2-repository``` or ```docker run -p 8000:8000 koalaa13/hw2-repository```
4) To start app in minikube do steps:
   * ```minikube start``` to start minikube, install it if you didn't do this
   * ```kubectl apply -f k8s/.``` to apply all manifests
5) To delete app from minikube use ```kubectl delete -f k8s/.```

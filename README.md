***Basics:***
1) To build application use script ```./mvnw clean install -DskipTests``` on unix or ```mvnw.cmd``` on windows
2) To build image locally using docker use command: ```docker build -t <name>```
3) This image is public on docker hub, so you can just run it with ```docker run koalaa13/hw2-repository``` or ```docker run -p 8000:8000 koalaa13/hw2-repository```

***Minikube guide:*** 
1) To start app in minikube do steps:
   * ```minikube start``` to start minikube, install it if you didn't do this
   * ```kubectl apply -f k8s/.``` to apply all manifests
2) To delete app from minikube use ```kubectl delete -f k8s/.```

***Helm guide:***
1) To install app in kuber use command: ```helm install <your_app_name> ./helm/chart```
2) To uninstall app from kuber use command ```helm uninstall <your_app_name>```
3) To change default values of helm's ```values.yaml``` use ```--set valueName=overridenValue```

***Helm values:***
1) ```db.name``` - name of created database
2) ```db.defaultUser``` - name of database user
3) ```db.defaultPassword``` - password of default database user
4) ```replicaCount - counts``` of created app's pods 
5) ```port - containers``` port for host app on
6) ```persistentVolume.folder``` - folder for database persistent volume
7) ```persistentVolume.storage``` - storage capacity of database persistent volume
8) ```persistentVolume.claim.storage``` - storage capacity for database persistent volume claim

***Postman collections***

Postman collections are exported to ```./postman``` folder.
```postmanRequests.json``` is collection for testing /health routes
```userRequests.json``` is collection for testing user requests
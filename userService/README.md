***Basics:***
1) To build application use script ```./mvnw clean install -DskipTests``` on unix or ```mvnw.cmd``` on windows
2) To build image locally using docker use command: ```docker build -t <name>```
3) This image is public on docker hub, so you can just run it with ```docker run koalaa13/hw2-repository``` or ```docker run -p 8000:8000 koalaa13/hw2-repository```

***MANIFESTS IN K8S FOLDER ARE OUTDATED USE HELM INSTEAD***

***Minikube guide:*** 
1) To start app in minikube do steps:
   * ```minikube start``` to start minikube, install it if you didn't do this
   * ```kubectl apply -f k8s/.``` to apply all manifests
2) To delete app from minikube use ```kubectl delete -f k8s/.```

***Helm guide:***

There are nginx and prometheus dependencies in chart, so you don't need to install it manually.

***It's important to name release ```app```.***
1) ```helm dependency build ./helm/chart``` to build dependencies
2) To install app in kuber use command: ```helm install app ./helm/chart```
3) To uninstall app from kuber use command ```helm uninstall app```
4) To change default values of helm's ```values.yaml``` use ```--set valueName=overridenValue```

***Helm values you might want to change:***
1) ```postgresql.auth.database``` - name of created database
2) ```postgresql.auth.postgresPassword``` - password of default database user
3) ```replicaCount``` - counts of created app's pods 
4) ```port``` - containers port for host app on

***Postman collections***

Postman collections are exported to ```./postman``` folder.
* ```postmanRequests.json``` is collection for testing /health routes
* ```userRequests.json``` is collection for testing user requests

***Grafana dashboards***

There are 2 dashboards in ```./dashboard``` folder. 
* database-dashboard.json is public from https://grafana.com/oss/prometheus/exporters/postgres-exporter/?tab=dashboards
* dashboard.json is hand-made specially for app.

There is also some screenshots of dashboard's graphics in ```./dashboard/screenshots``` folder while stressing an app.

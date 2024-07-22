echo 'Use http://localhost:9000 to reach grafana'
kubectl port-forward service/app-grafana 9000:80
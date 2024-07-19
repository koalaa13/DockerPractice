echo 'Use http://localhost:9000 to reach grafana'
kubectl port-forward service/stack-grafana 9000:80
Deployment to Kubernetes
==============

Push to registry  
----------  
docker push <image id>  
e.g. docker push registry.digitalocean.com/richardchanapp/samplesparkjava-1.0   

Apply Setting (creating nodes, pods and loadbalancer)  
-------------------------  
kubectl apply -f deployment.yaml

Restart Deployment  
------------------   
kubectl rollout restart deployment samplesparkjava

Endpoint
----------
NAME              TYPE           CLUSTER-IP     EXTERNAL-IP      PORT(S)          AGE
samplesparkjava   LoadBalancer   10.245.7.152   159.65.212.231   8800:31628/TCP   35m

http://<endpoint>:8800/hello

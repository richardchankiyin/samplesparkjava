# samplesparkjava
Sample Spark Java

Build Jar and Image  
-------------------
./buildjardockerimage.sh  

Run From Docker  
---------------  
./run_from_docker.sh 

End Points
----------------
Port: 4567  

curl -s http://localhost:4567/hello 
Hello, world

curl -s http://localhost:4567/hello/richard (richard is the value of variable)   
Hello, richard

curl -s http://localhost:4567/reverseme/2345 (2345 is the value of variable)
5432

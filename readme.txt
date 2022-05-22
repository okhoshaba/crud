https://java2blog.com/spring-restful-web-services-crud-example/
!!!
https://java2blog.com/spring-boot-rest-example/



http://localhost:8080/data/4
http://localhost:8080/allData
mvn jetty:run

crudProcessingData
timeStamp (метка времени)
responseTime

curl post request
https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
curl -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:3000/data
=======

post add
curl -d '{"timeStamp":"NewYork", "responseTime":"6000"}' -H "Content-Type: application/json" -X POST http://localhost:8080/allData

delete
curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/data/3


----------------
!!!
docker compose war file
https://medium.com/@pra4mesh/deploy-war-in-docker-tomcat-container-b52a3baea448
https://devops4solutions.com/deploy-a-tomcat-application-using-docker-compose/
https://www.javainuse.com/devOps/docker/docker-war





#!/bin/bash

for (( count = 1; count <= 11; count++ ))
do

#Using expr within command substitute
  timeSleep=$(echo "$count*0.01" | bc -l)

  curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/data/$count &
  sleep $timeSleep

  curl -H "Content-Type: application/json" -X GET http://localhost:8080/allData 
#  curl -H "Content-Type: application/json" -X GET http://localhost:8080/data/2
#  curl -H "Content-Type: application/json" -X GET http://localhost:8080/data/$count
  echo $count
  echo $timeSleep
  sleep 60 
done


#!/bin/bash

for (( count = 1; count <= 11; count++ ))
do

#Using expr within command substitute
  timeSleep=$(echo "$count*0.01" | bc -l)

    sleep $timeSleep
    curl -H "Content-Type: application/json" -X GET http://localhost:8080/data/$count
    echo $count
    echo $timeSleep
  sleep 1 
done


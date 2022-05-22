#!/bin/bash

#Using expr within command substitute
#  timeSleep=$(echo "$count*0.01" | bc -l)
#  timeSleep=$(echo "$count*0.01" | bc -l)
#  argum=(( $@+1 ))
  curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/data/$2 &
  sleep $1

  curl -H "Content-Type: application/json" -X GET http://localhost:8080/allData 
#  curl -H "Content-Type: application/json" -X GET http://localhost:8080/data/2
#  curl -H "Content-Type: application/json" -X GET http://localhost:8080/data/$count
#  echo $timeSleep
  echo $1
  echo $2
#  sleep 60 


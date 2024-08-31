#!/bin/sh

#APPNAME=petclinic
#PORT=8080

APPNAME=plants
PORT=9080

#docker run --name=$APPNAME -p $PORT:$PORT $APPNAME\_m2m

docker logs $APPNAME > $APPNAME\_ouput.log

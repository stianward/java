#!/bin/sh
mvn clean package && docker build -t com.mycompany/Ejemplo1MVC .
docker rm -f Ejemplo1MVC || true && docker run -d -p 9080:9080 -p 9443:9443 --name Ejemplo1MVC com.mycompany/Ejemplo1MVC
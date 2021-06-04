#!/bin/sh
mvn clean package && docker build -t com.mycompany/EjemplosEJSTL .
docker rm -f EjemplosEJSTL || true && docker run -d -p 9080:9080 -p 9443:9443 --name EjemplosEJSTL com.mycompany/EjemplosEJSTL
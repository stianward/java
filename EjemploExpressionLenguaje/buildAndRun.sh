#!/bin/sh
mvn clean package && docker build -t com.mycompany/EjemploExpressionLenguaje .
docker rm -f EjemploExpressionLenguaje || true && docker run -d -p 9080:9080 -p 9443:9443 --name EjemploExpressionLenguaje com.mycompany/EjemploExpressionLenguaje
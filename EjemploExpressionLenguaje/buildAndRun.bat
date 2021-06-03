@echo off
call mvn clean package
call docker build -t com.mycompany/EjemploExpressionLenguaje .
call docker rm -f EjemploExpressionLenguaje
call docker run -d -p 9080:9080 -p 9443:9443 --name EjemploExpressionLenguaje com.mycompany/EjemploExpressionLenguaje
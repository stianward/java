@echo off
call mvn clean package
call docker build -t com.mycompany/Ejemplo1MVC .
call docker rm -f Ejemplo1MVC
call docker run -d -p 9080:9080 -p 9443:9443 --name Ejemplo1MVC com.mycompany/Ejemplo1MVC
@echo off
call mvn clean package
call docker build -t com.mycompany/EjemplosEJSTL .
call docker rm -f EjemplosEJSTL
call docker run -d -p 9080:9080 -p 9443:9443 --name EjemplosEJSTL com.mycompany/EjemplosEJSTL
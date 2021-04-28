<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP QUE MODIFICA UN JAVABEAN RECTANGULO</title>
    </head>
    <body>
        <h1>SP QUE MODIFICA UN JAVABEAN RECTANGULO</h1>
        <!--UTILIZAMOS LA CLASE RECTANGULO COMO JAVA BEAN  Y DEFINIMOS UN SCOPE DE TIPO SESSION QUE TENDRA DURACION DE 30 MINUTOS-->
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        modficamos los atributos:
        <%
        int baseValor=5;
        int alturaValor=10;
        %>
        <!--UTILIZANDO EL JS:SETPROPERTY en name, indicamos el nombre de la variable definida en <JSP:USEBEAN>. En property indicamos la propiedad que será modificada de la
        clase Rectangulo.java. en Value definimos el valor que tendra.-->
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        
        Nuevo valor de base: <%=baseValor%>
        <br/>
        Nuevo valor de altura <%=alturaValor%>
        
    </body>
</html>

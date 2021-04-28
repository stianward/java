<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP QUE LEE VALORES DEL JAVA BEAN</title>
    </head>
    <body>
        <h1>JSP QUE LEE VALORES DEL JAVA BEAN</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <br/>
        VALOR BASE:<jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        VALOR ALTURA:<jsp:getProperty name="rectangulo" property="altura"/>
        <br/>
        VALOR AREA: <jsp:getProperty name="rectangulo" property="areaRectangulo"/>
        <br/>
        <a href="index.jsp">REGRESAR</a>
        
    </body>
</html>

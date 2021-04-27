<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EJEMPLO INCLUSION DINAMICA</h1>
        <br/>
        <jsp:include page="paginas/recursoPublicoJSP.jsp"/>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
        
        
    </body>
</html>

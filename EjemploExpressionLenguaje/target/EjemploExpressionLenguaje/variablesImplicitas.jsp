
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VARIABLES IMPLICITAS</title>
    </head>
    <body>
        <h1>VARIABLES IMPLICITAS</h1>
        
        <ul>
            <li>nombre aplicacion: ${pageContext.request.contextPath}</li>
            <h1>${header["User-Agent"]}</h1>
            <li> valor cookie: ${cookie.JSESSIONID.value}</li>
            <li>web server: ${pageContext.servletContext.serverInfo}</li>
            <li>valor parametro enviado desde otros JSP: ${param.usuario}</li>
            
        </ul>
            <A href="index.jsp">retornar!..</A>
    </body>
</html>

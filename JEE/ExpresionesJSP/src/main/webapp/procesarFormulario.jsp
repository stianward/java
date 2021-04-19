<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Nombre: <%= request.getParameter("name")%>
        Password: <%=request.getParameter("password")%>
        
        <h2>el usuario es: <%= request.getParameter("name")%> y la contraseña es: <%=request.getParameter("password")%></h2>
        La sesion: <%= request.changeSessionId() %>
    </body>
</html>


<!DOCTYPE html>

<%
String fondo=request.getParameter("fondo");
String color=request.getParameter("color");
if(fondo.equals("") ||color.equals("")){
    fondo="grey";
    color="red";
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="<%=fondo %>" style="color:<%=color%>">
        <h1>Hello World!</h1>
    </body>
</html>

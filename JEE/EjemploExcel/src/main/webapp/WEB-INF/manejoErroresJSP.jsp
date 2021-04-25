<!--Indica que esta directiva manejara las expciones-->
<%@page isErrorPage="true"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>manejo de errores</h1>
        Ocurrio un error <%=exception.getMessage()%>
        <textarea cols="30" rows="5">
     
                <%
                    exception.printStackTrace(new PrintWriter(out));
                %>    
        
            
        </textarea>
   
</body>
</html>

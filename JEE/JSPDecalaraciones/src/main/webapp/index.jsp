<%--AGREGAMOS UNA DECLARACION DE JSP--%>
<%!
private String name="christian";
public String getUsuario(){

return this.name;
}

//declaramos un contado de visitias
private int contador=1;
    
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USO DECLARACIONES CON JSP</title>
    </head>
    <body>
        <h1>USO DECLARACIONES CON JSP</h1>
        <h3>hola! <%=this.name%></h3>
        <h4>hola! a traves del metodo  <%=this.getUsuario()%></h4>
        <h5>contador de visitas: <%=this.contador++%></h5>
        
    </body>
</html>

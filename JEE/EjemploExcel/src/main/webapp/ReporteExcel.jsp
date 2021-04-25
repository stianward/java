<%@page import="java.lang.String"%>
<!--directiva para importar clases java-->
<%@page import="utilerias.Conversiones,java.util.Date"%>
<!--DIRECTIVA PARA DEFINIR EL CONTENT -->
<%@page contentType="application/vnd.ms-exel"%>
<!--DIFINO UN SCRIPTLET -->
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>
<!--DIRECTIVA PARA CONTROLAR LOS ERRORES-->
<%@page errorPage="/WEB-INF/manejoErroresJSP.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DIRECTIVAS CON JAVA</h1>
        <table border="1">
            <tr>
                <th>Curos</th>
            <th>Descripcion</th>
            <th>Fecha</th>

        </tr>

        <tr>
            <td>1.FUNDAMENTOS DE JAVA</td>
            <td>APRENDEREMOS LA SITNAXISO BASICA DE  JAVA</td>
            <td><%=Conversiones.format(new Date())%></td>
        </tr>
        <tr>
            <td>2.PROGRAMACION CON JAVA</td>
            <td>APRENDEREMOS JAVA OO</td>
            <td><%=Conversiones.format(new Date())%></td>
            <td><%=Conversiones.format("500")%></td>
          
        </tr>
    </table>

</body>
</html>

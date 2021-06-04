
<!--importamos libreria de core-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL CORE</title>
    </head>
    <body>
        <h1>JSTL CORE (JAVA STANDAR TAG LIBRARY)</h1>
        <!--MANIPULACION DE VARIABLES -->


        <!-- DEFINIMOS VARIABLE -->
        <c:set var="nombre" value="juan"/>


        <!-- DESPLEGABLES EL VALOR DE LA VARIABLE -->
        variable nombre: <c:out value="${nombre}"/>
        
        <!-- DEFINIMOS VARIABLE CON CODIGO HTML -->
        <c:out value="<h4>hola</h4>" escapeXml="false"/>
        <!-- escapeXml="false" Evita que no se muestre codigo HTML -->
        
        <!-- CODIGO CONDICIONADO IF-->
        <!-- DESPLEGAEL VALOR DE LA VARIABLE -->
        <c:set var="bandera" value="true"/>
        
        <c:if test="${!bandera}">
            la bandera es verdadera
        </c:if>
            
        <!-- CODIGO CONDICIONADO SWITCH-->
        <!-- DESPLEGABLE VALOR DE LA VARIABLE -->
        <c:if test="${param.opcion!=null}">
            <c:choose>
                <c:when test="${param.opcion==1}">
                    opcion 1 seleccionada
                    
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${param.opcion==2}">
                    opcion 2 seleccionada
                    
                </c:when>
                <c:otherwise>
                    opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
<!--ITERAR ARREGLO-->
    <%
    String nombres[]={"marco","marcos","karen","eileen"};
    request.setAttribute("nombres", nombres);
    
    %>
<!--ITERAR ARREGLO NOMBRES-->    
<UL>
    <c:forEach var="persona" items="${nombres}">
        <li>nombre:${persona}</li>
    </c:forEach>
    
</UL>
    
    </body>
</html>

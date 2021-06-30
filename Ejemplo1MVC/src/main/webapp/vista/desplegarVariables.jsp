<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DESPLIEGUE VARIABLES</title>
    </head>
    <body>
        <h1>DESPLIEGUE VARIABLES</h1>
        <!--ORDEN DE LOS ALCANCES
        --PAGE ASOCIADO A LOS JSP
        --REQUEST
        --SESSION
        --APLICATION
        
        
        -->
        <!--ESTA VARIABLE SERÁ BUSCADA EN CADA UNO DE LOS ALCANCES Y OBTENDRA SU VALOR EN EL PRIMERO QUE LO ENCUENTRE : (REQUEST)-->
        variable alcance REQUEST: ${mensaje}
         <br/>
        <!--ESTA VARIABLE SERÁ BUSCADA EN CADA UNO DE LOS ALCANCES Y OBTENDRA SU VALOR EN EL PRIMERO QUE LO ENCUENTRE : (SESSION)-->
        variable alcance sesion:
        <br/>
        Rectangulo:
        <!--LLAMA AL getBase del BEAN-->
        BASE: ${rectangulo.base}
        <br/>
        <!--LLAMA AL getAltura del BEAN-->
        ALTURA: ${rectangulo.altura}
        <br/>
        <!--LLAMA AL getArea del BEAN-->
        AREA: ${rectangulo.area}
        <br/>
        
        <a href="${pageContext.request.contextPath}/index.jsp">regresar al inicio</a>
        <!-- pageContext.request.contextPath = REGRESA EL NOMBRE DE LA APLICACION -->
        
    </body>
</html>

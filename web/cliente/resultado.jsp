<%-- 
    Document   : resultado
    Created on : Jun 21, 2015, 4:36:06 PM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="<c:url value="/main.css" />"
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getAttribute("resultado").equals("Correcto")){
                
                %>
                <p> Operacion Correcta
                <%
            }else{
                %>
                <p> Operacion Incorrecta
                <%
            }
        %>
    </body>
</html>

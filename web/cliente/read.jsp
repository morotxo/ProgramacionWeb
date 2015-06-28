<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : Jun 21, 2015, 3:46:10 PM
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
    <jsp:useBean id="ejbCliente" scope="request" class="EJB.EJBCliente" />

       <h1>Lista de Clientes!</h1>
        <table>
            <thead>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Ciudad</th>
                <th>Pais</th>
                <th>Telefono</th>
                <th>Email</th>
            </thead>
            <tbody>
            <c:forEach var="item" items="${ejbCliente.listaCliente}">
                <tr>
                    <td>${item.getIdCliente()}</td>
                    <td>${item.getNombre()}</td>
                    <td>${item.getApellido()}</td>
                    <td>${item.getCiudad()}</td>
                    <td>${item.getPais()}</td>
                    <td>${item.getTelefono()}</td>
                    <td>${item.getEmail()}</td>
                
                </tr>
            </c:forEach>
            </tbody>
        </table>
            
    </body>
</html>

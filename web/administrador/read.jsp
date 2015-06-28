<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : Jun 21, 2015, 6:15:26 PM
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
        <jsp:useBean id="ejbAdmin" scope="request" class="EJB.EJBAdmin" />
         <h1>Lista de Administradores!</h1>
        <table>
            <thead>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Email</th>
                <th></th>
            </thead>
            <tbody>
            <c:forEach var="item" items="${ejbAdmin.listaAdministrador}">
                <tr>
                    <td>${item.getIdAdmin()}</td>
                    <td>${item.getNombre()}</td>
                    <td>${item.getApellido()}</td>
                    <td>${item.getTelefono()}</td>
                    <td>${item.getEmail()}</td>
                    <td><input id="${item.getIdAdmin()}" type="button" onclick ="editarAdmin(this.id);" value="Editar"></td>

                </tr>
            </c:forEach>
            
            </tbody>
        </table>
    </body>
    <script>
        function editarAdmin(id,email){
            window.location.href="servletAdminUpdate?id="+id;
        }
    </script>
</html>

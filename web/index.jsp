<%-- 
    Document   : index
    Created on : Jun 21, 2015, 12:45:00 PM
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
        <ul>
            <li>
                <a href="servletProductoInsert"><h2>Registrar Producto</h2></a>
            </li>
            <li>
                <a href="servletProductoRead"><h2>Listar Productos</h2></a>
            </li>
            <li>
                <a href="servletClienteInsert"><h2>Registrar Cliente</h2></a>
            </li>
            <li>
                <a href="servletClientesRead"><h2>Listar Clientes</h2></a>
            </li>
            <li>
                <a href="servletAdminInsert"><h2>Agregar Administrador</h2></a>
            </li>
            <li>
                <a href="servletAdminRead"><h2>Listar Administradores</h2></a>
            </li>
            <li>
                <a href="servletCategoriaRead"><h2>Listar Categorias</h2></a>
            </li>
        </ul>
    </body>
</html>

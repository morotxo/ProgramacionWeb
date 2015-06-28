<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : Jun 21, 2015, 3:06:33 PM
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
al         <jsp:useBean id="ejbProducto" scope="request" class="EJB.EJBProducto" />
        <h1>Lista de productos!</h1>
        <table>
            <thead>
                <th>idProducto</th>
                <th>Descripcion</th>
                <th>Precio</th>
                <th>Marca</th>
                <th>Categoria</th>
                <th>Stock</th>
                <th></th>
            </thead>
            <tbody>
            <c:forEach var="item" items="${ejbProducto.listaProducto}">
                <tr>
                    <td>${item.getIdProducto()}</td>
                    <td>${item.getDescripcion()}</td>
                    <td>${item.getPrecio()}</td>
                    <td>${item.getMarca()}</td>
                    <td>${item.getCategoria().getIdCategoria()}</td>
                    <td>${item.getStock()}</td>
                    <td><input id="${item.getIdProducto()}" type="button" onclick ="editarProducto(this.id);" value="Editar"></td>
                </tr>
            </c:forEach> 
            </tbody>
        </table>
    </body>
    <script>
        function editarProducto(id){
            window.location.href="servletProductoUpdate?id="+id;
        }
    </script>
</html>

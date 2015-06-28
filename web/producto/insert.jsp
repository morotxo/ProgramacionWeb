<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : insert
    Created on : Jun 21, 2015, 12:45:08 PM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link type="text/css" rel="stylesheet" href="<c:url value="/main.css" />"-->
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="ejbCategoria" scope="request" class="EJB.EJBCategoria" /> 
        <h1>Registrar Producto</h1>
        <form action="servletProductoInsert" method="post">

            <label for="txtdescripcion">Descripcion</label><br>
            <input type="text" id="txtdescripcion" name="txtdescripcion"><br>
            <label for="txtprecio">Precio</label><br>
            <input type="text" id="txtprecio" name="txtprecio"><br>
            <label for="txtmarca">Marca</label><br>
            <input type="text" id="txtmarca" name="txtmarca"><br>
            <label for="txtcategoria">Categoria</label><br>
            <select name="item" >
                <c:forEach var="item" items="${ejbCategoria.listaCategorias}">
                    <option value="${item.getIdCategoria()}">${item.getNombre()}</option>
                </c:forEach>

            </select><br>
            <label for="txtstock">Stock</label><br>
            <input type="text" id="txtstock" name="txtstock"><br>

            <input type="submit" value="Registrar Producto">
        </form>
    </body>
</html>

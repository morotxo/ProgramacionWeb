<%-- 
    Document   : update
    Created on : Jun 21, 2015, 2:59:56 PM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="ejbProducto" scope="request" class="EJB.EJBProducto" />
       <h1>Modificar Producto</h1>
        <form action="servletProductoUpdate" method="post">
            <label for="txtID">Id</label><br>
            <input type="text" id="txtID" name="txtID" readonly="readonly" value="${ejbProducto.producto.idProducto}"><br>
            <label for="txtdescripcion">Descripcion</label><br>
            <input type="text" id="txtdescripcion" name="txtdescripcion" value="${ejbProducto.producto.descripcion}"><br>
            <label for="txtprecio">Precio</label><br>
            <input type="text" id="txtprecio" name ="txtprecio"value="${ejbProducto.producto.precio}"><br>
            <label for="txtmarca">Marca</label><br>
            <input type="text" id="txtmarca" name="txtmarca" value="${ejbProducto.producto.marca}"><br>
            <label for="txtcategoria">Categoria</label><br>
            <input type="text" id="txtcategoria" name="txtcategoria" value="${ejbProducto.producto.categoria}"><br>
            <label for="txtstock">Stock</label><br>
            <input type="text" id="txtstock" name="txtstock"value="${ejbProducto.producto.stock}"><br>

            <input type="submit" value="Actualizar Producto">
        </form>
    </body>
</html>

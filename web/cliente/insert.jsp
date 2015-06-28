<%-- 
    Document   : insert
    Created on : Jun 21, 2015, 3:46:01 PM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="<c:url value="/main.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Cliente</h1>
        <form action="servletClienteInsert" method="post">
            
            <label for="txtnombre">Nombre</label><br>
            <input type="text" id="txtnombre" name="txtnombre"><br>
            <label for="txtapellido">Apellido</label><br>
            <input type="text" id="txtapellido" name="txtapellido"><br>
            <label for="txttelefono">Telefono</label><br>
            <input type="text" id="txttelefono" name="txttelefono"><br>
            <label for="txtciudad">Ciudad</label><br>
            <input type="text" id="txtciudad" name="txtciudad"><br>
            <label for="txtpais">Pais</label><br>
            <input type="text" id="txtpais" name="txtpais"><br>
            <label for="txtemail">Email</label><br>
            <input type="email" id="txtemail" name="txtemail"><br>
            <label for="txtpassword">Password</label><br>
            <input type="password" id="txtpassword" name="txtpassword"><br>
            <input type="submit" value="Registrar Cliente">
        </form>
    </body>
</html>

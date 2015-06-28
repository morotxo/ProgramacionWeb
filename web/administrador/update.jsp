<%-- 
    Document   : update
    Created on : Jun 21, 2015, 11:25:03 PM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="ejbAdmin" scope="request" class="EJB.EJBAdmin" />
        <h1>Actualizar datos administrador</h1>
        <form action="servletAdminInsert" method="post">
            
            <label for="txtid">id</label><br>
            <input type="text" id="txtid" name="txtid" value="${ejbAdmin.admin.idAdmin}"><br>
            <label for="txtnombre">Nombre</label><br>
            <input type="text" id="txtnombre" name="txtnombre" value="${ejbAdmin.admin.nombre}"><br>
            <label for="txtapellido">Apellido</label><br>
            <input type="text" id="txtapellido" name="txtapellido" value="${ejbAdmin.admin.apellido}"><br>
            <label for="txttelefono">Telefono</label><br>
            <input type="text" id="txttelefono" name="txttelefono" value="${ejbAdmin.admin.telefono}"><br>
            <label for="txtemail">Email</label><br>
            <input type="email" id="txtemail" name="txtemail" value="${ejbAdmin.admin.email}"><br>
            <label for="txtpassword">Password</label><br>
            <input type="password" id="txtpassword" name="txtpassword" value="${ejbAdmin.admin.password}"><br>
            <input type="submit" value="Actualizar Cliente">
        </form>
</html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : Jun 24, 2015, 8:44:29 AM
    Author     : david13mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Categorias</h1>
        <jsp:useBean id="ejbCategoria" scope="request" class="EJB.EJBCategoria" /> 

        <select>
            <option selected value="SELECT">SELECT</option>
            <c:forEach var="item" items="${ejbCategoria.listaCategorias}">
                 <option value=${item.getIdCategoria()}>${item.getNombre()}</option>
            </c:forEach>
        </select>
    </body>
</html>

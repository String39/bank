<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIO</title>
</head>
<body>
	<h2> Bienvenido ${usuario.nombre} !!!!!</h2>
	<c:if test="${usuario.roll eq 'cliente'}">
	<a href="pedidos/${usuario.nombre}"> Listar mis pedisos</a></br></br>
	</c:if>
	<c:if test="${usuario.roll eq 'admin'}">
	<a href="pedidos"> Listado de pedidos</a></br></br>
	</c:if>
	<a href= "alta" >Alta Pedido</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PEDIDOS</title>
</head>
<body>
	<h2> ${usuario.nombre} !!!!!</h2>
	<h2> Listado de Pedidos</h2>
	<ul>
	<c:forEach items="${listaPedidos}" var = "pedido">
		<li>${pedido.id} - ${pedido.descripcion} - 
		<a href="/pedido?idPedido=${pedido.id}">Ver Detalles</a>
		</li>
	</c:forEach>
	</ul>
	
</body>
</html>
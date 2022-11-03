<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PEDIDO</title>
</head>
<body>
	<h2> Detalle Pedido</h2>
	ID:${pedido.id}
	</br></br>
	DESCRIPCION:${pedido.descripcion}
	</br></br>
	FECHA: <fm:formatDate value="${pedido.fechaPedido}" pattern="dd-MM-yyy"/>
	</br></br>
	ENTREGADO:${pedido.entregado }
</body>
</html>
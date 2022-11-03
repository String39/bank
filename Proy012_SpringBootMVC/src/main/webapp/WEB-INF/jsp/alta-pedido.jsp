<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALTA PEDIDO</title>
</head>
<body>
	<h2> Alta Pedido</h2>
		<form:form action = "alta" method="post" 
				modelAttribute="altaForm">
		<form:label path="descripcion">Descripcion:</form:label>
		<form:input path="descripcion"/> 
		<form:errors path="descripcion"></form:errors></br></br></br>
		<form:label path="entregado">Entregado
		</form:label></br></br>
		<form:checkbox path="entregado" value="true" /> 
		<form:errors path="entregado"></form:errors> </br>
		<form:button>ALTA</form:button>
	</form:form>
</body>
</html>
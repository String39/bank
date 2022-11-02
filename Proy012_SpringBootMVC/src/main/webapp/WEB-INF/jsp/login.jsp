<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIAR SESION</title>
</head>
<body>
	<h2>Iniciar Sesion</h2>
	<form:form action = "login" method="post" modelAttribute="usuario">
		<form:label path="nombre">Nombre Usuario:</form:label>
		<form:input path="nombre"/> </br></br>
		<form:label path="clave">Contraseña:</form:label>
		<form:input path="clave"/> </br></br></br>
		<form:button>LOGIN</form:button>
	</form:form>
</body>
</html>
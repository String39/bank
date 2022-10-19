<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>index</title>
  </head>
  <body>
    <h1>Tienda Online</h1>
    
    <div> usuario: ${requestScope.usuario.nombre }</div>
    
    <c:if test="${sessionScope.usuario.roll == 'administrador'}">
    <a class="btn btn-primary" href="alta-producto.jsp" role="button">Alta Producto</a>
   </c:if>
    <a class="btn btn-primary" href="lista-productos.jsp" role="button">Lista Productos</a>
    
  </body>
</html>
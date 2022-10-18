<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>ALTA</title> 
  </head>
<body>
	<H1>Tienda Online</H1>
	<h4>Alta de un Producto Nuevo</h4>
	
	<form action ="AltaServlet" method="post">
		NombreProducto <input type="Text" name="descripcion" value="">
		<button type="submit" class="btn btn-primary">Enviar</button>
	</form>
</body>
</html>
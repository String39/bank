<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USUARIOS</title>
</head>
<body>
	<div class="mb-3 row">
    	<label for="staticEmail" class="col-sm-2 col-form-label">USUARIO</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control-plaintext" id="staticEmail" value="email@example.com">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Roll</label>
    <div class="col-sm-10">
      <select class="form-select" aria-label="Default select example">
  		<option selected>Selecciona</option>
  		<option value="1">Cliente</option>
  		<option value="2">Usuario</option>
		</select>
    </div>
    <a class="btn btn-primary" href="#" role="button">GRABAR</a>
  </div>
</body>
</html>
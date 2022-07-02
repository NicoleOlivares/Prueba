<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrando Peluche</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
<table class="table">

<tr>
	<!-- columnas -->

<th scope="col" class="table-primary">Id</th>
<th scope="col">Nombre</th>
<th scope="col">Material</th>
<th scope="col">Cobertura</th>
<th scope="col">Editar</th>
<th scope="col">Elimnar</th>
</tr>

<!-- filas (`td` or `th`) -->
<c:forEach var="peluche" items="${pelucheCapturado}"><!--cada elemento guardado se muestra en la tabla -->
<tr>
  <td>${peluche.id}</td>
  <td>${peluche.nombre}</td>
  <td>${peluche.material}</td>
  <td>${peluche.cobertura}</td>
  <td class="table-warning"><button type="submit" class="btn btn-outline-warning" href="/peluche/editar">Editar</button></td>
  <td><button type="submit" class="btn btn-outline-danger" href="/peluche/eliminar">Eliminar</button></td>
</tr>
</c:forEach>

</table>
</div>
</body>
</html>
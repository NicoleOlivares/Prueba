<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
					<th scope="col">Cantiadad de Alumnos</th>
					<th scope="col">Materia</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="curso" items="${cursosCapturados}">
					<tr>
						<th scope="row">${curso.id}</th>
						<td>${curso.nombre}</td>
						<td>${curso.cantidadAlumnos}</td>
						<td>${curso.materia}</td>
						<td><a class="btn btn-warning" href="/curso/editar/${curso.id}"
							role="button">Editar</a></td>
						<td><a class="btn btn-danger" href="eliminar/${curso.id}"
							role="button">Eliminar</a></td>
						<!-- Al ponerle el id sabe a que auto nos referimos -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>
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
		<c:if test="${msgError!= null}">
			<c:out value="${msgError}"></c:out>
		</c:if>
		<form:form action="/curso/guardar" method="post" modelAttribute="curso">
			<form:label path="nombre" class="form-label">Nombre:</form:label>
			<form:input path="nombre" class="form-control" />
			<br>
			<form:label path="cantidadAlumnos" class="form-label">Número de alumnos:</form:label>
			<form:input type="number" path="cantidadAlumnos" class="form-control" />
			<br>
			<form:label path="materia" class="form-label">Materia:</form:label>
			<form:input path="materia" class="form-control" />
			<br>

			<button type="submit" class="btn btn-outline-primary">Guardar
				Curso</button>
		</form:form>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<div>		<!-- a traves del formulario accdedo a la ruta -->	<!-- atributos del objeto -->
		<form:form action="/peluche/guardar" method="post" modelAttribute="peluche">
			<form:label path="nombre">Nombre peluche:</form:label>
			<form:input path="nombre"/>
			<br>
			<form:label path="material">Material del peluche:</form:label>
			<form:input path="material"/>
			<br>
			<form:label path="cobertura">Cobertura de peluche:</form:label>
			<form:input path="cobertura"/>
			<br>
			<button type="submit">Guardar</button>			
		</form:form>
	</div>



</body>
</html>
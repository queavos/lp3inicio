<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Pelicula</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet"
	href="${urlPublic}/bootstrap/css/bootstrap.min.css">
<script src="${urlPublic}/js/jquery-3.3.1.min.js" ></script>
<script src="${urlPublic}/bootstrap/js/bootstrap.min.js" ></script>
</head>
<body>
	<div class="container">
		<jsp:include page="../includes/header.jsp"></jsp:include>
		<jsp:include page="../includes/navbar.jsp"></jsp:include>
		<h1>Peliculas</h1>
		<div class="row">
		<div class="col">
			<form:form action="save" method="post" modelAttribute="pelicula">
				<label for="titulo">Título</label>
				<form:input type="text" class="form-control" path="titulo"
					id="titulo" required="required" />
				<label for="duracion">Duracion</label>
				<form:input type="text" class="form-control" path="duracion"
					id="duracion" required="required" />
				<label for="clasificacion" class="control-label">Clasificacion</label>
				<form:select id="clasificacion" path="clasificacion"
					class="form-control">
					<form:option value="A">Clasificacion A</form:option>
					<form:option value="B">Clasificacion B</form:option>
					<form:option value="C">Clasificacion C</form:option>
				</form:select>
				<label for="genero" class="control-label">Genero</label>
				<form:select id="genero" path="genero"
					class="form-control">
					<form:option value="Accion">Accion</form:option>
					<form:option value="Aventura">Aventura</form:option>
					<form:option value="Comedia">Comedia</form:option>						
					<form:option value="Documental">Documental</form:option>
					<form:option value="Musical">Musical</form:option>
					<form:option value="Terror">Terror</form:option>
				</form:select>
				<label for="fechaEstreno">Estreno</label>
				<form:input id="fechaEstreno" path="fechaEstreno" class="form-control" type="date"/>
				<br />
				<button type="submit" class="btn btn-danger">Guardar</button>
			</form:form>
</div>
		</div>
	</div><jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>
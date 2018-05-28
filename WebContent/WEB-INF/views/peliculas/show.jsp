<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pelicula - ${pelicula.titulo}</title>
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
		<div class="col"><img class="card-img-top" alt="Thumbnail [100%x225]"
							style="width: 100%; display: block;"
							src="${urlPublic}/images/${pelicula.imagen}"></div>
		<div class="col">
		<table class="table table-bordered">
		<tbody>
		<tr><th class="table-dark">Titulo: </th><td>${pelicula.titulo}</td></tr>
		<tr><th class="table-dark">Genero: </th><td>${pelicula.genero}</td></tr>
		<tr><th class="table-dark">Clasificación: </th><td${pelicula.clasificacion}></td></tr>
		<tr><th class="table-dark">Duración: </th><td>${pelicula.duracion} mins</td></tr>
		<tr><th class="table-dark">Estreno: </th><td><fmt:formatDate value="${pelicula.fechaEstreno}"
									pattern="dd-MM-yyyy" /></td></tr>
		</tbody>
		</table>
		</div>
		</div>
		
		
		
		
		</div><jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet"
	href="${urlPublic}/bootstrap/css/bootstrap.min.css">
<script src="${urlPublic}/js/jquery-3.3.1.min.js"></script>
<script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<jsp:include page="../includes/header.jsp"></jsp:include>
		<jsp:include page="../includes/navbar.jsp"></jsp:include>

	</div>
	<div class="container">

		<!-- CONTENIDO -->
		<h2>Lista de Noticias</h2>
		<table class="table table-bordered ">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Titulo</th>
					<th scope="col">Contenido</th>
					<th scope="col">Fecha</th>
					<th scope="col">Publicado</th>
					<th scope="col" colspan="2" style=""><center>
							<a class="btn btn-success" href="new">Nuevo</a>
						</center></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ noticias }" var="noticia">
					<tr>
						<th scope="row">${noticia.id}</th>
						<td>${noticia.titulo}</td>
						<td>${noticia.contenido}</td>
						<td>${noticia.fecha}</td>
						<td><center> <c:choose>
								<c:when test="${noticia.publicado eq '1'}">
									<span class="badge badge-success">SI</span>
								</c:when>
								<c:otherwise>
									<span class="badge badge-danger">NO</span>
								</c:otherwise>
							</c:choose>
							</center>
							</td>
						<td><center>
								<a class="btn btn-warning" href="edit/${noticia.id}">Editar</a>
							</center></td>
						<td><center>
								<a class="btn btn-danger" href="delete/${noticia.id}"
									onclick="return confirm('¿Está seguro?')">Borrar</a>
							</center></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<!-- FIN CONTENIDO -->
	</div>
	<jsp:include page="../includes/footer.jsp"></jsp:include>


</body>
</html>
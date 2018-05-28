<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Peliculas</title>
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
			<c:forEach items="${ peliculas }" var="pelicula">

				<div class="col-md-3">
					<div class="card mb-4 box-shadow">
						<img class="card-img-top" alt="Thumbnail [100%x225]"
							style="width: 100%; display: block;"
							src="${urlPublic}/images/${pelicula.imagen}">
						<div class="card-body">
							<h5 class="card-title"><a href="pelicula/${pelicula.id}">${pelicula.titulo} (<fmt:formatDate value="${pelicula.fechaEstreno}"
									pattern="yyyy" />)</a></h5>
							<p class="card-text">
								<b>Estreno:</b>
								<fmt:formatDate value="${pelicula.fechaEstreno}"
									pattern="dd-MM-yyyy" />
							</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">${pelicula.clasificacion}</button>
									<button type="button" class="btn btn-sm btn-outline-secondary">${pelicula.genero}</button>
								</div>
								<small class="text-muted">${pelicula.duracion} mins</small>
							</div>
						</div>
					</div>
				</div>

			</c:forEach>
		</div>
	</div>
	<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>
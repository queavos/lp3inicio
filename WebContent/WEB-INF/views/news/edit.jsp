<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<h2>Noticias</h2>
        ${noticia }
		<div class="row">
			<div class="col">
				<form:form action="/demoapp/noticias/update" method="post" modelAttribute="noticia">
					<form:hidden id="id" name="id" path="id" />
					<label for="titulo">Título</label>
					<form:input type="text" class="form-control" path="titulo"
	id="titulo" required="required" />
					<label for="contenido">Contenido</label>
					<form:textarea rows="5" cols="30"  type="text" class="form-control" path="contenido"
						id="contenido" required="required"  />

					<label for="fecha">Estreno</label>
					<form:input id="fecha" path="fecha" class="form-control" type="date"/>
					<br />
					<form:select id="publicado" path="publicado"
						class="form-control">
						<form:options items="${publi}" />
					</form:select>
					<br />
					<button type="submit" class="btn btn-danger">Guardar</button>
					<br />
				</form:form>
				<!-- FIN CONTENIDO -->
			</div>
		</div>
	</div>
	<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>
</html>
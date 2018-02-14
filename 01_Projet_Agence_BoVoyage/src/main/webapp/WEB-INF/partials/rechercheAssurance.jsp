<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Ajout de la taglib spring mvc form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

<title>Insert title here</title>

</head>
<body>
	<div style="margin-left: 10%; width: 80%">

		<h1 style="text-align: center; color: blue">Espace Agent</h1>
		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>

	<h1 style="color: red; text-align: center">Formulaire de recherche</h1>

	<form:form method="POST" action="soumettreRecherche"
		modelAttribute="assuranceRecherche" cssClass="form-horizontal">
		<div class="form-group">
			<form:label path="id" class="col-sm-2 control-label">ID</form:label>
			<div class="col-sm-5">
				<form:input path="id" class="form-control" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Rechercher" />
			</div>
		</div>
	</form:form>

	<c:if test="${indice==true}">
			<h1 style="color: red; text-align: center">Assurance recherchée</h1>
	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Type d'assurance</th>
			<th>Prix de l'assurance</th>
			<th>Opérations</th>
		</tr>

			<tr>
				<td>${assuranceRecherche.id}</td>
				<td>${assuranceRecherche.type}</td>
				<td>${assuranceRecherche.prix}</td>
				<td><a
					href="${pageContext.request.contextPath}/assurances/modiflien?pId=${assuranceRecherche.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/assurances/suprimlien/${assuranceRecherche.id}">Supprimer</a>
				</td>
			</tr>
	</table>
	</c:if>
	<c:if test="${indice==false}">
		<h1 style="color: red; text-align: center">L'assurance recherchée
			n'existe pas</h1>
	</c:if>
</body>
</html>
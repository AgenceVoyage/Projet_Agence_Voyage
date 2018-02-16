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
<title>Rechercher Voiture</title>

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/css/utilisateur.css"/>" />

<title>Insert title here</title>

</head>
<body>

	<jsp:include page="../../templates/headerAgent.jsp" />



	<h1 style="color: Teal; text-align: center">Formulaire de
		recherche</h1>

	<form:form method="POST" action="soumettreRecherche"
		modelAttribute="voitureRecherche" cssClass="form-horizontal">
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
		<h1 style="color: Teal; text-align: center">Voiture recherchée</h1>
		<div style="margin-left: 10%; margin-right: 10%">
			<table class="table table-bordered fiche">
				<tr>
					<th>ID</th>
					<th>Catégorie</th>
					<th>Loueur</th>
					<th>Prix</th>
					<th>Opérations</th>
				</tr>


				<tr>
					<td>${voitureRecherche.id}</td>
					<td>${voitureRecherche.categorie}</td>
					<td>${voitureRecherche.loueur}</td>
					<td>${voitureRecherche.prix}</td>
					<td><a
						href="${pageContext.request.contextPath}/voitures/modiflien?pId=${voitureRecherche.id}">Modifier</a>
						| <a
						href="${pageContext.request.contextPath}/voitures/suprimlien/${voitureRecherche.id}">Supprimer</a>
					</td>
				</tr>
			</table>
		</div>
	</c:if>
	<c:if test="${indice==false}">
		<h1 style="color: red; text-align: center">La voiture recherchée
			n'existe pas</h1>
	</c:if>
</body>
</html>
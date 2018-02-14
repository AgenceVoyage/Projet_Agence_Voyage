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
<title>Rechercher Client</title>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
</head>
<body>

	<h1 style="color: red; text-align: center">Formulaire de recherche</h1>

	<form:form method="POST" action="soumettreRecherche"
		modelAttribute="clientRecherche" cssClass="form-horizontal">
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
		<h1 style="color: red; text-align: center">Client recherché</h1>
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<th>Date de naissance</th>
				<th>Civilité</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>E-Mail</th>
				<th>N° Tel</th>
				<th>Adresse</th>
				<th>Opérations</th>
			</tr>
			<tr>
				<td>${client.id}</td>
				<td>${client.dateNaissance}</td>
				<td><c:if test="${client.civilite}">M</c:if> <c:if
						test="${!client.civilite}">Mme</c:if></td>
				<td>${client.nom}</td>
				<td>${client.prenom}</td>
				<td>${client.mail}</td>
				<td>${client.tel}</td>
				<td>${client.adresse.numero}, ${client.adresse.voirie},
					${client.adresse.codePostal} ${client.adresse.ville}</td>
				<td><a
					href="${pageContext.request.contextPath}/clients/modiflien/${client.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/clients/suprimlien/${client.id}">Supprimer</a>
				</td>
			</tr>
		</table>
	</c:if>
	<c:if test="${indice==false}">
		<h1 style="color: red; text-align: center">Le client recherché
			n'existe pas</h1>
	</c:if>
</body>
</html>
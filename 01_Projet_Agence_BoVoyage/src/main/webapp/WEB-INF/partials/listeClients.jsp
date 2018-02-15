<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Clients</title>

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

</head>
<body>
	<div style="margin-left: 10%; width: 80%">

		<h1 style="text-align: center; color: blue">Espace Agent</h1>
		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>
	<h1 style="color: red; text-align: center">Liste des Clients</h1>
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

		<c:forEach var="c" items="${clientsListe}">
			<tr>
				<td>${c.id}</td>
				<td>${c.dateNaissance}</td>
				<td><c:if test="${c.civilite}">M</c:if> <c:if
						test="${!c.civilite}">Mme</c:if></td>
				<td>${c.nom}</td>
				<td>${c.prenom}</td>
				<td>${c.mail}</td>
				<td>${c.tel}</td>
				<td>${c.adresse.numero}, ${c.adresse.voirie},
					${c.adresse.codePostal} ${c.adresse.ville}</td>
				<td><a
					href="${pageContext.request.contextPath}/agent/clients/modiflien?pId=${c.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/agent/clients/suprimlien/${c.id}">Supprimer</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
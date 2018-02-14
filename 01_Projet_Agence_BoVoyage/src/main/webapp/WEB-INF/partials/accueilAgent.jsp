<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

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
	
	<h2 style="color: red; text-align: center">Liste des voyages</h2>

	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Reference</th>
			<th>Nom</th>
			<th>Date de depart</th>
			<th>Date d'arrivee</th>
			<th>Nombre de places restantes</th>
			<th>Disponibilite</th>
			<th>Pays</th>
		</tr>
		<c:forEach var="ca" items="${AirList}">
			<tr>
				<td>${ca.id}</td>
				<td>${ca.reference}</td>
				<td>${ca.dateLivraison}</td>
				<td>${ca.distance}</td>
				<td>${ca.poidsMax}</td>
			</tr>
		</c:forEach>
	</table>

	<h1 style="color: red; text-align: center">Liste des Cargaisons
		Routieres</h1>

	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Reference</th>
			<th>Date de livraison</th>
			<th>Distance</th>
			<th>Température de conservation</th>
		</tr>
		<c:forEach var="cr" items="${RouteList}">
			<tr>
				<td>${cr.id}</td>
				<td>${cr.reference}</td>
				<td>${cr.dateLivraison}</td>
				<td>${cr.distance}</td>
				<td>${cr.temperatureConservation}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
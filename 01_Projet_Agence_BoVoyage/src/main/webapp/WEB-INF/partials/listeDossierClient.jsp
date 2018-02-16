<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

		<jsp:include page="../../templates/headerClient.jsp" />


	<h1 style="color: Teal; text-align: center">Liste des Dossiers</h1>
	<div style="margin-left: 10%; margin-right: 10%">
		<table class="table table-bordered fiche">
			<tr>
				<th>Numeros de Dossier</th>
				<th>Voyages</th>
				<th>Destination</th>
				<th>Date d�part</th>
				<th>Date arriv�e</th>
				<th>Formule</th>
				<th>Compagnie</th>
				
			</tr>

			<c:forEach var="d" items="${dossierListe}">
				<tr>
					<td>${d.numDossier}</td>
					<td>${d.voyage.nom}</td>
					<td>${d.voyage.ville} ${d.voyage.pays}</td>
					<td>${d.voyage.dateDepart}</td>
					<td>${d.voyage.dateArrivee}</td>
					<td>${d.voyage.compagnieVoyage}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
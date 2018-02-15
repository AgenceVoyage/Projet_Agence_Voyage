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
<link rel="stylesheet"
	href="<c:url value="/resources/css/utilisateur.css"/>" />
<title>Accueil Agent</title>

</head>
<body>
	<div>
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
			<th>Ville</th>
			<th>Continent</th>
			<th>Compagnie de voyage</th>
			<th>Prix remise</th>
			<th>ID Hotel</th>
			<th>ID Voiture</th>
			<th>Options</th>
		</tr>
		<c:forEach var="v" items="${voyageList2}">
			<tr>
				<td>${v.id}</td>
				<td>${v.reference}</td>
				<td>${v.nom}</td>
				<td>${v.dateDepart}</td>
				<td>${v.dateArrivee}</td>
				<td>${v.nbPlaces}</td>
				<c:set var="dispo" value="${v.disponible}" />
				<c:choose>
					<c:when test="${dispo==true}">
						<td>Oui</td>
					</c:when>
					<c:otherwise>
						<td>Non</td>
					</c:otherwise>
				</c:choose>


				<td>${v.pays}</td>
				<td>${v.ville}</td>
				<td>${v.continent}</td>
				<td>${v.compagnieVoyage}</td>
				<td>${v.prixRemise}</td>

				<c:set var="hotel" value="${v.hotel}" />
				<c:choose>
					<c:when test="${not empty hotel}">
						<td>${v.hotel.id}</td>
					</c:when>
					<c:otherwise>
						<td>Non renseigne</td>
					</c:otherwise>
				</c:choose>

				<c:set var="voiture" value="${v.voiture}" />
				<c:choose>
					<c:when test="${not empty voiture}">
						<td>${v.voiture.id}</td>
					</c:when>
					<c:otherwise>
						<td>Non renseigne</td>
					</c:otherwise>
				</c:choose>


				<td><a
					href="${pageContext.request.contextPath}/agent/supprimeLienVoyage?pId=${v.id}">Supprimer</a>
					| <a
					href="${pageContext.request.contextPath}/agent/modifLienVoyage?pId=${v.id}">Modifier</a></td>
			</tr>
		</c:forEach>
	</table>


	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
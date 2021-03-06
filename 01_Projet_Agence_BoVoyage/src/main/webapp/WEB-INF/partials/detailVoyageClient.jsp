<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
#map {
	height: 400px;
	width: 50%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBz2jm5RRGDAnvYharuQWuyKF6r9BI2MtY">
	
</script>
<script src="<c:url value="/resources/js/googleMap.js"/>"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/css/utilisateur.css"/>" />
<title>Page de details d'un voyage</title>
</head>
<body>



	<jsp:include page="../../templates/headerUtilisateur.jsp" />

	<div class="row">
		<div class="col-sm-12"
			style="margin-left: 10%; margin-right: 10%; width: 80%">
			<div class="thumbnail" style="background-color: #d6caa9">
				<img src="..." alt="...">
				<div class="caption">
					<h3 style="text-align: center; color: Teal">
						<b>${voyageDetail.nom}</b>
					</h3>
					<table class="table table-bordered fiche">
						<tr>
							<th>Reference</th>
							<th>Date de depart</th>
							<th>Date de retour</th>
							<th>Places restantes</th>
							<th>Pays</th>
							<th>Ville</th>
							<th>Continent</th>
							<th>Compagnie de voyage</th>
							<th>Prix public</th>
							<th>Prix remise</th>
							<th>Hotel</th>
							<th>Voiture</th>
						</tr>
						<tr>
							<td>${voyageDetail.reference}</td>
							<td>${voyageDetail.dateDepart}</td>
							<td>${voyageDetail.dateArrivee}</td>
							<td>${voyageDetail.nbPlaces}</td>
							<td>${voyageDetail.pays}</td>
							<td>${voyageDetail.ville}</td>
							<td>${voyageDetail.continent}</td>
							<td>${voyageDetail.compagnieVoyage}</td>
							<td>${voyageDetail.prixPublic}</td>
							<td>${voyageDetail.prixRemise}</td>

							<c:set var="hotel" value="${voyageDetail.hotel}" />
							<c:choose>
								<c:when test="${not empty hotel}">
									<td>Oui</td>
								</c:when>
								<c:otherwise>
									<td>Non</td>
								</c:otherwise>
							</c:choose>

							<c:set var="voiture" value="${voyageDetail.voiture}" />
							<c:choose>
								<c:when test="${not empty voiture}">
									<td>Oui</td>
								</c:when>
								<c:otherwise>
									<td>Non</td>
								</c:otherwise>
							</c:choose>
					</table>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-5">
							<a
								href="${pageContext.request.contextPath}/client/afficheAjoutDossier?pId=${voyageDetail.id}"><input
								type="button" value="Reserver ce voyage" /></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<center>
		<div id="map"></div>
	</center>
	<script>
		var ville = '${voyageDetail.ville}';
		console.log(ville);
		var pays = '${voyageDetail.pays}';
		console.log(pays);
		var nom = '${voyageDetail.nom}';
	</script>

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
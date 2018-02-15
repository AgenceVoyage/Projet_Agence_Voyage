<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
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
<title>Page d'accueil de l'espace client</title>
</head>
<body>

	<jsp:include page="../../templates/headerClient.jsp" />

	<div style="margin-left: 10%; width: 80%">

		<div class="form-group">
			<c:forEach var="v" items="${voyageList3}">
				<div class="col-sm-3 ">
					<div class="thumbnail fiche">
						<img src="..." alt="...">

						<div class="caption">
							<h3 class="fichetitle">${v.nom}</h3>
							<p>
								<b>Prix : </b>${v.prixPublic}<br /> <b>Remise : </b>${v.remise}<br />
								<b>Date de depart : </b>${v.dateDepart}<br /> <b>Date
									d'arrivee : </b>${v.dateArrivee}</p>
						</div>
						<a
							href="${pageContext.request.contextPath}/client/detailVoyage?pId=${v.id}">Voir
							le détail</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>

</body>
</html>
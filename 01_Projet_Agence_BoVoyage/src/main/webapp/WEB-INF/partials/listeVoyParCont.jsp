<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	// librairie a rajouter si necessaire (jstl ...)
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Page Accueil</title>
<meta charset="utf-8">

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/carte.css"/>" />

<link rel="stylesheet"
	href="<c:url value="/resources/css/utilisateur.css"/>" />
<script src="<c:url value="/resources/js/getByVoyage.js"/>"></script>
</head>
<body>

	<div style="margin-left: 0%; width: 80%">
		<div style="margin-left: 23%">
			<jsp:include page="../../templates/headerUtilisateur.jsp" />
		</div>

		<div class="form-group" style="margin-left: 23%">
			<form class="navbar-form inline-form">
				<div class="form-group">
					<input type="search" class="input-sm form-control"
						placeholder="Recherche par pays" id="search"
						onkeyup="searchField()">
				</div>
			</form>
			<c:forEach var="v" items="${voyageListCont}">
				<div class="col-sm-3">
					<div class="thumbnail fiche">
						<img src="..." alt="...">

						<div class="caption ">
							<h3 class="fichetitle">${v.nom}</h3>
							<p class="pays">${v.pays}</p>
							<p>
								<b>Prix : </b>${v.prixPublic}<br /> <b>Remise : </b>${v.remise}<br />
								<b>Date de depart : </b>${v.dateDepart}<br /> <b>Date
									d'arrivee : </b> ${v.dateArrivee}
							</p>
						</div>
						<a
							href="${pageContext.request.contextPath}/utilisateur/detailVoyage?pId=${v.id}">Voir
							le détail</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
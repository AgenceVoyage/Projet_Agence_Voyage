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
<link rel="stylesheet"
	href="<c:url value="/resources/css/carte.css"/>" />
</head>
<body>

	<div style="margin-left: 10%; width: 80%">

		<h1 style="text-align: center; color: blue">Accueil</h1>


		<jsp:include page="../../templates/headerUtilisateur.jsp" />
		
		<div style="margin-left:18%">
		<jsp:include page="../../templates/carte.jsp" />
		</div>
		
		<h1 style="color: red; text-align: center;position:relative;bottom:50px">Liste des Voyages</h1>


	<div class="form-group">
		<c:forEach var="v" items="${voyageList}">
			<div class="col-sm-3 ">
				<div class="thumbnail">
					<img src="..." alt="...">
					
					<div class="caption">
						<h3>${v.nom}</h3>
						<p>
							<b>Prix : </b>${v.prixPublic}<br /> <b>Remise : </b>${v.remise}<br />
							<b>Date de depart : </b>${v.dateDepart}<br /> <b>Date
								d'arrivee : </b>${v.dateArrivee}</p>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	</div>
</body>
</html>
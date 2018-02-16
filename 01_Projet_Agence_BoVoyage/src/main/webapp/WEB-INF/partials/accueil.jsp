
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


<script type="text/javascript"
	src="<c:url value="/resources/js/slider.js"/>"></script>
</head>
<body>
	<div style="margin-left: 12%; margin-right: 12%;">
		<jsp:include page="../../templates/headerUtilisateur.jsp" />
	</div>

	<div style="margin-left: 4%; width: 80%">

		<div>
			<jsp:include page="../../templates/carte.jsp" />
		</div>


		<div class="form-group" style="margin-left: 15%">
			<c:forEach var="v" items="${voyageList}">
				<div class="col-sm-4 col-sm-offset-1" style="width:350px;height:400px">
					<div style="border-style: solid;border-width:1px;border-color:grey;background-color:rgba(215,215,215,0.8)">
						<%
							int i = 0;
						%>
						<%
							String display = "none";
						%>

						<div>${v.nbPhoto}</div>
						<div style="height:200px">
						<c:forEach begin="0" end="${v.nbPhoto}" varStatus="loop">
							<c:if test="${loop.index < v.nbPhoto}">
								<%
										 display = "block";
									%>
								<c:if test="${loop.index > 0}">
									<%
										 display = "none";
									%>
								</c:if>
								<img class="voyage_${v.id}"
									src="${pageContext.request.contextPath}/utilisateur/accueilPhoto?idV=${v.id}&idP=${loop.index}"
									width="300px" height="auto" style="display:<%=display %>" />

							</c:if>

						</c:forEach>
						</div>
						<c:if test="${v.nbPhoto >1 }">
							<button class="w3-button w3-display-left"
								onclick="plusDivs(-1,${v.id})">&#10094;</button>
							<button style="margin-left:82%" class="w3-button w3-display-right"
								onclick="plusDivs(+1,${v.id})">&#10095;</button>
						</c:if>
						<div class="caption">
							<h3 class="fichetitle">${v.nom}</h3>
							<p>
								<b>Prix : </b>${v.prixPublic}<br /> <b>Remise : </b>${v.remise}<br />
								<b>Date de depart : </b>${v.dateDepart}<br /> <b>Date
									d'arrivee : </b>${v.dateArrivee}</p>
						</div>

						<a
							href="${pageContext.request.contextPath}/utilisateur/detailVoyage?pId=${v.id}">Voir
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
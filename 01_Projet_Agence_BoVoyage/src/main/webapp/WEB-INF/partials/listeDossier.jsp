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

		<jsp:include page="../../templates/headerAgent.jsp" />


	<h1 style="color: Teal; text-align: center">Liste des Dossiers</h1>
	<div style="margin-left: 10%; margin-right: 10%">
		<table class="table table-bordered fiche">
			<tr>
				<th>ID</th>
				<th>Numeros de Dossier</th>
				<th>Voyages</th>
				<th>Prix Total</th>
				<th>Statut</th>
				<th>Nombres de voyageurs</th>
				<th>Assurance</th>
			</tr>

			<c:forEach var="d" items="${dossierListe}">
				<tr>
					<td>${d.id}</td>
					<td>${d.numDossier}</td>
					<td>${d.voyage}</td>
					<td>${d.prixTotal}</td>
					<td>${d.statut}</td>
					<%-- 				<td>${d.listeClients}</td> --%>
					<%-- 				<td>${d.listeAssurances}</td> --%>
					<td><a
						href="${pageContext.request.contextPath}/dossiers/modifLien?pId=${d.id}">Modifier</a>
						| <a
						href="${pageContext.request.contextPath}/dossiers/suppLien?pId=${d.id}">Supprimer</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
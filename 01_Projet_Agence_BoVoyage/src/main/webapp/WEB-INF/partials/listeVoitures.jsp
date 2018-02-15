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
	href="<c:url value="/resources/css/utilisateur.css"/>" />
<title>Insert title here</title>

</head>
<body>


	<div style="margin-left: 12%; margin-right: 12%">


		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>


	<h1 style="color: Teal; text-align: center">Liste des Voitures</h1>
	<div style="margin-left: 10%; margin-right: 10%">
	<table class="table table-bordered fiche">
		<tr>
			<th>ID</th>
			<th>Catégorie</th>
			<th>Loueur</th>
			<th>Prix</th>
			<th>Opérations</th>
		</tr>

		<c:forEach var="c" items="${voitureListe}">
			<tr>
				<td>${c.id}</td>
				<td>${c.categorie}</td>
				<td>${c.loueur}</td>
				<td>${c.prix}</td>
				<td><a
					href="${pageContext.request.contextPath}/voitures/modiflien?pId=${c.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/voitures/suprimlien/${c.id}">Supprimer</a>
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
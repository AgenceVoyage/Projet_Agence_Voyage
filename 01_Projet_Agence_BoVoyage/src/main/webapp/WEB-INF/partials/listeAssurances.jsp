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

<title>Insert title here</title>

</head>
<body>
	<div style="margin-left: 10%; width: 80%">

		<h1 style="text-align: center; color: blue">Espace Agent</h1>
		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>


	<h1 style="color: red; text-align: center">Liste des Assurances</h1>
	<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Type d'assurance</th>
			<th>Prix de l'assurance</th>
			<th>Opérations</th>
		</tr>

		<c:forEach var="a" items="${assuranceListe}">
			<tr>
				<td>${a.id}</td>
				<td>${a.type}</td>
				<td>${a.prix}</td>
				<td><a
					href="${pageContext.request.contextPath}/assurances/modiflien?pId=${a.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/assurances/suprimlien/${a.id}">Supprimer</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
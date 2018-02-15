<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Ajout de la taglib spring mvc form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<title>Rechercher Dossier</title>
</head>
<body>
<h1 style="color: red; text-align: center">Formulaire de recherche</h1>

	<form:form method="POST" action="soumettreRech"
		modelAttribute="dossierRech" cssClass="form-horizontal">
		<div class="form-group">
			<form:label path="id" class="col-sm-2 control-label">ID</form:label>
			<div class="col-sm-5">
				<form:input path="id" class="form-control" />
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Rechercher" />
			</div>
		</div>
	</form:form>
	
	<c:if test="${indice==true}">
		<h1 style="color: red; text-align: center">Dossier recherché</h1>
		<table class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Numeros de Dossier</th>
			<th>Voyages</th>
			<th>Prix Total</th>
			<th>Statut</th>
			<th>Nombres de voyageurs</th>
			<th>Assurance</th>
		</tr>
			<tr>
				<td>${d.id}</td>
				<td>${d.numDossier}</td>
				<td>${d.voyage}</td>
				<td>${d.prixTotal}</td>
				<td>${d.statut}</td>
				<td>${d.listeClients}</td>
				<td>${d.listeAssurances}</td>
				<td><a
					href="${pageContext.request.contextPath}/dossiers/modifLien?pId=${d.id}">Modifier</a>
					| <a
					href="${pageContext.request.contextPath}/dossiers/suppLien?pId=${d.id}">Supprimer</a>
				</td>
			</tr>
	</table>
	</c:if>
	<c:if test="${indice==false}">
		<h1 style="color: red; text-align: center">Le dossier recherché
			n'existe pas</h1>
	</c:if>
</body>
</html>
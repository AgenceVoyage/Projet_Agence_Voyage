<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Ajout de la taglib spring mvc form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter un Dossier</title>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
</head>
<body>
<h1 style="color: red; text-align: center">Formulaire d'ajout</h1>

	<form:form method="POST" action="soumettreAjoutDossier"
		modelAttribute="dossierAjout" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="numDossier" cssClass="col-sm-2 control-label">Numero de dossier</form:label>
			<div class="col-sm-5">
				<form:input path="numDossier" type="text" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="statut" cssClass="col-sm-2 control-label">Statut</form:label>
			<div class="col-sm-5">
				<form:input path="statut" type="text" class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="voyage" cssClass="col-sm-2 control-label">Voyage</form:label>
			<div class="col-sm-5">
				<form:input path="voyage" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="assurance" cssClass="col-sm-2 control-label">Assurance</form:label>
			<div class="col-sm-5">
				<form:input path="assurance" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="listeClients" cssClass="col-sm-2 control-label">Nombre de clients</form:label>
			<div class="col-sm-5">
				<form:input path="listeClients" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="prixTotal" cssClass="col-sm-2 control-label">Prix Total</form:label>
			<div class="col-sm-5">
				<form:input path="prixTotal" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Ajouter" />
			</div>
		</div>
	</form:form>
</body>
</html>
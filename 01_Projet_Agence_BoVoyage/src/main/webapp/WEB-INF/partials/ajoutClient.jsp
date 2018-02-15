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
<title>Ajouter Client</title>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />
</head>
<body>
	<div style="margin-left: 12%; margin-right: 12%">

		<jsp:include page="../../templates/headerUtilisateur.jsp" />

	</div>
	<h1 style="color: Teal; margin-left: 37%">Formulaire d'inscription</h1>

	<div style="margin-left: 25%">

		<form:form method="POST" action="soumettreAjout"
			modelAttribute="clientAjout" cssClass="form-horizontal">

			<h3 style="color: Teal; margin-left: -25%; text-align: center">Informations
				générales</h3>

			<div class="form-group">
				<form:label path="civilite" cssClass="col-sm-2 control-label">Civilité</form:label>
				<div class="col-sm-5">
					<form:select class="form-control" path="civilite">
						<option value="true">Monsieur</option>
						<option value="false">Madame</option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<form:label path="nom" cssClass="col-sm-2 control-label">Nom</form:label>
				<div class="col-sm-5">
					<form:input path="nom" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="prenom" cssClass="col-sm-2 control-label">Prénom</form:label>
				<div class="col-sm-5">
					<form:input path="prenom" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="dateNaissance" cssClass="col-sm-2 control-label">Date de naissance</form:label>
				<div class="col-sm-5">
					<form:input path="dateNaissance" type="date" class="form-control" />
				</div>
			</div>

			<h3 style="color: Teal; margin-left: -25%; text-align: center">Coordonnées</h3>

			<div class="form-group">
				<form:label path="mail" cssClass="col-sm-2 control-label">E-Mail</form:label>
				<div class="col-sm-5">
					<form:input path="mail" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="tel" cssClass="col-sm-2 control-label">N° Tel</form:label>
				<div class="col-sm-5">
					<form:input path="tel" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="adresse" cssClass="col-sm-2 control-label">Adresse :</form:label>
			</div>
			<div style="margin-left: 5%">
				<div class="form-group">
					<form:label path="adresse.numero" cssClass="col-sm-2 control-label">N°</form:label>
					<div class="col-sm-4">
						<form:input path="adresse.numero" cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<form:label path="adresse.voirie" cssClass="col-sm-2 control-label">Voirie</form:label>
					<div class="col-sm-4">
						<form:input path="adresse.voirie" cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<form:label path="adresse.codePostal"
						cssClass="col-sm-2 control-label">Code Postal</form:label>
					<div class="col-sm-4">
						<form:input path="adresse.codePostal" cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<form:label path="adresse.ville" cssClass="col-sm-2 control-label">Ville</form:label>
					<div class="col-sm-4">
						<form:input path="adresse.ville" cssClass="form-control" />
					</div>
				</div>
			</div>

			<h3 style="color: Teal; margin-left: -25%; text-align: center">Paiement
				et sécurité</h3>

			<div class="form-group">
				<form:label path="mdp" cssClass="col-sm-2 control-label">Mot de passe</form:label>
				<div class="col-sm-5">
					<form:input path="mdp" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="numCB" cssClass="col-sm-2 control-label">N° CB</form:label>
				<div class="col-sm-5">
					<form:input path="numCB" cssClass="form-control" />
				</div>
			</div>

			<div class="form-group" style="margin-left: 15%">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info" value="Ajouter" />
				</div>
			</div>
		</form:form>
	</div>
	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
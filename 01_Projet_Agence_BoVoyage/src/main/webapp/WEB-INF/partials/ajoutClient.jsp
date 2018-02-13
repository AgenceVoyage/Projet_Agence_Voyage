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
</head>
<body>

	<h1 style="color: red; text-align: center">Formulaire d'ajout</h1>

	<form:form method="POST" action="soumettreAjout"
		modelAttribute="clientAjout" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="dateNaissance" class="col-sm-2 control-label">Date de naissance</form:label>
			<div class="col-sm-5">
				<input path="dateNaissance" type='date' class="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="civilite" cssClass="col-sm-2 control-label">Civilit�</form:label>
			<div class="col-sm-5">
				<label class="radio-inline"> <input type="radio"
					name="inlineRadioOptions" id="inlineRadio1" value="true" />M
				</label> <label class="radio-inline"> <input type="radio"
					name="inlineRadioOptions" id="inlineRadio2" value="false" />Mme
				</label>
			</div>
		</div>
		<div class="form-group">
			<form:label path="nom" cssClass="col-sm-2 control-label">Nom</form:label>
			<div class="col-sm-5">
				<form:input path="nom" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="prenom" cssClass="col-sm-2 control-label">Pr�nom</form:label>
			<div class="col-sm-5">
				<form:input path="prenom" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="mail" cssClass="col-sm-2 control-label">E-Mail</form:label>
			<div class="col-sm-5">
				<form:input path="mail" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="tel" cssClass="col-sm-2 control-label">N� Tel</form:label>
			<div class="col-sm-5">
				<form:input path="tel" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="adresse" cssClass="col-sm-2 control-label">Adresse :</form:label>
		</div>
		<div class="form-group">
			<form:label path="adresse.numero" cssClass="col-sm-2 control-label">N�</form:label>
			<div class="col-sm-5">
				<form:input path="adresse.numero" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="adresse.voirie" cssClass="col-sm-2 control-label">Voirie</form:label>
			<div class="col-sm-5">
				<form:input path="adresse.voirie" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="adresse.codePostal"
				cssClass="col-sm-2 control-label">Code Postal</form:label>
			<div class="col-sm-5">
				<form:input path="adresse.codePostal" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="adresse.ville" cssClass="col-sm-2 control-label">Ville</form:label>
			<div class="col-sm-5">
				<form:input path="adresse.ville" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="mdp" cssClass="col-sm-2 control-label">Mot de passe</form:label>
			<div class="col-sm-5">
				<form:input path="mdp" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="numCB" cssClass="col-sm-2 control-label">N� CB</form:label>
			<div class="col-sm-5">
				<form:input path="numCB" cssClass="form-control" />
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
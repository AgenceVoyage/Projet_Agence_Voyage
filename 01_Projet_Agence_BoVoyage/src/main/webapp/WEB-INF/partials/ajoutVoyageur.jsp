<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire ajout Voyageur</title>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
</head>
<body>
	<h1 style="color: red; text-align: center">Formulaire d'ajout</h1>

	<form:form method="POST" action="soumettreFormAjoutVoyageur"
		modelAttribute="vForm" cssClass="form-horizontal">


		<div class="form-group">
			<form:label path="dateNaissance" class="col-sm-2 control-label">Date de naissance</form:label>
			<div class="col-sm-5">
				<form:input path="dateNaissance" type="date" class="form-control" />
			</div>
		</div>


		<div class="form-group">
			<form:select class="form-control" path="civilite">
				<option value="false">Monsieur</option>
				<option value="true">Madame</option>
			</form:select>
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
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Ajouter" />
			</div>
		</div>
	</form:form>



</body>
</html>
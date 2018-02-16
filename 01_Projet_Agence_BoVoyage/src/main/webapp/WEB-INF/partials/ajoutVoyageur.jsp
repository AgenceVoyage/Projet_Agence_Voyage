<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire ajout Voyageur</title>

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

<link rel="stylesheet"
	href="<c:url value="/resources/css/dossier.css"/>">

<script type="text/javascript"
	src="<c:url value="/resources/js/dossier.js"/>"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

</head>
<body>
	<div style="margin-left: 12%; margin-right: 12%">
		<jsp:include page="../../templates/headerClient.jsp" />
	</div>

	<h1 style="color: Teal; margin-left: 34%">Formulaire d'ajout d'un
		voyageur</h1>
	<div style="margin-left: 25%">
		<form:form method="POST" action="soumettreFormAjoutVoyageur"
			modelAttribute="vForm" cssClass="form-horizontal">

			<div class="form-group">
				<form:label path="civilite" class="col-sm-2 control-label">Civilite : </form:label>
				<form:select class="form-control" cssClass="col-sm-2 control-label"
					path="civilite">
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
				<form:label path="dateNaissance" class="col-sm-2 control-label">Date de naissance</form:label>
				<div class="col-sm-5">
					<form:input path="dateNaissance" type="date" class="form-control" />
				</div>
			</div>

			<div class="form-group" style="margin-left: 15%">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info" value="Valider" />
				</div>
			</div>

		</form:form>
	</div>


</body>
</html>
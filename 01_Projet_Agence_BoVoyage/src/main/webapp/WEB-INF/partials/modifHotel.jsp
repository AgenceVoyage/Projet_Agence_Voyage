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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

<title>Modification d'un hotel</title>

</head>
<body>

	<jsp:include page="../../templates/headerAgent.jsp" />

	<h1 style="color: Teal; margin-left: 28%">Formulaire de
		modification d'un hotel</h1>
	<br />

	<div style="margin-left: 25%">

		<form:form method="POST" action="soumettreModif"
			modelAttribute="modifHotel" cssClass="form-horizontal">

			<div class="form-group">
				<form:label path="id" cssClass="col-sm-2 control-label">Id</form:label>
				<div class="col-sm-5">
					<form:input path="id" cssClass="form-control" readonly="true" />
				</div>
			</div>

			<h3 style="color: Teal; margin-left: -25%; text-align: center">Informations
				générales</h3>

			<div class="form-group">
				<form:label path="nomHotel" cssClass="col-sm-2 control-label">Nom</form:label>
				<div class="col-sm-5">
					<form:input path="nomHotel" cssClass="form-control" />
				</div>
			</div>

			<div class="form-group">
				<form:label path="prix" cssClass="col-sm-2 control-label">Prix de base</form:label>
				<div class="col-sm-5">
					<form:input path="prix" cssClass="form-control" />
				</div>
			</div>

			<h3 style="color: Teal; margin-left: -25%; text-align: center">Adresse</h3>

			<div class="form-group">
				<form:label path="adresse.numero" cssClass="col-sm-2 control-label">N°</form:label>
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
			<div class="form-group" style="margin-left: 15%">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info" value="Modifier" />
				</div>
			</div>
		</form:form>
	</div>

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
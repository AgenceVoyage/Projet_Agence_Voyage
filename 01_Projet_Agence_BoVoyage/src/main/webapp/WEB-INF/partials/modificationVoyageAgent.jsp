<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- ajouter les balises form de spring mvc -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page de modification voyage</title>

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

</head>
<body>

<form:form method="PUT" action="soumettreModifVoyage"
		modelAttribute="voyageModif" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="dateArrivee" cssClass="col-sm-2 control-label">Date d'Arrivee :</form:label>
			<div class="col-sm-5">
				<form:input path="dateArrivee" cssClass="form-control" />
			</div>
		</div>


		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Modifier" />
			</div>
		</div>


	</form:form>

</body>
</html>
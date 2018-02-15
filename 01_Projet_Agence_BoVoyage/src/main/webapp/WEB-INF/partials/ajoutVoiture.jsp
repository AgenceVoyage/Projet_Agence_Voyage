<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Ajout de la taglib spring mvc form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

<title>Ajout Voiture</title>
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

</head>
<body>
	<div style="margin-left: 12%; margin-right: 12%">

		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>
<h1 style="color: Teal; margin-left: 32%">Formulaire d'ajout d'une
		voiture</h1>

	<div style="margin-left: 25%">
	<form:form method="POST" action="soumettreAjoutVoiture"
		modelAttribute="temp" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="loueur" class="col-sm-2 control-label">Loueur</form:label>
			<div class="col-sm-5">
				<form:input path="loueur" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="categorie" class="col-sm-2 control-label">Catégorie de véhicule</form:label>
			<div class="col-sm-5">
				<form:input path="categorie" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group">
			<form:label path="prix" class="col-sm-2 control-label">Prix de l'option</form:label>
			<div class="col-sm-5">
				<form:input path="prix" cssClass="form-control" />
			</div>
		</div>
		<div class="form-group" style="margin-left: 29%">
			<form:label path="idVoy" class="col-sm-2 control-label">Id Voyage</form:label>
			<form:select path="idVoy">
				<c:forEach var="voy" items="${voyageListe}">
					<form:option value="${voy.id}">
						<c:out value="${voy.id}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
		</div>

			<div class="form-group" style="margin-left: 15%">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-info"
					value="Ajouter une Voiture" />
			</div>
		</div>

	</form:form>
</div>
</body>
</html>
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

<title>Ajout assurance</title>
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />
</head>
<body>

	<div style="margin-left: 12%; margin-right: 12%;">
		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>

	<h1 style="color: Teal; margin-left: 32%">Formulaire d'ajout
		d'assurance</h1>

	<div style="margin-left: 25%">
	<br />
	
			<br />
		<form:form method="POST" action="soumettreAjoutAssurance"
			modelAttribute="assurance" cssClass="form-horizontal">

			<div class="form-group">
				<form:label path="type" class="col-sm-2 control-label">Type d'assurance</form:label>
				<div class="col-sm-5">
					<form:input path="type" cssClass="form-control" />
				</div>
			</div>

			<br />

			<div class="form-group">
				<form:label path="prix" class="col-sm-2 control-label">Prix</form:label>
				<div class="col-sm-5">
					<form:input path="prix" cssClass="form-control" />
				</div>
			</div>
			<br />


			<div class="form-group" style="margin-left: 12%">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info"
						value="Ajouter une Assurance" />
				</div>
			</div>
		


		</form:form>

	</div>
</body>
</html>
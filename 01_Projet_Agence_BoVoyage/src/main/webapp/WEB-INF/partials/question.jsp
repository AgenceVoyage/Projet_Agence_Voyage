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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

	<link rel="stylesheet" href="<c:url value="/resources/css/dossier.css"/>">

<script type="text/javascript"
	src="<c:url value="/resources/js/dossier.js"/>"></script>
	



</head>
<body>

	<div style="margin-left: 10%; width: 80%">
		<jsp:include page="../../templates/headerClient.jsp" />
	</div>
	<h1 style="color: red; text-align: center">Formulaire de
		reservation du voyage ${dossierAjout.voyage.nom}</h1>

coucou jeune padawan

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#map {
	height: 400px;
	width: 50%;
}
</style>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBz2jm5RRGDAnvYharuQWuyKF6r9BI2MtY">
	
</script>
<script src="<c:url value="/resources/js/googleMapAgence.js"/>"></script>
<title>Infos Agence</title>
</head>
<body>

	<div style="margin-left: 10%; width: 80%">
		<c:if test="${num==0}">
			<jsp:include page="../../templates/headerAgent.jsp" /></c:if>
		<c:if test="${num==1}">
			<jsp:include page="../../templates/headerClient.jsp" /></c:if>
		<c:if test="${num==2}">
			<jsp:include page="../../templates/headerUtilisateur.jsp" /></c:if>
	</div>

	<h3 style="text-align: center;">Notre agence</h3>
	<center>
		<div id="map"></div>
	</center>

</body>
</html>
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

<title>Modification assurance</title>
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />
</head>
<body>

	<jsp:include page="../../templates/headerAgent.jsp" />

	<h1 style="color: Teal; margin-left: 24%">Formulaire de
		modification d'une assurance</h1>
	<br />

	<div style="margin-left: 25%">

		<form:form method="POST" action="soumettreModif"
			modelAttribute="modifAssurance" cssClass="form-horizontal">

			<div class="form-group">
				<form:label path="id" cssClass="col-sm-2 control-label">Id</form:label>
				<div class="col-sm-5">
					<form:input path="id" cssClass="form-control" readonly="true" />
				</div>
			</div>


			<div class="form-group">
				<form:label path="type" cssClass="col-sm-2 control-label">Type d'assurance</form:label>
				<div class="col-sm-5">
					<form:input path="type" cssClass="form-control" readonly="true" />
				</div>
			</div>

			<div class="form-group">
				<form:label path="prix" cssClass="col-sm-2 control-label">Prix </form:label>
				<div class="col-sm-5">
					<form:input path="prix" cssClass="form-control" />
				</div>
			</div>
			
			<br />

			<div class="form-group" style="margin-left: 13%">
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
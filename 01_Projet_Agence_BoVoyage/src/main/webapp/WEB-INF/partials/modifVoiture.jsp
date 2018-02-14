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

<title>Insert title here</title>

</head>
<body>
	<div style="margin-left: 10%; width: 80%">

		<h1 style="text-align: center; color: blue">Espace Agent</h1>
		<jsp:include page="../../templates/headerAgent.jsp" />
	</div>


	<h1 style="color: red; text-align: center">Formulaire de
		modification</h1>

	<form:form method="POST" action="soumettreModif"
		modelAttribute="modifVoiture" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="id" cssClass="col-sm-2 control-label">Id</form:label>
			<div class="col-sm-5">
				<form:input path="id" cssClass="form-control" readonly="true" />
			</div>
		</div>

		
		<div class="form-group">
			<form:label path="loueur" cssClass="col-sm-2 control-label">Loueur</form:label>
			<div class="col-sm-5">
				<form:input path="loueur" cssClass="form-control" />
			</div>
		</div>
		
		<div class="form-group">
			<form:label path="categorie" cssClass="col-sm-2 control-label">Catégorie</form:label>
			<div class="col-sm-5">
				<form:input path="categorie" cssClass="form-control" />
			</div>
		</div>
		
		<div class="form-group">
			<form:label path="prix" cssClass="col-sm-2 control-label">Prix </form:label>
			<div class="col-sm-5">
				<form:input path="prix" cssClass="form-control" />
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
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

<div class="col-sm-7 col-lg-offset-2"
		style="position: relative; padding-top: 30px; padding-bottom: 30px; top: 50px; border-style: solid; border-width: 1px; border-color: grey; background-color: rgba(215, 215, 215, 0.8); border-radius: 25px;">


		<form:form method="PUT" action="soumettreModifVoyage" modelAttribute="vForm">
			
			<div class="form-group">
				<label for="compagnieVoyage" class="col-sm-3 control-label">Compagnie
					Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="compagnieVoyage"  class="form-control"
						id="idCompagnieVoyage" placeholder="Compagnie Voyage"/>
				</div>
			</div>

			
			<br />
			<br />
			<br />
			<div class="form-group">
				<label for="pays" class="col-sm-3 control-label">Pays :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="pays"  class="form-control"
						id="idPays" placeholder="Pays"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="dateArrivee" class="col-sm-3 control-label">dateArrivee:</label>
				<div class="col-sm-3">
					<form:input type="datetime-local" path="dateArrivee" 
						id="idDate" placeholder="Date"/>
				</div>
			</div>
				
			<br />
			<br />
			<br />
			<br />


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-5">
					<input type="submit" value="Modifier Voyage">
				</div>
			</div>
		</form:form>

	</div>

</body>
</html>
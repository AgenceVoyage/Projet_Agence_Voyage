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
<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

</head>
<body>

	<jsp:include page="../../templates/headerAgent.jsp" />

	<h1 style="color: Teal; margin-left: 28%">Formulaire de
		modification d'un voyage</h1>
	<br />

	<div style="margin-left: 23%">
		<form:form method="PUT" action="soumettreModifVoyage"
			modelAttribute="vModif" cssClass="form-horizontal">

			<div class="form-group">
				<label for="id" class="col-sm-3 control-label">ID Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="id" class="form-control" id="idId"
						placeholder="ID du Voyage" readOnly="true"/>
				</div>
			</div>

			<div class="form-group">
				<label for="nom" class="col-sm-3 control-label">Nom du
					Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="nom" class="form-control" id="idNom"
						placeholder="Nom" />
				</div>
			</div>

			<div class="form-group">
				<label for="reference" class="col-sm-3 control-label">Reference
					:</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="reference" class="form-control"
						id="idReference" placeholder="Reference" />
				</div>
			</div>

			<div class="form-group">
				<label for="compagnieVoyage" class="col-sm-3 control-label">Compagnie
					Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="compagnieVoyage" class="form-control"
						id="idCompagnieVoyage" placeholder="Compagnie Voyage" />
				</div>
			</div>

			<div class="form-group">
				<label for="pays" class="col-sm-3 control-label">Pays :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="pays" class="form-control"
						id="idPays" placeholder="Pays" />
				</div>
			</div>

			<div class="form-group">
				<label for="ville" class="col-sm-3 control-label">Ville :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="ville" class="form-control"
						id="idVille" placeholder="Ville" />
				</div>
			</div>

			<div class="form-group">
				<label for="continent" class="col-sm-3 control-label">Continent
					:</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="continent" class="form-control"
						id="idContinent" placeholder="Continent" />
				</div>
			</div>

			<div class="form-group">
				<label for="dateDepart" class="col-sm-3 control-label">Date
					de depart :</label>
				<div class="col-sm-5">
					<form:input type="date" path="dateDepart" id="idDateDepart" class="form-control"
						placeholder="Date de depart" />
				</div>
			</div>

			<div class="form-group">
				<label for="dateArrivee" class="col-sm-3 control-label">Date
					d'arrivée:</label>
				<div class="col-sm-5">
					<form:input type="date" path="dateArrivee" id="idDate" class="form-control"
						placeholder="Date d'arrivee" />
				</div>
			</div>

			<div class="form-group">
				<label for="prixPublic" class="col-sm-3 control-label">Prix
					public :</label>
				<div class="col-sm-5">
					<form:input type="number" path="prixPublic" id="idPrixPublic" class="form-control"
						placeholder="Prix Public" />
				</div>
			</div>

			<div class="form-group">
				<label for="remise" class="col-sm-3 control-label">Remise :</label>
				<div class="col-sm-5">
					<form:input type="number" path="remise" id="idRemise" class="form-control"
						placeholder="Remise" />
				</div>
			</div>

			<div class="form-group">
				<label for="nbPlaces" class="col-sm-3 control-label">Nombre
					de places :</label>
				<div class="col-sm-5">
					<form:input type="number" path="nbPlaces" id="idNbPlaces" class="form-control"
						placeholder="Nombre de places" />
				</div>
			</div>

			<br />
			<div class="form-group" style="margin-left: 12%">
				<div class="col-sm-offset-2 col-sm-5">
					<input type="submit" class="btn btn-info" value="Modifier Voyage">
				</div>
			</div>
		</form:form>

	</div>

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
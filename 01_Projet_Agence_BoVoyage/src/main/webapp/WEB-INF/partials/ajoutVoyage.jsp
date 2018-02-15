<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter Voyage</title>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<!-- ajout lib angular js -->
<script type="text/javascript"
	src="<c:url value="/resources/angular/jquery-3.2.1.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/angular/angular.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/angular/angular-base64-upload.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/angular/gestionPhoto.js"/>"></script>

<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>

<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

</head>
<body>

	<jsp:include page="../../templates/headerClient.jsp" />

	<div style="margin-left: 25%">

		<form:form method="POST" action="soumettreAjoutVoyage"
			modelAttribute="vForm" enctype="multipart/form-data"
			cssClass="form-horizontal">

			<div class="form-group">
				<label for=nom class="col-sm-3 control-label">Nom du voyage</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="nom" class="form-control" id="idNom"
						placeholder="Nom du Voyage" />
				</div>
			</div>

			<div class="form-group">
				<label for="reference" class="col-sm-3 control-label">Reference</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="reference" class="form-control"
						id="idReference" placeholder="Reference" />
				</div>
			</div>

			<div class="form-group">
				<label for="compagnieVoyage" class="col-sm-3 control-label">Compagnie
					Voyage</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="compagnieVoyage" name="jfsqdfh"
						class="form-control" id="idCompagnieVoyage"
						placeholder="Compagnie Voyage" />
				</div>
			</div>

			<div class="form-group">
				<label for=continent class="col-sm-3 control-label">Continent</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="continent" class="form-control"
						id="idContinent" placeholder="Continent" />
				</div>
			</div>

			<div class="form-group">
				<label for="pays" class="col-sm-3 control-label">Pays</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="pays" class="form-control"
						id="idPays" placeholder="Pays" />
				</div>
			</div>

			<div class="form-group">
				<label for="ville" class="col-sm-3 control-label">Ville</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="ville" class="form-control"
						id="idVille" placeholder="ville" />
				</div>
			</div>

			<div class="form-group">
				<label for="nbPlaces" class="col-sm-3 control-label">Nombre
					de places disponibles Place</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="nbPlaces" class="form-control"
						id="nbPlaces" placeholder="nb Places" />
				</div>
			</div>


			<div class="form-group">
				<label for="prixPublic" class="col-sm-3 control-label">Prix
					Initial</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="prixPublic" class="form-control"
						id="nbPrixPublic" placeholder="Prix Initial " />
				</div>
			</div>

			<div class="form-group">
				<label for="prixRemise" class="col-sm-3 control-label">Remise</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="prixRemise" class="form-control"
						id="nbPrixRemise" placeholder="Prix Remise " />
				</div>
			</div>

			<div class="form-group">
				<form:label path="dateDepart" cssClass="col-sm-2 control-label">Date de Depart</form:label>
				<div class="col-sm-5">
					<form:input path="dateDepart" type="date" class="form-control" />
				</div>
			</div>

			<div class="form-group">
				<form:label path="dateArrivee" cssClass="col-sm-2 control-label">Date d'arrivée</form:label>
				<div class="col-sm-5">
					<form:input path="dateArrivee" type="date" class="form-control" />
				</div>
			</div>

			<input type="file" name="file">
			<br />

			<input type="submit" class="btn btn-info" value="Créer le Voyage">

		</form:form>

	</div>

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>

</body>
</html>


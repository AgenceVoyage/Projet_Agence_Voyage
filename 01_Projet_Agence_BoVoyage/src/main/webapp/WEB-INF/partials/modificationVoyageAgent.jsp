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
				<label for="id" class="col-sm-3 control-label">ID Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="id"  class="form-control"
						id="idId" placeholder="ID du Voyage"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="nom" class="col-sm-3 control-label">Nom du
					Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="nom"  class="form-control"
						id="idNom" placeholder="Nom"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="reference" class="col-sm-3 control-label">Reference :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="reference"  class="form-control"
						id="idReference" placeholder="Reference"/>
				</div>
			</div>
			
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
				<label for="ville" class="col-sm-3 control-label">Ville :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="ville"  class="form-control"
						id="idVille" placeholder="Ville"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="continent" class="col-sm-3 control-label">Continent :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="continent"  class="form-control"
						id="idContinent" placeholder="Continent"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="dateDepart" class="col-sm-3 control-label">Date de depart :</label>
				<div class="col-sm-3">
					<form:input type="datetime-local" path="dateDepart" 
						id="idDateDepart" placeholder="Date de depart"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="dateArrivee" class="col-sm-3 control-label">Date d'arrivee:</label>
				<div class="col-sm-3">
					<form:input type="datetime-local" path="dateArrivee" 
						id="idDate" placeholder="Date d'arrivee"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="prixPublic" class="col-sm-3 control-label">Prix public :</label>
				<div class="col-sm-3">
					<form:input type="number" path="prixPublic" 
						id="idPrixPublic" placeholder="Prix Public"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="remise" class="col-sm-3 control-label">Remise :</label>
				<div class="col-sm-3">
					<form:input type="number" path="remise" 
						id="idRemise" placeholder="Remise"/>
				</div>
			</div>
			
			<div class="form-group">
				<label for="nbPlaces" class="col-sm-3 control-label">Nombre de places :</label>
				<div class="col-sm-3">
					<form:input type="number" path="nbPlaces" 
						id="idNbPlaces" placeholder="Nombre de places"/>
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
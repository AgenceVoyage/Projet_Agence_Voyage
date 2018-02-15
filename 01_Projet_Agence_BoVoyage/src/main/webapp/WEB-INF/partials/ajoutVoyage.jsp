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
<script type="text/javascript" src="<c:url value="/resources/angular/jquery-3.2.1.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/angular.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/angular-base64-upload.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/gestionPhoto.js"/>"></script>
</head>
<body >



	<div class="col-sm-7 col-lg-offset-2"
		style="position: relative; padding-top: 30px; padding-bottom: 30px; top: 50px; border-style: solid; border-width: 1px; border-color: grey; background-color: rgba(215, 215, 215, 0.8); border-radius: 25px;">


		<form:form method="POST" action="soumettreAjoutVoyage" modelAttribute="vForm" enctype="multipart/form-data">
			
			<div class="form-group">
				<label for="compagnieVoyage" class="col-sm-3 control-label">Compagnie
					Voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="compagnieVoyage" name="jfsqdfh"  class="form-control"
						id="idCompagnieVoyage" placeholder="Compagnie Voyage"/>
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<label for=nom class="col-sm-3 control-label">Nom du voyage :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="nom"  class="form-control"
						id="idNom" placeholder="Nom du Voyage"/>
				</div>
			</div>

			
			<br/><br/>
			
			<div class="form-group">
				<label for=continent class="col-sm-3 control-label">Continent :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="continent"  class="form-control"
						id="idContinent" placeholder="Continent"/>
				</div>
			</div>
			
			<br/><br/>

			<div class="form-group">
				<label for="pays" class="col-sm-3 control-label">Pays :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="pays"  class="form-control"
						id="idPays" placeholder="Pays"/>
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<label for="ville" class="col-sm-3 control-label">Ville :</label>
				<div class="col-sm-5 ">
					<form:input type="text" path="ville"  class="form-control"
						id="idVille" placeholder="ville"/>
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<label for="nbPlaces" class="col-sm-3 control-label">Nb Place :</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="nbPlaces"  class="form-control"
						id="nbPlaces" placeholder="nb Places"/>
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<label for="prixPublic" class="col-sm-3 control-label">Prix Initial :</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="prixPublic"  class="form-control"
						id="nbPrixPublic" placeholder="Prix Initial "/>
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<label for="prixRemise" class="col-sm-3 control-label">Prix Remise :</label>
				<div class="col-sm-5 ">
					<form:input type="number" path="prixRemise"  class="form-control"
						id="nbPrixRemise" placeholder="Prix Remise "/>
				</div>
			</div>
			
			<br/>    <br/>
			
			<div class="form-group">
				<form:label path="dateDepart" cssClass="col-sm-2 control-label">Date de Depart</form:label>
				<div class="col-sm-5">
					<form:input path="dateDepart" type="date" class="form-control" />
				</div>
			</div>
			
			<br/><br/>
			
			<div class="form-group">
				<form:label path="dateArrivee" cssClass="col-sm-2 control-label">Date de naissance</form:label>
				<div class="col-sm-5">
					<form:input path="dateArrivee" type="date" class="form-control" />
				</div>
			</div>
			
			<br/><br/>
			
			<input type="file" name="file">
			
			
			
			<br />
			<br />
			<br />
			<br />
			<input type="submit" value="Valider Voyage">


		</form:form>

	</div>



</body>
</html>


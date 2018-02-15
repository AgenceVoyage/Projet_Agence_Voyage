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
<body ng-app="monApp" ng-controller="AjoutPhotoVoyage">

	{{msg}}

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
			<div id="Test">kjioh</div>
			
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
			
	<!--  		<div class="form-group">
				<label for="dateArrivee" class="col-sm-3 control-label">dateArrivee:</label>
				<div class="col-sm-3">
					<form:input type="date" path="dateArrivee" 
						id="idDate" placeholder="Date"/>
				</div>
			</div>-->
			
					<div class="row">
				<div class="input-field col-sm-12">
					<input type="file" id="selectedFile"
						ng-model="photo" accept="image/*"
						class="form-control" base-sixty-four-input> 
				</div>
			</div>
			
			<input type="file" name="file">
			
		<!-- 	 <div class="row">
				<div class="input-field col-sm-12">
					<input type="file" id="selectedFile"
						ng-model="photo" accept="image/*"
						class="form-control" base-sixty-four-input> 
				</div>
			</div>
			
	
		
		    <input type="button" ng-click="affiche()" value="Afficher image">
			
			<div ng-repeat="p in listePhoto">
			<img ng-src="data:image/JPEG;base64,{{p}}"
					style="max-height: 150px; max-width: 150px">
			</div>
			
			<input type="button" ng-click="valideImage()" value="Valider image"> -->
				<input type="submit">
			<br />
			<br />
			<br />
			<br />



		</form:form>

	</div>



</body>
</html>


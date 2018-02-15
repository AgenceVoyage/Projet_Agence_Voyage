<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
	<!-- ajout lib angular js -->
<script type="text/javascript" src="<c:url value="/resources/angular/jquery-3.2.1.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/angular.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/angular-base64-upload.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/gestionPhoto.js"/>"></script>
</head>
<body ng-app="monApp" ng-controller="AjoutPhotoVoyage">

	<h1> Ajouter photo</h1>
		
		
 		
	
			< <div class="row">
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
			
				
				
	
			 <div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
				<button class="btn btn-default" ng-click="ajouterPhoto()">Ajouter Photo3</button>
				</div>
			</div>	
	
		

</body>
</html>
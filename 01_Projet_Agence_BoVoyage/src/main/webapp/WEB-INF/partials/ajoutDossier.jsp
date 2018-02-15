<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Ajout de la taglib spring mvc form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter un Dossier</title>

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>


</head>
<body>

	<div style="margin-left: 10%; width: 80%">
		<jsp:include page="../../templates/headerClient.jsp" />
	</div>
	<h1 style="color: red; text-align: center">Formulaire de
		reservation du voyage ${dossierAjout.voyage.nom}</h1>

	<form:form method="POST" action="client/soumettreAjoutDossier"
		modelAttribute="dossierAjout" cssClass="form-horizontal">

		<div class="form-group">
			<form:label path="prestation" class="col-sm-2 control-label">Prestation : </form:label>
			<form:select path="prestation">
				<form:option value="avion">
					<c:out value="Avion"></c:out>
				</form:option>
				<form:option value="avion+hotel" onclick="montrer(1)">
					<c:out value="Avion et Hotel"></c:out>
				</form:option>
				<form:option value="avion+voiture" onclick="montrer(2)">
					<c:out value="Avion et Voiture"></c:out>
				</form:option>
				<form:option value="avion+hotel+voiture" onclick="montrer(3)">
					<c:out value="Avion, Hotel et Voiture"></c:out>
				</form:option>
			</form:select>
		</div>



		<div class="menuDeroulants">
			<div class="form-group">
				<form:label path="nomFormule" class="col-sm-2 control-label">Formule de l'hotel : </form:label>
				<form:select path="prestation">
					<form:option value="avion">
						<c:out value="Avion"></c:out>
					</form:option>
					<form:option value="avion+hotel">
						<c:out value="Avion et Hotel"></c:out>
					</form:option>
					<form:option value="avion+voiture">
						<c:out value="Avion et Voiture"></c:out>
					</form:option>
					<form:option value="avion+hotel+voiture">
						<c:out value="Avion, Hotel et Voiture"></c:out>
					</form:option>
				</form:select>
			</div>
		</div>
		
		<div class="menuDeroulants">
			<div class="form-group">
				<form:label path="nomFormule" class="col-sm-2 control-label">Voiture : </form:label>
				<form:select path="prestation">
					<form:option value="avion">
						<c:out value="Avion"></c:out>
					</form:option>
					<form:option value="avion+hotel">
						<c:out value="Avion et Hotel"></c:out>
					</form:option>
					<form:option value="avion+voiture">
						<c:out value="Avion et Voiture"></c:out>
					</form:option>
					<form:option value="avion+hotel+voiture">
						<c:out value="Avion, Hotel et Voiture"></c:out>
					</form:option>
				</form:select>
			</div>
		</div>

		<br />
		<br />
		<br />

		<!-- ajouter les voyageurs 1 à 1 -->
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Ajouter" />
			</div>
		</div>
	</form:form>
</body>
</html>
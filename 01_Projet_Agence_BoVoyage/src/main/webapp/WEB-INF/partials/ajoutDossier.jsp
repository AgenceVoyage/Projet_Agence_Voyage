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

<link rel="stylesheet"
	href="<c:url value="/resources/css/dossier.css"/>">

<script type="text/javascript"
	src="<c:url value="/resources/js/dossier.js"/>"></script>


<link rel="stylesheet" href="<c:url value="/resources/css/log.css"/>" />

</head>
<body>

	<jsp:include page="../../templates/headerClient.jsp" />

	<h1 style="color: Teal; margin-left: 20%">Formulaire de
				reservation du voyage ${dossierAjout.voyage.nom}</h1>
	<br />

	<div style="margin-left: 32%">

		<form:form method="POST" action="soumettreAjoutDossier"
			modelAttribute="dossierAjout" cssClass="form-horizontal">

			<div class="form-group" hidden="true">
				<form:label path="id" cssClass="col-sm-2 control-label">Id</form:label>
				<div class="col-sm-5">
					<form:input path="id" cssClass="form-control" />
				</div>
			</div>

			<div class="form-group">
				<form:label path="prestation" class="col-sm-2 control-label" style="color:Teal"><b>Prestation </b></form:label>
				<form:select path="prestation" onchange="affiche()" id="idPrest">
					<form:option value="avion">
						<c:out value="Avion"></c:out>
					</form:option>
					<form:option value="avion+hotel" onclick="montrer(2)">
						<c:out value="Avion et Hotel"></c:out>
					</form:option>
					<form:option value="avion+voiture" onclick="montrer(3)">
						<c:out value="Avion et Voiture"></c:out>
					</form:option>
					<form:option value="avion+hotel+voiture" onclick="montrer(4)">
						<c:out value="Avion, Hotel et Voiture"></c:out>
					</form:option>
				</form:select>
			</div>

			<br />
			<br />
			<br />


			<div id="avion">Prix total : ${dossierAjout.voyage.prixRemise}
				euros</div>


			<div class="cacher" id="hotel">
				<div class="form-group">
					<form:label path="nomFormule" class="col-sm-2 control-label" style="color:Teal">Formule de l'hotel </form:label>
					<form:select path="nomFormule" onchange="affiche2()" id="idFormule">
						<form:option value="hebergement seul">
							<c:out value="Hebergement seul"></c:out>
						</form:option>
						<form:option value="petit dejeuner">
							<c:out value="Hebergement et petit-dejeuner"></c:out>
						</form:option>
						<form:option value="demi pension">
							<c:out value="Hebergement et demi-pension"></c:out>
						</form:option>
						<form:option value="pension complete">
							<c:out value="Hebergement et pension complete"></c:out>
						</form:option>
					</form:select>
				</div>
			</div>

			<br />

			<div class="cacher2" id="hotel1">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.hotel.prix}
				euros</div>
			<div class="cacher2" id="hotel2">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.hotel.prix*(1.1)}
				euros</div>
			<div class="cacher2" id="hotel3">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.hotel.prix*(1.3)}
				euros</div>
			<div class="cacher2" id="hotel4">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.hotel.prix*(1.5)}
				euros</div>

			<div class="cacher" id="voiture">
				<h4>Voiture :</h4>
				Loueur : ${dossierAjout.voyage.voiture.loueur} <br /> Categorie :
				${dossierAjout.voyage.voiture.categorie}
			</div>

			<br />
			<div class="cacher" id="voiture1">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.voiture.prix}
				euros</div>

			<div class="cacher2" id="tout1">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.voiture.prix+dossierAjout.voyage.hotel.prix}
				euros</div>
			<div class="cacher2" id="tout2">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.voiture.prix+dossierAjout.voyage.hotel.prix*(1.1)}
				euros</div>
			<div class="cacher2" id="tout3">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.voiture.prix+dossierAjout.voyage.hotel.prix*(1.3)}
				euros</div>
			<div class="cacher2" id="tout4">Prix total :
				${dossierAjout.voyage.prixRemise+dossierAjout.voyage.voiture.prix+dossierAjout.voyage.hotel.prix*(1.5)}
				euros</div>


			<div class="form-group" style="margin-left: 12%">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-info" value="Continuer" />
				</div>
			</div>
		</form:form>
	</div>
	

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
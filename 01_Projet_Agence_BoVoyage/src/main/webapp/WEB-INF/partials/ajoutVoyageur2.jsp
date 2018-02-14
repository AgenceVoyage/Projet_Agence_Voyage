<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire ajout Voyageur</title>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<script type="text/javascript"></script>
<script>
var elementPattern = /^element(\d+)$/
var deletePattern = /^deleteS(\d+)$/

function ajouterElement()
{
    var Conteneur = document.getElementById('conteneur');
    if(Conteneur)
    {
            Conteneur.appendChild(creerElement(
	dernierElement() + 1))
			//Conteneur.appendChild(creerElement(2 + 1))
		}
	}

	function dernierElement() {
		var Conteneur = document.getElementById('conteneur'), n = 0;
		if (Conteneur) {
			var elementID, elementNo;
			if (Conteneur.childNodes.length > 0) {
				for (var i = 0; i < Conteneur.childNodes.length; i++) {

					// Ici, on vérifie qu'on peut récupérer les attributs, si ce n'est pas
					// possible, on renvoit false, sinon l'attribut
					elementID = (Conteneur.childNodes[i].getAttribute) ? Conteneur.childNodes[i]
							.getAttribute('id')
							: false;
					if (elementID) {
						elementNo = parseInt(elementID.replace(elementPattern,
								'$1'));
						if (!isNaN(elementNo) && elementNo > n) {
							n = elementNo;
						}
					}
				}
			}
		}
		n = elementNo;
		return Conteneur.childNodes.length-3;
	}

	function creerElement(ID) {
		var Conteneur = document.createElement('form');
		Conteneur.setAttribute('id', 'element' + ID);
		Conteneur.setAttribute('method', 'post');
		Conteneur.setAttribute('action', 'submit.php');

		var CiviliteSelect = document.createElement('select');
		CiviliteSelect.setAttribute('path', 'civilite');
		var CiviliteOption1 = document.createElement('option');
		CiviliteOption1.setAttribute('value', 'false');
		CiviliteOption1.setAttribute('label', 'Madame');

		var CiviliteOption2 = document.createElement('option');
		CiviliteOption2.setAttribute('value', 'true');
		CiviliteOption2.setAttribute('label', 'Monsieur');

		var Nom = document.createElement('input');
		Nom.setAttribute('type', 'text');
		Nom.setAttribute('name', 'nom' + ID);
		Nom.setAttribute('id', 'nom' + ID);
		Nom.setAttribute('path', 'nom');

		var Prenom = document.createElement('input');
		Prenom.setAttribute('type', 'text');
		Prenom.setAttribute('name', 'prenom' + ID);
		Prenom.setAttribute('id', 'prenom' + ID);
		Prenom.setAttribute('path', 'prenom');

		var DateNaissance = document.createElement('input');
		DateNaissance.setAttribute('type', 'date');
		DateNaissance.setAttribute('name', 'dateNaissance' + ID);
		DateNaissance.setAttribute('id', 'dateNaissance' + ID);
		DateNaissance.setAttribute('path', 'dateNaissance');

		var Delete = document.createElement('input');
		Delete.setAttribute('type', 'button');
		Delete.setAttribute('value', 'Supprimer n°' + ID + ' !');
		Delete.setAttribute('id', 'deleteS' + ID);
		Delete.onclick = supprimerElement;

		Conteneur.appendChild(Nom);
		Conteneur.appendChild(Prenom);
		Conteneur.appendChild(DateNaissance);
		CiviliteSelect.appendChild(CiviliteOption1);
		CiviliteSelect.appendChild(CiviliteOption2);
		Conteneur.appendChild(CiviliteSelect);
		//Conteneur.appendChild(Delete);

		document.body.appendChild(Conteneur);

		return Conteneur;
	}

	function supprimerElement() {
		var Conteneur = document.getElementById('conteneur');
		var n = parseInt(this.id.replace(deletePattern, '$1'));
		if (Conteneur && !isNaN(n)) {
			var elementID, elementNo;
			if (Conteneur.childNodes.length > 0) {
				for (var i = 0; i < Conteneur.childNodes.length; i++) {
					elementID = (Conteneur.childNodes[i].getAttribute) ? Conteneur.childNodes[i]
							.getAttribute('id')
							: false;
					if (elementID) {
						elementNo = parseInt(elementID.replace(elementPattern,
								'$1'));
						if (!isNaN(elementNo) && elementNo == n) {
							Conteneur.removeChild(Conteneur.childNodes[i]);
							updateElements(); // A supprimer si tu ne veux pas la màj
							return;
						}
					}
				}
			}
		}
	}

	function updateElements() {
		var Conteneur = document.getElementById('conteneur'), n = 0;
		if (Conteneur) {
			var elementID, elementNo;
			if (Conteneur.childNodes.length > 0) {
				for (var i = 0; i < Conteneur.childNodes.length; i++) {
					elementID = (Conteneur.childNodes[i].getAttribute) ? Conteneur.childNodes[i]
							.getAttribute('id')
							: false;
					if (elementID) {
						elementNo = parseInt(elementID.replace(elementPattern,
								'$1'));
						if (!isNaN(elementNo)) {
							n++
							Conteneur.childNodes[i].setAttribute('id',
									'element' + n);
							document.getElementById('input' + elementNo)
									.setAttribute('name', 'input' + n);
							document.getElementById('input' + elementNo)
									.setAttribute('id', 'input' + n);
							document.getElementById('deleteS' + elementNo)
									.setAttribute('id', 'deleteS' + n);
						}
					}
				}
			}
		}
	}
</script>


</head>
<body>
	<h1 style="color: red; text-align: center">Formulaire d'ajout</h1>
	<form>
	<input type="button" value="Ajouter !" onclick="ajouterElement();" />
	
	</form>

	<form:form method="POST" action="soumettreFormAjoutVoyageur"
		modelAttribute="vForm" cssClass="form-horizontal" id="conteneur">
		
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success" value="Ajouter" />
			</div>
		</div>
	</form:form>



</body>
</html>
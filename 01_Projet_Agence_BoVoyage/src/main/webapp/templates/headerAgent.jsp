<!DOCTYPE html >

<html>

<head>
<title>Barre Menu</title>
<head>
<body>






	<nav class="navbar navbar-inverse" style="background-color: #F8F8F8;">
		<div class="container-fluid">
			<ul class="nav navbar-nav">


				<li><a
					href="${pageContext.request.contextPath}/agent/accueilAgent
      ">Accueil</a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Continents <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="">Europe</a></li>
						<li><a href="">Afrique</a></li>
						<li><a href="">Asie</a></li>
						<li><a href="">Oceanie</a></li>
						<li><a href="">Amerique</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Voyage (Agent) <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/voyage/ajouter">Ajouter</a></li>
						<li><a
							href="${pageContext.request.contextPath}/voyage/supprimer">Supprimer</a></li>
					</ul></li>


				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Assurances <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/assurances/liste">Afficher
								toutes les Assurances</a></li>
						<li><a
							href="${pageContext.request.contextPath}/assurances/afficheAjoutAssurance">Ajouter</a></li>
						<li><a
							href="${pageContext.request.contextPath}/assurances/afficheRecherche">Rechercher</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Voitures <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/voitures/liste">Afficher
								toutes les Voitures</a></li>
						<li><a
							href="${pageContext.request.contextPath}/voitures/afficheAjoutVoiture">Ajouter</a></li>
						<li><a
							href="${pageContext.request.contextPath}/voitures/afficheRecherche">Rechercher</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Hotels <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${pageContext.request.contextPath}/hotels/liste">Afficher
								tous les hotels</a></li>
						<li><a
							href="${pageContext.request.contextPath}/hotels/afficheAjoutHotel">Ajouter</a></li>
						<li><a
							href="${pageContext.request.contextPath}/hotels/afficheRecherche">Rechercher</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Clients <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/agent/clients/liste">Afficher
								tous les clients</a></li>
						<li><a
							href="${pageContext.request.contextPath}/agent/clients/afficheRecherche">Rechercher</a></li>
					</ul></li>


				<li><a href="${pageContext.request.contextPath}/deconnexion">Deconnexion</a></li>


				<form class="navbar-form navbar-right inline-form">
					<div class="form-group">
						<input type="search" class="input-sm form-control"
							placeholder="Recherche">
						<button type="submit" class="btn btn-primary btn-sm">
							<span class="glyphicon glyphicon-eye-open"></span> Chercher
						</button>
					</div>
				</form>

			</ul>
		</div>
	</nav>




</body>

</html>
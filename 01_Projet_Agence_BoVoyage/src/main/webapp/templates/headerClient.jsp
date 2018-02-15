<!DOCTYPE html >

<html>

<head>
<title>Barre Menu</title>
<head>
<body>
<div style="margin-left:19%;margin-right:19%">
	<nav class="navbar navbar-inverse" style="background-color: #d6caa9;">
		<div class="container-fluid">
			<ul class="nav navbar-nav">

				<li><a
					href="${pageContext.request.contextPath}/client/accueilClient"><img
						src="${pageContext.request.contextPath}/resources/images/agenceLACEME2.png"
						style="height: 50px" /></a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"
					style="color: Teal; font-style: blod">Continents <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Europe"
							style="color: Teal; font-style: blod">Europe</a></li>
						<li><a
							href="${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Afrique"
							style="color: Teal; font-style: blod">Afrique</a></li>
						<li><a
							href="${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Asie"
							style="color: Teal; font-style: blod">Asie</a></li>
						<li><a
							href="${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Australie"
							style="color: Teal; font-style: blod">Oceanie</a></li>
						<li><a
							href="${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Amerique"
							style="color: Teal; font-style: blod">Amerique</a></li>
						<li><a
							href=" ${pageContext.request.contextPath}/utilisateur/listeVoyageParCont?pContinent=Groenland"
							style="color: Teal; font-style: blod">Groenland</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"style="color: Teal; font-style: blod">Mes reservations<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/voyage/ajouter" style="color: Teal; font-style: blod">Liste
								de mes dossiers</a></li>
						<li><a
							href="${pageContext.request.contextPath}/voyage/supprimer" style="color: Teal; font-style: blod">Listes
								de mes voyages</a></li>
					</ul></li>

				<li><a
					href="${pageContext.request.contextPath}/client/afficheModif" style="color: Teal; font-style: blod">Mes
						infos</a></li>


				<li><a
					href="${pageContext.request.contextPath}/infosAgence?pNum=1" style="color: Teal; font-style: blod">Notre
						agence</a></li>

				<li><a href="${pageContext.request.contextPath}/deconnexion" style="color: Teal; font-style: blod">Deconnexion</a></li>


			</ul>
		</div>
	</nav>


</div>

</body>

</html>
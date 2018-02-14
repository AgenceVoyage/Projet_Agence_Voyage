<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ajputer la lib JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#map {
	height: 600px;
	width: 100%;
}
</style>
<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<title>MapTest</title>
</head>
<body>
	<h3 style="text-align: center;">Localisation du séjour</h3>
	<div id="map"></div>
	<script>
		window.onload = function() {
			httpGet();
		};

		var num = '4';
		var rue = 'Allee Brancas';
		var cp = '44000';
		var ville = 'Nantes';
		var result;
		var vlat;
		var lng;

		function httpGet(url, callback) {
			var url = 'https://maps.googleapis.com/maps/api/geocode/json?address='
					+ num
					+ ''
					+ rue
					+ ','
					+ cp
					+ ''
					+ ville
					+ '&key=AIzaSyBz2jm5RRGDAnvYharuQWuyKF6r9BI2MtY';
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.open('GET', url, true);
			xmlhttp.send();
			xmlhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					var result = JSON.parse(this.responseText);
					vlat = result.results[0].geometry.location.lat;
					vlng = result.results[0].geometry.location.lng;
					initMap();
				}
			};
		}

		function initMap() {
			// variable de localisation
			var adaming = {
				lat : 47.2134338,
				lng : -1.5616846
			};
			var map = new google.maps.Map(document.getElementById('map'), {
				zoom : 16,
				center : adaming
			});
			// text infos bulle
			var contentString = '<div id="content">'
					+ '<div id="siteNotice">'
					+ '</div>'
					+ '<h1 id="firstHeading" class="firstHeading">Agence LACEME</h1>'
					+ '<div id="bodyContent">'
					+ '<img src="assets/resources/images/logoAnanasImmo.png" alt="" style="height:120px"/>'
					+ '<br/>' + '<br/>' + '<p>24 rue Crebillon</p>'
					+ '<p>44000 Nantes</p>' + '<p>France</p>' + '</div>'
					+ '</div>';
			// affichage de l'info
			var infowindow = new google.maps.InfoWindow({
				content : contentString
			});
			// ajout du marqueur
			var marker = new google.maps.Marker({
				position : adaming,
				map : map,
				title : 'Agence'
			});
			// clic de l'info bulle
			marker.addListener('click', function() {
				if (infowindow2) {
					infowindow2.close();
				}
				infowindow.open(map, marker);
			});
			var voyage = {
				lat : vlat,
				lng : vlng
			};
			var contentString2 = '<div id="content">'
					+ '<div id="siteNotice">'
					+ '</div>'
					+ '<h1 id="firstHeading" class="firstHeading">Voyage</h1>'
					+ '<div id="bodyContent">'
					+ '<img src="assets/resources/images/logoAnanasImmo.png" alt="" style="height:120px"/>'
					+ '<br/>' + '<br/>' + '<p>' + num + ' ' + rue + '</p>'
					+ '<p>' + cp + ' ' + ville + '</p>' + '<p>France</p>'
					+ '</div>' + '</div>';
			// affichage de l'info
			var infowindow2 = new google.maps.InfoWindow({
				content : contentString2
			});
			// ajout du marqueur
			var markerV = new google.maps.Marker({
				position : voyage,
				map : map,
				title : 'Voyage'
			});
			// clic de l'info bulle
			markerV.addListener('click', function() {
				if (infowindow) {
					infowindow.close();
				}
				infowindow2.open(map, markerV);
			});
		}
	</script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBz2jm5RRGDAnvYharuQWuyKF6r9BI2MtY">
		
	</script>
</body>
</html>
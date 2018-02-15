window.onload = function() {
	httpGet();
};

var num = '4';
var rue = 'Allee Brancas';
var cp = '44000';
var result;
var vlat;
var lng;

function httpGet(url, callback) {
	var url = 'https://maps.googleapis.com/maps/api/geocode/json?address='
			+ ville + ',' + pays
			+ '&key=AIzaSyBz2jm5RRGDAnvYharuQWuyKF6r9BI2MtY';
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.open('GET', url, true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var result = JSON.parse(this.responseText);
			vlat = result.results[0].geometry.location.lat;
			console.log(vlat);
			vlng = result.results[0].geometry.location.lng;
			console.log(vlng);
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
	var voyage = {
		lat : vlat,
		lng : vlng
	};
	var map = new google.maps.Map(document.getElementById('map'), {
		zoom : 3,
		center : voyage
	});
	// text infos bulle
	var contentString = '<div id="content">'
			+ '<div id="siteNotice">'
			+ '</div>'
			+ '<h1 id="firstHeading" class="firstHeading">Agence LACEME</h1>'
			+ '<div id="bodyContent">'
			+ '<img src="assets/resources/images/logoAnanasImmo.png" alt="" style="height:120px"/>'
			+ '<br/>' + '<br/>' + '<p>24 rue Crebillon</p>'
			+ '<p>44000 Nantes</p>' + '<p>France</p>' + '</div>' + '</div>';
	var contentString2 = '<div id="content">'
			+ '<div id="siteNotice">'
			+ '</div>'
			+ '<h1 id="firstHeading" class="firstHeading">'
			+ ville
			+ '</h1>'
			+ '<div id="bodyContent">'
			+ '<img src="assets/resources/images/logoAnanasImmo.png" alt="" style="height:120px"/>'
			+ '<br/>' + '<br/>' + '<p>' + pays + '</p>' + '</div>' + '</div>';
	// affichage de l'info
	var infowindow = new google.maps.InfoWindow({
		content : contentString
	});
	var infowindow2 = new google.maps.InfoWindow({
		content : contentString2
	});
	// ajout du marqueur
	var marker = new google.maps.Marker({
		position : adaming,
		map : map,
		title : 'Agence'
	});
	var markerV = new google.maps.Marker({
		position : voyage,
		map : map,
		title : nom
	});
	// clic de l'info bulle
	marker.addListener('click', function() {
		if (infowindow2) {
			infowindow2.close();
		}
		infowindow.open(map, marker);
	});
	markerV.addListener('click', function() {
		if (infowindow) {
			infowindow.close();
		}
		infowindow2.open(map, markerV);
	});
}
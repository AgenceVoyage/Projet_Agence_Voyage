console.log("dossier js")

function affiche() {
	var prest = document.getElementById('idPrest').value;
	
	$(".avion").hide();
	$(".menuDeroulants").hide();
	
	if (prest=="avion") {
		$(".avion").show();
	}
}
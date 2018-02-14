


var monApp=angular.module("monApp",['naif.base64'])


	.controller("AjoutPhotoVoyage", function($scope) {
		
		
		$scope.photo=null;		
		$scope.msg="Angular"
		$scope.i=0;
		
		$scope.listePhoto={
				
		}
			
			
		$scope.listePhoto=[]	
		
		
		$scope.affiche=function(){
			$scope.listePhoto[$scope.i]=$scope.photo.base64;
			$scope.i++;
		}
		
		
			
		$scope.valideImage=function(){
			// Recup attribut listePhoto de voyage
			console.log("Affectation")
			var element = document.getElementById("idCompagnieVoyage").value;
			console.log("element:"+element)
			element="LOL"
			$scope.msg=element
			
			var compagnie = document.getElementById("idCompagnieVoyage").path;
			console.log("compagnie:"+compagnie)
			//var imagesVoyageController = document.getElementById("listePhoto").value;
		}
		
		
		$scope.ajouterPhoto=function(){
			
			var person = {"name":"John"};
			
			 $.ajax({
				 type: "POST",
				  url: "/voyage/recupPhoto",
				  type: 'POST',
		            data:  person,             
		            dataType: "html",          
		            contentType: 'application/json',
		            mimeType: 'application/json',
				     success :function(result)
				     {
				    	 console.log("Bonne redirection")
				     }
				  })
		}
	
	})
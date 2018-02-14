


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
				 contentType : 'application/json; charset=utf-8',
			     dataType : 'json',
				 url: "/voyage/recupRest",
		         data:  JSON.stringify(person),             
        

				     success :function(result)
				     {
				    	 console.log("Bonne redirection")
				     }
				  })
		}
	
	})
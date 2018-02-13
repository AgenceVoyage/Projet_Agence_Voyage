<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter Voyage</title>
</head>
<body>



		<form:form method="POST" action="soumettreAjoutVoyage" modelAttribute="vForm">
		<table>
			<tr>
			<td><form:label path="compagnieVoyage">Compagnie Voyage:</form:label></td>
			<td><form:input path="compagnieVoyage"/></td>
			<td><form:errors path="compagnieVoyage" cssStyle="color:red"/></td>
			</tr>
			<tr>
			<td><form:label path="continent">Continent:</form:label></td>
			<td><form:input path="continent"/></td>
			<td><form:errors path="continent" cssStyle="color:red"/></td>
			</tr>
			<tr>
			<td><form:label path="nbPlaces">Nb places:</form:label></td>
			<td><form:input path="nbPlaces"/></td>
			<td><form:errors path="nbPlaces" cssStyle="color:red"/></td>
			</tr>
		
		</table>
		
	
  			
 			<br/>

			<input type="submit" value="Ajouter Marchandise">
		
 
	
	</form:form>

</body>
</html>
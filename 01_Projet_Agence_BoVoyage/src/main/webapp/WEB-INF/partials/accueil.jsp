<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% // librairie a rajouter si necessaire (jstl ...) %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Page Accueil</title>
  <meta charset="utf-8">

  <link rel="stylesheet" href="<c:url value="/resources/boostrap/bootstrap.min.css"/>"/>
  	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 	 <script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
</head>
<body>

 <div style="margin-left:10%;width:80%">

		<h1 style="text-align:center;color:blue"> Accueil </h1>
		
		
		<jsp:include page="../../templates/headerUtilisateur.jsp"/>


</div>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	// librairie a rajouter si necessaire (jstl ...)
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Page Accueil</title>
<meta charset="utf-8">

<link rel="stylesheet"
	href="<c:url value="/resources/boostrap/bootstrap.min.css"/>" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/boostrap/bootstrap.min.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/carte.css"/>" />

<link rel="stylesheet"
	href="<c:url value="/resources/css/utilisateur.css"/>" />


<script type="text/javascript"
	src="<c:url value="/resources/js/slider.js"/>"></script>
</head>
<body>
		<jsp:include page="../../templates/headerUtilisateur.jsp" />

	<div style="margin-left: 4%; width: 80%">

		<div>
			<jsp:include page="../../templates/carte.jsp" />
		</div>

	<div>
		<jsp:include page="../../templates/footer.jsp" />
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Simulateur de prêt
	</h1>
	

<form action="Controleur" method="post">
	<div>
		Pret Initial:<input type="text" name="pret" value="">
	</div>
	<div>
		Taux d'intérêt Annuel:<input type="text" name="taux" value="">
	</div>
	<div>
		Nombre d'années:<input type="text" name="na" value="">
	</div>
	
	<div>
		<input type="submit" value="Calculer">
	</div>
	
	<input type="hidden" name="forme" value="forme1">
</form>
	
</body>
</html>
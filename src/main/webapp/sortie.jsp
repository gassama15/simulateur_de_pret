<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="domaine.*" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		R�capitulatif du Simulateur de pr�t
	</h1>
	<div>
		<h2>Donn�es saisies</h2>
		<% Pret p = (Pret) request.getAttribute("pret"); %>
		
		Montant du pr�t: <%= p.getMpret() %> <br>	
		Taux annuel: <%= p.getTia() %> <br>	
		Nombre d'ann�es: <%= p.getNa() %> <br>	
	</div>
	
	<div>
		<h1>
			R�sultats
		</h1>
		Montant mensuel � rembourser: <%= Math.round(p.getMmens()) %> <br>
		Montant global � payer: <%= Math.round(p.getMglobal()) %> <br>
	</div>
		
	
</body>
</html>
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
		Récapitulatif du Simulateur de prêt
	</h1>
	<div>
		<h2>Données saisies</h2>
		<% Pret p = (Pret) request.getAttribute("pret"); %>
		
		Montant du prêt: <%= p.getMpret() %> <br>	
		Taux annuel: <%= p.getTia() %> <br>	
		Nombre d'années: <%= p.getNa() %> <br>	
	</div>
	
	<div>
		<h1>
			Résultats
		</h1>
		Montant mensuel à rembourser: <%= Math.round(p.getMmens()) %> <br>
		Montant global à payer: <%= Math.round(p.getMglobal()) %> <br>
	</div>
		
	
</body>
</html>
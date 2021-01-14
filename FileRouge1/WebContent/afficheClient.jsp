<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informations Client</title>
</head>
<body>
	<h1> Information du client</h1>
	
	<h3>Bonjour : </h3>
	<p> Nom : ${ c.nomClient }</p>
	<p> Prenom : ${ c.prenomClient }</p>
	<p> Adresse : ${ c.adresseClient }</p>
	<p> Numéro de téléphone : ${ c.telephoneClient }</p>
	<p> Email : ${ c.emailClient }</p>
</body>
</html>
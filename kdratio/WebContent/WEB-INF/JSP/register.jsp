<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
	<link rel="stylesheet" type="text/css" href="skjema.css">
	
<title>Register</title>
</head>
<body>
	<h1>Register</h1>
	<form id="skjema" name="skjema" method="post" action="RegisterServlet" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="fornavn">Fornavn:</label> <input id="fornavn" type="text"
					name="fornavn" value="${skjema.fornavn}" /> 
					<p id="fornavnServerFeil" class="feil">${skjema.fornavnFeilmelding}</p>
					
					<p id="fornavnFeil" class="gjemt feil">Ugyldig fornavn!</p>
					
			</div>
			<div class="pure-control-group">
				<label for="passord">Passord:</label> <input id="passord" type="password"
					name="passord" value="" /> 
					<p id="passordServerFeil" class="feil">${skjema.passordFeilmelding}</p>
					<p id="passordFeil" class="gjemt feil">Ugyldig passord!</p>
					<p class="feil" id="passordTilbakemelding"></p>
			</div>
			<div class="pure-control-group">
				<label for="passordRepetert">Passord repetert:</label> <input id="passordRepetert"
					type="password" name="passordRepetert"
					value="" /> 
					<p id="passordRepetertServerFeil" class="feil">${skjema.passordRepetertFeilmelding}</p>
					<p id="passordRepetertFeil" class="gjemt feil">Passord må være like!</p>
			</div>
			<div class="pure-controls">
				<button id="knapp" type="submit" class="pure-button pure-button-primary">Submit</button>
			</div>
		</fieldset>
	</form>
	<p><a href="LoginServlet">Jeg har allerede meldt meg på, jeg vil heller logge inn!</a></p>
	
	<script src="scripts/InputValidering.js"></script>
</body>
</html>
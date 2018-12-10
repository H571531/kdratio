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
	<form id="skjema" name="skjema" method="post" action="RegisterSerlvet" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="fornavn">Username:</label> <input id="Username" type="text"
					name="Username" value="${skjema.username}" /> 
					<p id="usernameFeilmelding" class="feil">${skjema.usernameFeilmelding}</p>
					
					<p id="fornavnFeil" class="gjemt feil">Ugyldig fornavn!</p>
					
			</div>
			<div class="pure-control-group">
				<label for="passord">Passord:</label> <input id="passord" type="password"
					name="passord" value="" /> 
					<p id="passordServerFeil" class="feil">${skjema.passwordFeilmelding}</p>
					<p id="passordFeil" class="gjemt feil">Ugyldig passord!</p>
					<p class="feil" id="passordTilbakemelding"></p>
			</div>
			<div class="pure-control-group">
				<label for="passordRepetert">Passord repetert:</label> <input id="passwordRepetert"
					type="password" name="passordRepetert"
					value="" /> 
					<p id="passordRepetertServerFeil" class="feil">${skjema.passwordRepetertFeilmelding}</p>
					<p id="passordRepetertFeil" class="gjemt feil">Passord m� v�re like!</p>
			</div>
			<div class="pure-controls">
				<button id="knapp" type="submit" class="pure-button pure-button-primary">Submit</button>
			</div>
		</fieldset>
	</form>
	<p><a href="LoginServlet">Jeg har allerede meldt meg p�, jeg vil heller logge inn!</a></p>
	
	<script src="scripts/InputValidering.js"></script>
</body>
</html>
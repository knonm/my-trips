<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.usp.mytrips.facade.LoginFacade" %>
<%@ page import="br.usp.mytrips.ejb.factory.EJBFactory" %>
<%@ page import="br.usp.mytrips.facade.GeoIPFacade" %>
<%@ page import="br.usp.mytrips.rs.qpx.SearchTripsEndpoint" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>MyTrips :: Buscar pacote</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
	<%!
	LoginFacade loginFacade;
	boolean isValido;
	%>
	<%
	loginFacade = EJBFactory.getBean(LoginFacade.class, "LoginFacade");
	%>
    <% isValido = loginFacade.validaUsuario(null, null); %>
    <%
	if(isValido) {
	%>
	<div class="container">
		<header class="row">
			<div class="col-sm-12 centered">
				<a href="index.jsp"><img src="img/logo.png" /></a>
			</div>
		</header>
		<div>
			<h1>Buscar pacotes</h1>
			<form role="form" method="post" action="listaPacotes.jsp">
			<!--Informa origem, destino, data de ida e volta do vôo, quartos do hotel, quantos adultos, quantas crianças-->
				<label for="origem">Origem</label>
				<input type="search" class="form-control" name="origem" id="origem" maxlength="60" />
				<label for="destino">Destino</label>
				<input type="search" class="form-control" name="destino" id="destino" maxlength="60" />
				<label for="dt_ida">Data da ida</label>
				<input type="date" class="form-control" name="dt_ida" id="dt_ida" min="2016-06-01" />
				<!--<label for="dt_volta">Data da volta</label>
				<input type="date" class="form-control" name="dt_volta" id="dt_volta" min="2016-06-01" />-->
				<label for="quartos">Nº. de quartos</label>
				<input type="number" class="form-control" name="quartos" id="quartos" min="0" max="9" />
				<label for="adultos">Nº. de adultos (maiores de 12 anos)</label>
				<input type="number" class="form-control" name="adultos" id="adultos" min="1" max="9" />
				<label for="criancas">Nº. de crianças (menores de 12 anos)</label>
				<input type="number" class="form-control" name="criancas" id="criancas" min="0" max="9" />
				<button type="submit" class="btn btn-default">Buscar</button>
			</form>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>
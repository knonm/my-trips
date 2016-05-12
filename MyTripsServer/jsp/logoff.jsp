<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.usp.mytrips.facade.LoginFacade" %>
<%@ page import="br.usp.mytrips.ejb.factory.EJBFactory" %>
<%@ page import="br.usp.mytrips.facade.GeoIPFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logoffs</title>
</head>
<body>
<%!
LoginFacade loginFacade;
boolean isValido;
%>
<%
loginFacade = EJBFactory.getBean(LoginFacade.class, "LoginFacade");
loginFacade.logoff();
%>
<p>A sessão do usuário foi encerrada.</p>
<br/>
<form role="form" method="post" action="index.html">
<button type="submit" class="btn btn-default">Voltar</button>
</body>
</html>
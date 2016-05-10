<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.usp.mytrips.facade.LoginFacade" %>
<%@ page import="br.usp.mytrips.ejb.factory.EJBFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Response</title>
</head>
<body>
<%!
LoginFacade loginFacade;
boolean isValido;
%>
<%
loginFacade = EJBFactory.getBean(LoginFacade.class, "LoginFacade");
%>
<% isValido = loginFacade.validaUsuario(request.getParameter("email"), request.getParameter("senha")); %>
<% if(isValido) { %>
<p>Login está correto.</p>
<% } else { %>
<p>Login está incorreto.</p>
<% } %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.usp.mytrips.facade.LoginFacade" %>
<%@ page import="br.usp.mytrips.ejb.factory.EJBFactory" %>
<%@ page import="br.usp.mytrips.facade.GeoIPFacade" %>
<%@ page import="br.usp.mytrips.rs.qpx.SearchTripsEndpoint" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Response</title>
</head>
<body>
<%!
LoginFacade loginFacade;
GeoIPFacade geoIPFacade;
boolean isValido;
%>
<%
loginFacade = EJBFactory.getBean(LoginFacade.class, "LoginFacade");
geoIPFacade = EJBFactory.getBean(GeoIPFacade.class, "GeoIPFacade");
%>
<% isValido = loginFacade.validaUsuario(request.getParameter("email"), request.getParameter("senha")); %>
<br/>
<form role="form" method="post" action="login.jsp">
<label for="ip_address">IP Address: </label>
<input type="text" class="form-control" name="ip_address" id="ip_address" maxlength="60" />
<button type="submit" class="btn btn-default">Consultar</button>
</form>
<%
if(isValido) {
%>
<form role="form" method="post" action="logoff.jsp">
<button type="submit" class="btn btn-default">Logoff</button>
</form>
<%
	String ip = request.getParameter("ip_address");
	if(ip != null && ip.length() > 0) {
		out.println("IP externo: " + ip);
		out.println("<br/>");
		out.println("País: " + geoIPFacade.getCountryByIP(ip));
	}
	out.println("<br/>");
	out.println("Login está correto.");
} else {
	out.println("Login está incorreto.");
	out.println(SearchTripsEndpoint.testSearchTripsEndpoint());
}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.usp.mytrips.facade.LoginFacade" %>
<%@ page import="br.usp.mytrips.facade.BuscaPacoteFacade" %>
<%@ page import="br.usp.mytrips.ejb.factory.EJBFactory" %>
<%@ page import="br.usp.mytrips.facade.GeoIPFacade" %>
<%@ page import="br.usp.mytrips.rs.qpx.SearchTripsEndpoint" %>
<%@ page import="br.usp.mytrips.rs.qpx.request.*" %>
<%@ page import="br.usp.mytrips.rs.qpx.entities.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>MyTrips :: Lista de pacotes</title>
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
	BuscaPacoteFacade buscaPacoteFacade;
	boolean isValido;
	%>
	<%
	loginFacade = EJBFactory.getBean(LoginFacade.class, "LoginFacade");
	buscaPacoteFacade = EJBFactory.getBean(BuscaPacoteFacade.class, "BuscaPacoteFacade");
	isValido = loginFacade.validaUsuario(null, null);
	%>
    <%
	if(isValido) {
		QPXRequest qpxreq = new QPXRequest();
		Request req = new Request();
		Passenger passenger = new Passenger();
		br.usp.mytrips.rs.qpx.request.Slice sl1 = new br.usp.mytrips.rs.qpx.request.Slice();
		
		sl1.setOrigin(request.getParameter("origem"));
		sl1.setDestination(request.getParameter("destino"));
		sl1.setDate(request.getParameter("dt_ida"));
		
		passenger.setSeniorCount(Integer.valueOf(request.getParameter("adultos")));
		passenger.setAdultCount(Integer.valueOf(request.getParameter("adultos")));
		passenger.setChildCount(Integer.valueOf(request.getParameter("criancas")));
		
		req.setPassengers(passenger);
		req.setSlice(new br.usp.mytrips.rs.qpx.request.Slice[] { sl1 });
		req.setSolutions(10);
		
		qpxreq.setRequest(req);
		
		QPXResponse qpxres = buscaPacoteFacade.buscaPacote(qpxreq);
		
		out.println("<h1>Aeroportos</h1><table>");
		for(int i = 0; i < qpxres.getTrips().getData().getAirport().length; i++) {
			out.print("<tr><td>");
			out.print(qpxres.getTrips().getData().getAirport()[i].getName());
			out.print("<br /></td><td>");
			out.print(qpxres.getTrips().getData().getAirport()[i].getCity());
			out.print("</td></tr>");
		}
		out.print("</table>");
		out.println("<br/>");
		out.println("<h3>Preços</h3>");
		for(int i = 0; i < qpxres.getTrips().getTripOption().length; i++) {

			out.println(qpxres.getTrips().getTripOption()[i].getSaleTotal());
			out.println("<br/");
		}
		out.println("<br/");
		
		out.println("<br/>");
		
		int numEscala = 1;
		
		for(TripOption tripsOpt : qpxres.getTrips().getTripOption()) {
			
			out.println("<h3>Escala " + numEscala++ + "</h3>");
			for(br.usp.mytrips.rs.qpx.entities.Slice slice : tripsOpt.getSlice()) {
				
				out.println("Duração: " + slice.getDuration());
				out.println("<table><tr><td>Origem</td><td>Destino</td></tr>");
				for(Segment segment : slice.getSegment()) {
					for(Leg leg : segment.getLeg()) {
						out.println("<tr><td>");
						out.println(leg.getOrigin());
						out.println("</td><td>");
						out.println(leg.getDestination());
						out.println("</td></tr>");
						
					}
				}
				out.println("</table><br />");

			}
		}
		out.println("<br/");
		
	%>
	<%
		
	}
	%>
</body>
</html>
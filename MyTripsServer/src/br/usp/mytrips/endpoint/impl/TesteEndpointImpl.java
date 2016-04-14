package br.usp.mytrips.endpoint.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.usp.mytrips.endpoint.TesteEndpoint;

@WebService(endpointInterface = "br.usp.mytrips.endpoint.TesteEndpoint")
public class TesteEndpointImpl implements TesteEndpoint {

	public TesteEndpointImpl() {
		
	}
	
	@WebMethod
	public String testeString() {
		return "Olá Mundo!";
	}
}

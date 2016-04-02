package br.usp.mytrips.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TesteEndpoint {

	public TesteEndpoint() {
		
	}
	
	@WebMethod
	public String testeString() {
		return "Olá Mundo!";
	}
}

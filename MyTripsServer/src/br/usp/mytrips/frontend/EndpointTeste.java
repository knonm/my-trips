package br.usp.mytrips.frontend;

import javax.ejb.EJB;

import br.usp.mytrips.beans.LocadoraCarro;

public class EndpointTeste {

	@EJB
	private LocadoraCarro lc;
	
	public String getNomeLocadora() {
		return lc.getCarro("Brasil");
	}
}

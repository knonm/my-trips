package br.usp.mytrips.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.BuscaPacote;
import br.usp.mytrips.rs.qpx.entities.QPXResponse;
import br.usp.mytrips.rs.qpx.request.QPXRequest;

@Stateless
public class BuscaPacoteFacade {

	@EJB
	private BuscaPacote buscaPacoteBean;
	
	public QPXResponse buscaPacote(QPXRequest qpxreq) {
		return buscaPacoteBean.buscaPacote(qpxreq);
	}

}

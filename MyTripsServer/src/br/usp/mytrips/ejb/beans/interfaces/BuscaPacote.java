package br.usp.mytrips.ejb.beans.interfaces;

import javax.ejb.Local;

import br.usp.mytrips.rs.qpx.entities.QPXResponse;
import br.usp.mytrips.rs.qpx.request.QPXRequest;

@Local
public interface BuscaPacote {

	public QPXResponse buscaPacote(QPXRequest qpxreq);
}

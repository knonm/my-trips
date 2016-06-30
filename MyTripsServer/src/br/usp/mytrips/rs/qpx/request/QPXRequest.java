package br.usp.mytrips.rs.qpx.request;

import javax.ejb.Stateless;

@Stateless
public class QPXRequest {

	private Request request;

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	
}

package br.usp.mytrips.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.GeoIP;

@Stateless
public class GeoIPFacade {

	@EJB
	private GeoIP geoIPBean;
	
	public String getCountryByIP(String ip) {
		return geoIPBean.getCountryByIP(ip);
	}
}

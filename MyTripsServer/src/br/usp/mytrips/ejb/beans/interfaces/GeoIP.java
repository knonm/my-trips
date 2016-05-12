package br.usp.mytrips.ejb.beans.interfaces;

import javax.ejb.Local;

@Local
public interface GeoIP {

	public String getCountryByIP(String ip);
}

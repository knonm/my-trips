package br.usp.mytrips.ejb.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.GeoIP;
import br.usp.mytrips.ws.geoip.GeoIPService;
import br.usp.mytrips.ws.geoip.GeoIPServiceSoap;

@Stateless
@LocalBean
public class GeoIPBean implements GeoIP {

	public String getCountryByIP(String ip) {
		String countryName = "No country for a old man.";
		GeoIPService geoIPService = new GeoIPService();
		GeoIPServiceSoap geoIPSoap = geoIPService.getGeoIPServiceSoap();
		br.usp.mytrips.ws.geoip.GeoIP geoIP = geoIPSoap.getGeoIP(ip);
		countryName = geoIP.getCountryName();
		return countryName;
	}
}

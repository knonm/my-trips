package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class Data {

	private String kind = "qpxexpress#data";
	private Airport[] airport;
	private City[] city;
	private Aircraft[] aircraft;
	private Tax[] tax;
	private Carrier[] carrier;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Airport[] getAirport() {
		return airport;
	}
	public void setAirport(Airport[] airport) {
		this.airport = airport;
	}
	public City[] getCity() {
		return city;
	}
	public void setCity(City[] city) {
		this.city = city;
	}
	public Aircraft[] getAircraft() {
		return aircraft;
	}
	public void setAircraft(Aircraft[] aircraft) {
		this.aircraft = aircraft;
	}
	public Tax[] getTax() {
		return tax;
	}
	public void setTax(Tax[] tax) {
		this.tax = tax;
	}
	public Carrier[] getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier[] carrier) {
		this.carrier = carrier;
	}
	
}

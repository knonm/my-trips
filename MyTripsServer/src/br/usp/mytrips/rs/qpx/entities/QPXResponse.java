package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class QPXResponse {

	private String kind = "qpxExpress#tripsSearch";
	private Trips trips;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Trips getTrips() {
		return trips;
	}
	public void setTrips(Trips trips) {
		this.trips = trips;
	}
	
	
}

package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class Fare {

	private String kind = "qpxexpress#fareInfo";
	private String id;
	private String carrier;
	private String origin;
	private String destination;
	private String basisCode;
	private Boolean privato;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBasisCode() {
		return basisCode;
	}
	public void setBasisCode(String basisCode) {
		this.basisCode = basisCode;
	}
	public Boolean getPrivato() {
		return privato;
	}
	public void setPrivato(Boolean privato) {
		this.privato = privato;
	}
	
}

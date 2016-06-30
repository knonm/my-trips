package br.usp.mytrips.rs.qpx.request;

import javax.ejb.Stateless;

@Stateless
public class Slice {

	private String kind = "qpxexpress#sliceInput";
	private String origin;
	private String destination;
	private String date;
	private int maxStops;
	private int maxConnectionDuration;
	private String preferredCabin;
	private PermittedDepartureTime permittedDepartureTime;
	private String[] permittedCarrier;
	private String alliance;
	private String[] prohibitedCarrier;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMaxStops() {
		return maxStops;
	}
	public void setMaxStops(int maxStops) {
		this.maxStops = maxStops;
	}
	public int getMaxConnectionDuration() {
		return maxConnectionDuration;
	}
	public void setMaxConnectionDuration(int maxConnectionDuration) {
		this.maxConnectionDuration = maxConnectionDuration;
	}
	public String getPreferredCabin() {
		return preferredCabin;
	}
	public void setPreferredCabin(String preferredCabin) {
		this.preferredCabin = preferredCabin;
	}
	public PermittedDepartureTime getPermittedDepartureTime() {
		return permittedDepartureTime;
	}
	public void setPermittedDepartureTime(PermittedDepartureTime permittedDepartureTime) {
		this.permittedDepartureTime = permittedDepartureTime;
	}
	public String[] getPermittedCarrier() {
		return permittedCarrier;
	}
	public void setPermittedCarrier(String[] permittedCarrier) {
		this.permittedCarrier = permittedCarrier;
	}
	public String getAlliance() {
		return alliance;
	}
	public void setAlliance(String alliance) {
		this.alliance = alliance;
	}
	public String[] getProhibitedCarrier() {
		return prohibitedCarrier;
	}
	public void setProhibitedCarrier(String[] prohibitedCarrier) {
		this.prohibitedCarrier = prohibitedCarrier;
	}
	
	
}

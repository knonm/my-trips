package br.usp.mytrips.rs.qpx.request;

import javax.ejb.Stateless;

@Stateless
public class Slice {

	private String kind = "qpxexpress#sliceInput";
	private String origin = null;
	private String destination = null;
	private String date = null;
	private Integer maxStops = null;
	private Integer maxConnectionDuration = null;
	private String preferredCabin = null;
	private PermittedDepartureTime permittedDepartureTime = null;
	private String[] permittedCarrier = null;
	private String alliance = null;
	private String[] prohibitedCarrier = null;
	
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
	public Integer getMaxStops() {
		return maxStops;
	}
	public void setMaxStops(Integer maxStops) {
		this.maxStops = maxStops;
	}
	public Integer getMaxConnectionDuration() {
		return maxConnectionDuration;
	}
	public void setMaxConnectionDuration(Integer maxConnectionDuration) {
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

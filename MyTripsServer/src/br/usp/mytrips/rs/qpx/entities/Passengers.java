package br.usp.mytrips.rs.qpx.entities;

public class Passengers {

	private String kind = "qpxexpress#passengerCounts";
	private Integer adultCount;
	private Integer childCount;
	private Integer infantInLapCount;
	private Integer infantInSeatCount;
	private Integer seniorCount;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Integer getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}
	public Integer getChildCount() {
		return childCount;
	}
	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}
	public Integer getInfantInLapCount() {
		return infantInLapCount;
	}
	public void setInfantInLapCount(Integer infantInLapCount) {
		this.infantInLapCount = infantInLapCount;
	}
	public Integer getInfantInSeatCount() {
		return infantInSeatCount;
	}
	public void setInfantInSeatCount(Integer infantInSeatCount) {
		this.infantInSeatCount = infantInSeatCount;
	}
	public Integer getSeniorCount() {
		return seniorCount;
	}
	public void setSeniorCount(Integer seniorCount) {
		this.seniorCount = seniorCount;
	}
	
}

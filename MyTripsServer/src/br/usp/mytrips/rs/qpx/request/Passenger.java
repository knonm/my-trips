package br.usp.mytrips.rs.qpx.request;

public class Passenger {

	private String kind = "qpxexpress#passengerCounts";
	private int adultCount;
	private int childCount;
	private int infantInLapCount;
	private int infantInSeatCount;
	private int seniorCount;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	public int getInfantInLapCount() {
		return infantInLapCount;
	}
	public void setInfantInLapCount(int infantInLapCount) {
		this.infantInLapCount = infantInLapCount;
	}
	public int getInfantInSeatCount() {
		return infantInSeatCount;
	}
	public void setInfantInSeatCount(int infantInSeatCount) {
		this.infantInSeatCount = infantInSeatCount;
	}
	public int getSeniorCount() {
		return seniorCount;
	}
	public void setSeniorCount(int seniorCount) {
		this.seniorCount = seniorCount;
	}
}

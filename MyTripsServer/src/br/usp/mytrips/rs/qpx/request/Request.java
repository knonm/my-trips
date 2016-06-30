package br.usp.mytrips.rs.qpx.request;

import javax.ejb.Stateless;

@Stateless
public class Request {

	private Passenger passengers;
	private Slice[] slice;
	private String maxPrice;
	private String saleCountry;
	private boolean refundable;
	private int solutions;
	
	public Passenger getPassengers() {
		return passengers;
	}
	public void setPassengers(Passenger passengers) {
		this.passengers = passengers;
	}
	public Slice[] getSlice() {
		return slice;
	}
	public void setSlice(Slice[] slice) {
		this.slice = slice;
	}
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getSaleCountry() {
		return saleCountry;
	}
	public void setSaleCountry(String saleCountry) {
		this.saleCountry = saleCountry;
	}
	public boolean isRefundable() {
		return refundable;
	}
	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}
	public int getSolutions() {
		return solutions;
	}
	public void setSolutions(int solutions) {
		this.solutions = solutions;
	}
}

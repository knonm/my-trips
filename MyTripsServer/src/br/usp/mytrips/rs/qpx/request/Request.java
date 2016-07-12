package br.usp.mytrips.rs.qpx.request;

import javax.ejb.Stateless;

@Stateless
public class Request {

	private Passenger passengers;
	private Slice[] slice = null;
	private String maxPrice = null;
	private String saleCountry = null;
	private Boolean refundable = null;
	private Integer solutions = null;
	
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
	public Boolean getRefundable() {
		return refundable;
	}
	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}
	public Integer getSolutions() {
		return solutions;
	}
	public void setSolutions(Integer solutions) {
		this.solutions = solutions;
	}
	
}

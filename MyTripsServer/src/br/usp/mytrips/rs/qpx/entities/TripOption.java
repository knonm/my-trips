package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class TripOption {

	private String kind = "qpxexpress#tripOption";
	private String saleTotal;
	private String id;
	private Slice[] slice;
	private Pricing[] pricing;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSaleTotal() {
		return saleTotal;
	}
	public void setSaleTotal(String saleTotal) {
		this.saleTotal = saleTotal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Slice[] getSlice() {
		return slice;
	}
	public void setSlice(Slice[] slice) {
		this.slice = slice;
	}
	public Pricing[] getPricing() {
		return pricing;
	}
	public void setPricing(Pricing[] pricing) {
		this.pricing = pricing;
	}
	
}

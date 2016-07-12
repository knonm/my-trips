package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class Pricing {

	private String kind = "qpxexpress#pricingInfo";
	private Fare[] fare;
	private SegmentPricing[] segmentPricing;
	private String baseFareTotal;
	private String saleFareTotal;
	private String saleTaxTotal;
	private String saleTotal;
	private Passengers passengers;
	private TaxPricing[] tax;
	private String fareCalculation;
	private String latestTicketingTime;
	private String ptc;
	private Boolean refundable;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Fare[] getFare() {
		return fare;
	}
	public void setFare(Fare[] fare) {
		this.fare = fare;
	}
	public SegmentPricing[] getSegmentPricing() {
		return segmentPricing;
	}
	public void setSegmentPricing(SegmentPricing[] segmentPricing) {
		this.segmentPricing = segmentPricing;
	}
	public String getBaseFareTotal() {
		return baseFareTotal;
	}
	public void setBaseFareTotal(String baseFareTotal) {
		this.baseFareTotal = baseFareTotal;
	}
	public String getSaleFareTotal() {
		return saleFareTotal;
	}
	public void setSaleFareTotal(String saleFareTotal) {
		this.saleFareTotal = saleFareTotal;
	}
	public String getSaleTaxTotal() {
		return saleTaxTotal;
	}
	public void setSaleTaxTotal(String saleTaxTotal) {
		this.saleTaxTotal = saleTaxTotal;
	}
	public String getSaleTotal() {
		return saleTotal;
	}
	public void setSaleTotal(String saleTotal) {
		this.saleTotal = saleTotal;
	}
	public Passengers getPassengers() {
		return passengers;
	}
	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}
	public TaxPricing[] getTax() {
		return tax;
	}
	public void setTax(TaxPricing[] tax) {
		this.tax = tax;
	}
	public String getFareCalculation() {
		return fareCalculation;
	}
	public void setFareCalculation(String fareCalculation) {
		this.fareCalculation = fareCalculation;
	}
	public String getLatestTicketingTime() {
		return latestTicketingTime;
	}
	public void setLatestTicketingTime(String latestTicketingTime) {
		this.latestTicketingTime = latestTicketingTime;
	}
	public String getPtc() {
		return ptc;
	}
	public void setPtc(String ptc) {
		this.ptc = ptc;
	}
	public Boolean getRefundable() {
		return refundable;
	}
	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}
	
}

package br.usp.mytrips.rs.qpx.entities;

public class Trips {

	private String kind = "qpxexpress#tripOptions";
	private String requestId;
	private Data data;
	private TripOption[] tripOption;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public TripOption[] getTripOption() {
		return tripOption;
	}
	public void setTripOption(TripOption[] tripOption) {
		this.tripOption = tripOption;
	}
	
}

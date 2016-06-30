package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class TripOption {

	private String kind = "qpxexpress#tripOption";
	private String saleTotal;
	private String id;
	private Slice[] slice;
	private Object[] tripOption;
}

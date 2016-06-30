package br.usp.mytrips.rs.qpx.entities;

import javax.ejb.Stateless;

@Stateless
public class Fare {

	private String kind = "qpxexpress#fareInfo";
	private String id;
	private String carrier;
	private String origin;
	private String destination;
	private String basisCode;
	private boolean privato;
	
	
}

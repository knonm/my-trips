package br.usp.mytrips.beans;

import javax.ejb.Local;

@Local
public interface LocadoraCarro {

	public String getCarro(String pais);
}

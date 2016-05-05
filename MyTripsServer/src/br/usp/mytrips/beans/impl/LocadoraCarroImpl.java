package br.usp.mytrips.beans.impl;

import javax.ejb.Local;
import javax.ejb.Stateful;

import br.usp.mytrips.beans.LocadoraCarro;

@Local
@Stateful
public class LocadoraCarroImpl implements LocadoraCarro {

	public String getCarro(String pais) {
		return pais + " carro";
	}
	
	public LocadoraCarroImpl() {
		
	}
}

package br.usp.mytrips.ejb.beans.interfaces;

import javax.ejb.Local;

@Local
public interface Login {

	public boolean validaUsuario(String email, String senha);
}

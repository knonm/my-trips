package br.usp.mytrips.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.Login;

@Stateless
public class LoginFacade {

	@EJB
	private Login loginBean;
	
	public boolean validaUsuario(String email, String senha) {
		return loginBean.validaUsuario(email, senha);
	}
	
	public void logoff() {
		loginBean.logoff();
	}
}

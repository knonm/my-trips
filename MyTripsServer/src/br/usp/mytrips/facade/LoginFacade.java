package br.usp.mytrips.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.LoginBean;

@Stateless
public class LoginFacade {

	@EJB
	private LoginBean loginBean;
	
	public boolean validaUsuario(String email, String senha) {
		return loginBean.validaUsuario(email, senha);
	}
}

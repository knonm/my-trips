package br.usp.mytrips.ejb.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import br.usp.mytrips.ejb.beans.interfaces.Login;
import br.usp.mytrips.jpa.dao.UsuarioDAO;
import br.usp.mytrips.jpa.entities.Usuario;

@Stateful
@LocalBean
public class LoginBean implements Login {
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	private boolean validaUsuario = false;
	
	public boolean validaUsuario(String email, String senha) {
		if(!validaUsuario) {
			if (email != null && senha != null && email.length() > 0 && senha.length() > 0) {
				List<Usuario> usuarioList = this.usuarioDAO.validaUsuario(email, senha);
				this.validaUsuario = !usuarioList.isEmpty();
			}
		}
		return validaUsuario;
	}
	
	@Remove
	public void logoff() {
		validaUsuario = false;
	}
}

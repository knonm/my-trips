package br.usp.mytrips.ejb.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.Login;
import br.usp.mytrips.jpa.dao.UsuarioDAO;
import br.usp.mytrips.jpa.entities.Usuario;

@Stateless
@LocalBean
public class LoginBean implements Login {
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	public boolean validaUsuario(String email, String senha) {
		List<Usuario> usuarioList = this.usuarioDAO.validaUsuario(email, senha);
		return !usuarioList.isEmpty();
	}
}

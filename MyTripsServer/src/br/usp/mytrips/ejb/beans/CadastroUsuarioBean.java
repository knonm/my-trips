package br.usp.mytrips.ejb.beans;

import java.util.Calendar;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.CadastroUsuario;
import br.usp.mytrips.jpa.dao.UsuarioDAO;
import br.usp.mytrips.jpa.entities.Usuario;

@Stateless
@LocalBean
public class CadastroUsuarioBean implements CadastroUsuario {

	@EJB
	private UsuarioDAO usuarioDAO;
	
	public boolean cadastrarUsuario(String email, String senha,
			String nome, String sobrenome, String cpf,
			Calendar dtNasc) {
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setSenha(senha);
		usuario.setNome(nome);
		usuario.setSobrenome(sobrenome);
		usuario.setCpf(cpf);
		usuario.setDtNasc(dtNasc);
		
		usuarioDAO.create(usuario);
		return true;
	}
}

package br.usp.mytrips.facade;

import java.util.Calendar;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.usp.mytrips.ejb.beans.interfaces.CadastroUsuario;

@Stateless
public class CadastroUsuarioFacade {

	@EJB
	private CadastroUsuario cadastroUsuario;
	
	public void cadastrarUsuario(String email, String senha,
			String nome, String sobrenome, String cpf,
			Calendar dtNasc) {
		cadastroUsuario.cadastrarUsuario(email, senha, nome, sobrenome, cpf, dtNasc);
	}
}

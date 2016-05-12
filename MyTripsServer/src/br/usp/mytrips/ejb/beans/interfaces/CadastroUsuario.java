package br.usp.mytrips.ejb.beans.interfaces;

import java.util.Calendar;

import javax.ejb.Local;

@Local
public interface CadastroUsuario {

	public boolean cadastrarUsuario(String email, String senha,
			String nome, String sobrenome, String cpf,
			Calendar dtNasc);
}

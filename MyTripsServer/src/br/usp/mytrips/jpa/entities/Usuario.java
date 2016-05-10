package br.usp.mytrips.jpa.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuario", schema="public")
public class Usuario {
	
	@Id
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="senha", nullable=false)
	private String senha;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="sobrenome", nullable=false)
	private String sobrenome;
	
	@Column(name="cpf", nullable=false, unique=true)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nasc")
	private Calendar dtNasc;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Calendar dtNasc) {
		this.dtNasc = dtNasc;
	}
}

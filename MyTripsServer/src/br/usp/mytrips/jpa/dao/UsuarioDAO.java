package br.usp.mytrips.jpa.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import br.usp.mytrips.jpa.entities.Usuario;

@Stateless
@LocalBean
public class UsuarioDAO extends GenericDAO<Usuario, String> {

	public List<Usuario> validaUsuario(String email, String senha) throws NoResultException {
		super.abrir();
		
		CriteriaBuilder cb = super.entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
		Root<Usuario> us = cq.from(Usuario.class);
		
		ParameterExpression<String> pEmail = cb.parameter(String.class, "email");
		ParameterExpression<String> pSenha = cb.parameter(String.class, "senha");
		
		cq.select(us).
			where(cb.and(
					cb.equal(us.get("email"), pEmail), 
					cb.equal(us.get("senha"), pSenha)));
		
		TypedQuery<Usuario> tq = super.entityManager.createQuery(cq);
		tq.setParameter(pEmail, email);
		tq.setParameter(pSenha, senha);
		
		List<Usuario> usuarioLogin = tq.getResultList();
		
		super.fechar();
		
		return usuarioLogin;
	}
}

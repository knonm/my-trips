package br.usp.mytrips.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Local
public class GenericDAO<T, K> {

	protected EntityManager entityManager;

	public void abrir() {
		
		this.entityManager = EMF.get().createEntityManager();
		
	}
	
	public void fechar() {
		
		this.entityManager.close();
		
	}
	
	public void create(T obj){

		List<T> listObj = new ArrayList<T>();
		listObj.add(obj);
		create(listObj);
		
	}
	
	public void create(List<T> listObj){

		abrir();
		
		this.entityManager.getTransaction().begin();

		for (T obj : listObj) {
			this.entityManager.persist(obj);
		}
		
		try {
			this.entityManager.getTransaction().commit();
			fechar();
		} catch (Exception ex) {
			fechar();
			update(listObj);
		}
		
	}

	public void delete(T obj) {

		List<T> listObj = new ArrayList<T>();
		listObj.add(obj);
		delete(listObj);
		
	}
	
	public void delete(List<T> listObj) {

		abrir();
		
		this.entityManager.getTransaction().begin();

		Object o;
		
		for (T obj : listObj) {
			o = this.entityManager.merge(obj);
	
			this.entityManager.remove(o);
		}
		
		this.entityManager.getTransaction().commit();

		fechar();
		
	}

	public void update(T obj) {

		List<T> listObj = new ArrayList<T>();
		listObj.add(obj);
		update(listObj);
		
	}
	
	public void update(List<T> listObj) {

		abrir();
		
		this.entityManager.getTransaction().begin();

		for (T obj : listObj) {
			this.entityManager.merge(obj);
		}

		this.entityManager.getTransaction().commit();

		fechar();
		
	}

	public T select(Class<T> cl, K pk) {

		abrir();

		T resposta = (T) this.entityManager.find(cl, pk);

		fechar();

		return resposta;
		
	}

	public List<T> selectAll(Class<T> cl) {

		abrir();

		Query query = this.entityManager.createQuery("SELECT t FROM " + cl.getSimpleName() + " t");

		@SuppressWarnings("unchecked")
		List<T> resposta = query.getResultList();

		fechar();

		return resposta;
		
	}
}

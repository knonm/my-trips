package br.usp.mytrips.jpa.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

	private static final EntityManagerFactory entityManagerFactory = 
			Persistence.createEntityManagerFactory("mytripsjpa");

	public static EntityManagerFactory get() {
		return entityManagerFactory;
	}
}

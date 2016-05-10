package br.usp.mytrips.ejb.factory;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBFactory {

	public static <T> T getBean(Class<T> cl, String beanName) throws NamingException {
		Properties p = new Properties();
		p.put("java.naming.factory.initial", "org.apache.openejb.client.LocalInitialContextFactory");

		InitialContext ctx = new InitialContext(p);

		@SuppressWarnings("unchecked")
		T lookup = (T) ctx.lookup("java:global/MyTripServer/" + beanName);
		return lookup;
	}
}

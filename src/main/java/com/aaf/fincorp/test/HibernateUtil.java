/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaf.fincorp.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author VIC
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// load from different directory
			SessionFactory sessionFactory = new Configuration().configure(
					"hibernate.cfg.xml")
					.buildSessionFactory();

			return sessionFactory;

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}

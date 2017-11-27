package com.appstek.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_App {
	public static SessionFactory factory;
   /**
 * @param args
 */
public static void main(String[] args) {
	   Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println(cfg);
		factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println(session);
}
}

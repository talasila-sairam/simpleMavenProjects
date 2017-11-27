package com.appstek.ConnectionProvider;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Utility 
{
   public static SessionFactory factory;
   public Session getSession()
   {
	    Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println(cfg);
		factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	    return session;
   } 
}

package com.javat;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	 private static SessionFactory sessionFactory;
	    private static ServiceRegistry serviceRegistry;
	    private HibernateUtil(){ 
	    }
	    static
	       {
	        try{    
	         Configuration configuration = new Configuration();
	         configuration.configure();
	         serviceRegistry = new StandardServiceRegistryBuilder()
	                .applySettings(configuration.getProperties())
	                .getBootstrapServiceRegistry();
	         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        }
	        catch(HibernateException e)
	        {
	            e.printStackTrace();    
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}

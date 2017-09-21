package com.javat;

import org.hibernate.*;  
import org.hibernate.cfg.*;

import com.fasterxml.classmate.AnnotationConfiguration;  

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		System.out.println(s);
		Transaction tr=s.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setFirstname("sonoo");
		e1.setLastName("jaiswal");

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstname("vimal");
		e2.setLastName("jaiswal");

		s.persist(e1);
		s.persist(e2);

		tr.commit();
		s.close();
		System.out.println("successfully saved");
	}

}

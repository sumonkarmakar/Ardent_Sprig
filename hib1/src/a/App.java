package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		System.out.println(s);
		Transaction tr=s.beginTransaction();
		System.out.println(tr);
		Student ss=new Student();
		ss.setId(101);
		ss.setName("Sumon");
		s.save(ss);
		tr.commit();
		
		s.close();
		System.out.println("done.....");

	}

}

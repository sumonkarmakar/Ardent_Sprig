package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String args[]){
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		System.out.println(s);
		Transaction tr=s.beginTransaction();
		System.out.println(tr);
		Teacher ss=new Teacher();
		ss.setId(100);
		ss.setName("Sumon");
		s.save(ss);
		tr.commit();
		
		s.close();
		System.out.println("done.....");
	}
}

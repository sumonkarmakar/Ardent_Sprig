package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		System.out.println(s);
		Transaction tr = s.beginTransaction();
		Address a = new Address();
		a.setCity("Kolkata");

		Emp e1 = new Emp();
		e1.setName("Chandan");
		e1.setA(a);
		s.save(e1);
		tr.commit();
		s.close();

	}

}

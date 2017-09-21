package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class bidirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println(sf);
		Session s = sf.openSession();
		System.out.println(s);
		Transaction tr = s.beginTransaction();

		Cricketer c1 = new Cricketer();
		c1.setName("a");
		c1.setPattern("oneday");
		s.save(c1);
		Footballer f1 = new Footballer();
		f1.setClub("dd");
		f1.setName("g");
		s.save(f1);

		tr.commit();
		s.close();
	}

}

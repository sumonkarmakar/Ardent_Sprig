package com.javat;

import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
 

public class HibernateManyToOne {
	public void saveManyToOneHibernateMapping(StudentCourse student)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateManyToOne sh = new HibernateManyToOne();
        
        StudentCourse sc = new StudentCourse();
        sc.setCourse_name("Computer Science");
        sc.setCourse_duration(4);
         
        Student student1 = new Student();
        student1.setStudent_roll_no("BT2013091301");
         
        Student student2 = new Student();
        student2.setStudent_roll_no("BT2013091302");
         
        Student student3 = new Student();
        student3.setStudent_roll_no("BT2013091303");
                 
        Set<Student> set = new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        sc.setStudent(set);
        sh.saveManyToOneHibernateMapping(sc);
	}

}

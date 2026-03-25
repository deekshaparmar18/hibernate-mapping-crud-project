package com.states;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibdemo.com.hyv.Certificate;
import hibdemo.com.hyv.Student;

public class StateDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student s=new Student();
		s.setCity("ABC");
		s.setId(133);
		s.setName("peter");
		s.setCerti(new Certificate("java hibernate","2 march"));
		//transient
		Session se=factory.openSession();
		Transaction tx=se.beginTransaction();
		se.save(s);//persistent
		s.setName("john");
		tx.commit();
		se.close();//detached
		
		
		
		factory.close();

	}

}

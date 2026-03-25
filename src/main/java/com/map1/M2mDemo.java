package com.map1;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class M2mDemo {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Emp e1=new Emp();
	Emp e2=new Emp();
	e1.setEid(110);
	e1.setName("deeksha");
	e2.setEid(111);
	e2.setName("ankur");
	Project p1=new Project();
	Project p2=new Project();
	p1.setPid(101);
	p2.setName("Library management System");
	p2.setPid(102);
	p2.setName("CHATBOT");
	List<Emp> l=new ArrayList<Emp>();
	List<Project> l2=new ArrayList<Project>();
	l.add(e1);
	l.add(e2);
	l2.add(p1);
	l2.add(p2);
	e1.setProjects(l2);
	p2.setEmps(l);
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	s.save(e1);
	s.save(e2);
	s.save(p1);
	s.save(p2);
	tx.commit();
	s.close();
	factory.close();
	
	

	}

}

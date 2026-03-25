package com.hql;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.map.Answer;

import hibdemo.com.hyv.Student;


public class HQLDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		/*String query="from Answer";
		@SuppressWarnings("deprecation")
		Query q=s.createQuery(query);
		List<Answer> l=q.list();
		for(Answer se:l) {
			System.out.println(se.getAnswer());
		}*/
		/*String query="from Answer where ansid=344";
		Query q=s.createQuery(query);
		List<Answer> l=q.list();
		for(Answer se:l) {
			System.out.println(se.getAnswer());
		}*/
		
		/* String query="from Answer as a where a.ansid=:x ";
		 Query q=s.createQuery(query);
		 q.setParameter("x", 343);
		 List<Answer> l=q.list();
		 for(Answer se:l) {
			 System.out.println(se.getAnswer());
		 }*/
		Transaction tx=s.beginTransaction();
		/*String query="delete from Answer  where ansid=343";
		Query q=s.createQuery(query);
		int r=q.executeUpdate();
		System.out.println(r);*/
		String query="select q.qid,q.Question,a.answer,a.ansid from Question as q INNER JOIN q.answer as a";
		Query q=s.createQuery(query);
		List<Object []> l=q.getResultList();
		for(Object[] qe:l) {
			System.out.println(Arrays.toString(qe));
		}
		
		
		
		
		
		 tx.commit();
		 
		
		
		s.close();
		factory.close();
		
		
	}

}

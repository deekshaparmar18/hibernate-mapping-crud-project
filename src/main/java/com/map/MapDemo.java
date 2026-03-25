package com.map;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Question q1=new Question();
         q1.setQid(121);
         q1.setQuestion("what is java?");
         Answer a1=new Answer();
         a1.setAnsid(343);
         
         a1.setAnswer("java is a high level programming langugae");
         a1.setQ(q1);
         Answer a2=new Answer();
         a2.setAnsid(344);
         
         a2.setAnswer("java is robust");
         a2.setQ(q1);
         List<Answer> l=new ArrayList<Answer>();
         l.add(a2);
         l.add(a1);
         q1.setAnswer(l);
         
         Session s= factory.openSession();
         Transaction t=s.beginTransaction();
         s.save(q1);
         s.save(a1);
         s.save(a2);
         
         
         t.commit();
         //fetch 
        Question newq=(Question)s.get(Question.class, 121);
         System.out.println(newq.getQid());
         System.out.println(newq.getQuestion());
         System.out.println(newq.getAnswer().size());
       
         s.close();
         factory.close();
         
         

	}

	

}

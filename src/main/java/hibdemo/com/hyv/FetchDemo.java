package hibdemo.com.hyv;

//import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Address student=(Address)s.get(Address.class, 1);
		System.out.println(student.getCity());
		Address student1=(Address)s.get(Address.class, 1);
		System.out.println(student1.getCity());
		s.close();
		factory.close();
		
		

	}

}

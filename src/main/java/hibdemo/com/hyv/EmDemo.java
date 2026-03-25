package hibdemo.com.hyv;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Student st1=new Student();
		st1.setCity("lucknow");
		st1.setId(145);
		st1.setName("ankur");
		Certificate cf1=new Certificate();
		cf1.setCourse("java");
		cf1.setDuration("3 months");
		st1.setCerti(cf1);
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(st1);
		tx.commit();
		s.close();
		sf.close();

	}

}

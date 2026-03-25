package hibdemo.com.hyv;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

//import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )throws IOException
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Student st=new Student();
        st.setCity("agra");
        st.setId(1);
        st.setName("deeksha");
        Student st2=new Student();
        st2.setCity("Delhi");
        st2.setId(2);
        st2.setName("ankur");
        Student st3=new Student();
        st3.setCity("alucknow");
        st3.setId(3);
        st3.setName("khushi");
        
        
       // System.out.println(st);
       /* Address ad=new Address();
        ad.setAddedDate(new Date());
        ad.setCity("Delhi");
        ad.setStreet("Street1");
        ad.setOpen(true);
        ad.setX(56.78);
       /* FileInputStream fis=new FileInputStream("src/main/java/WhatsApp Image 2025-11-15 at 12.57.30_ec466031.jpg");
        byte[] data=new byte[fis.available()] ;
        fis.read(data);
        ad.setImage(data);*/
        Session s= factory.openSession();
        Transaction tx=s.beginTransaction();
        
        
       /* Query query= s.createQuery("from Student");
        query.setFirstResult(0);
        query.setMaxResults(3);
        List<Student> l=query.list();
        for(Student se:l) {
        	System.out.println(se.getCity());
        	
        }*/
        
        Query query= s.createQuery("from Student");
        query.setFirstResult(0);
        query.setMaxResults(3);
        List<Student> l=query.list();
        for(Student se:l) {
        	System.out.println(se.getCity());
        	
        }
        s.save(st);s.save(st2);s.save(st3);
        tx.commit();
       // s.save(ad);
        
        s.close();
        
        
    }
}

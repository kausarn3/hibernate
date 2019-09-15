package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class A {
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		StudentDetails sd1 = new StudentDetails();
		sd.setId(100);
		sd.setName("kausar");
		
		sd1.setId(101);
		sd1.setName("nazir");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(sd);
		session.save(sd1);
		session.getTransaction().commit();;
		session.close();
		

}
}
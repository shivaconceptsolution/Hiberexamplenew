package scs;
import org.hibernate.cfg.*;
import org.hibernate.*;
public class StudentInsert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student stu = new Student();
		stu.setRno(1002);
		stu.setSname("XYZ");
		s.save(stu);
		tx.commit();
		s.close();
		

	}

}

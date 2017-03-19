package com.ibs.hibernate;



import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Student student = new Student();
		student.setName("Prasad");
		student.setRoll("A-6931");
		student.setPhone("969203750");
		student.setDegree("B.Tech");

		Transaction tx = session.beginTransaction();
		session.save(student);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}

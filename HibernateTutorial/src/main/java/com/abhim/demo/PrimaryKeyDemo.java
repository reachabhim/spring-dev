package com.abhim.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhim.demo.model.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			//crate 3 student object
			Student tempStudent1 = new Student("Abhishek", "Mondal", "am@mail.com");
			Student tempStudent2 = new Student("Sonali", "Mondal", "sm@mail.com");
			Student tempStudent3 = new Student("Debanjan", "Mondal", "dm@mail.com");
			

			// Begin transaction
			session.beginTransaction();

			// Write to database
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			// Commit the transaction
			session.getTransaction().commit();
		} finally {
			session.close();
		}

	}
}

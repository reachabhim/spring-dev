package com.abhim.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhim.demo.model.Student;

public class HBDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			Student tempStudent = new Student("Abhishek2", "Mondal2", "am2@mail.com");

			// Begin transaction
			session.beginTransaction();

			// Write to database
			session.save(tempStudent);

			// Commit the transaction
			session.getTransaction().commit();
			
			
			// Begin transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			// Write to database
			Student temp = session.get(Student.class, tempStudent.getId());
			System.out.println(temp);

			// Commit the transaction
			session.getTransaction().commit();
		} finally {
			session.close();
		}

	}

}

package com.abhim.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhim.demo.model.Student;

public class HBQueryDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {

			// Begin transaction
			session.beginTransaction();
			
			//Query tables
			List<Student> students = session.createQuery("from Student",Student.class).getResultList();			
			displayStudents(students);
			
			
			//Query student with first name starts with Abhi
			students = session.createQuery("from Student s where s.firstName LIKE 'Abhi%'",Student.class).getResultList();
			displayStudents(students);
			
			

			// Commit the transaction
			session.getTransaction().commit();
			
		} finally {
			session.close();
		}

	}

	private static void displayStudents(List<Student> students) {
		//display the students
		for(Student student:students) {
			System.out.println(student);
		}
	}

}

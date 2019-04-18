package com.abhim.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhim.demo.model.Student;

public class HBUpdateDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {

			// Begin transaction
			session.beginTransaction();
			
			int id=1;
			
			//Query tables
			Student tempStudent = session.get(Student.class, id);
			tempStudent.setFirstName("Abhi");
			
			//save in db
			session.save(tempStudent);
			
			// Commit the transaction
			session.getTransaction().commit();
			
			
			// Begin transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			//Query student with first name starts with Abhi
			List<Student> students = session.createQuery("from Student s where s.firstName LIKE 'Abhi%'",Student.class).getResultList();
			displayStudents(students);
			
			// Commit the transaction
			session.getTransaction().commit();	
			
			
			// Begin transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			//Query student with first name starts with Abhi
			session.createQuery("update Student set email='test@mail.com' where firstName like '%Abhi%'").executeUpdate();
	
			
			// Commit the transaction
			session.getTransaction().commit();	
			
			
			
			// Begin transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
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

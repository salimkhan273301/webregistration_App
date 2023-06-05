package com.student.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.student.dao.HibernateConnection;
import com.student.model.Student;



public class StudentServiceImpl implements  studentservice {

	public void saveStudent(Student st) throws HibernateException, Exception {
		SessionFactory sessionFactory=HibernateConnection.sessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(st);
		txn.commit();
		session.close();
		System.out.println(st);
	}
	
	public void updateStudent(Student st) throws HibernateException, Exception {
		SessionFactory sessionFactory=HibernateConnection.sessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.saveOrUpdate(st);
		txn.commit();
		session.close();
	}
	public  void getStudentById(int id) throws HibernateException, Exception {
		Student student=null;
		SessionFactory sessionFactory=HibernateConnection.sessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		//student=(Student) session.get(Student.class, id);
		student= (Student) session.load(Student.class, id);
		System.out.println(student);
		txn.commit();
		session.close();
		
	}
	
	
	
	  @SuppressWarnings("unchecked")
	  public List<Student> getAllStudent() throws
	  HibernateException, Exception { //Transaction txn=null; 
		  List<Student> student =null; 
		  SessionFactory sessionFactory=HibernateConnection.sessionFactory();
	  Session session=sessionFactory.openSession(); Transaction
	  txn=session.beginTransaction();
	  student=session.createQuery("from Student").list();
	  System.out.println(student);
	  
	  
	  txn.commit(); session.close();
	  
	  return student;
	  
	  }
	 
	public  void deleteStudentById(int id) throws HibernateException, Exception {
		
		SessionFactory sessionFactory=HibernateConnection.sessionFactory();
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		//student=(Student) session.get(Student.class, id);
		session.delete(id);
		
		txn.commit();
		session.close();
		System.out.println("record deleted");
			}

	

	

	
	
}

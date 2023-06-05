package com.student.service;

import java.util.List;

import org.hibernate.HibernateException;

import com.student.model.Student;

public interface studentservice {

	void saveStudent(Student st) throws HibernateException, Exception;

	void updateStudent(Student st) throws HibernateException, Exception;

	void getStudentById(int id) throws HibernateException, Exception;

	List<Student> getAllStudent() throws HibernateException, Exception;

	void deleteStudentById(int id) throws HibernateException, Exception;

}
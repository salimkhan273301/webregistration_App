package com.student.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

import com.student.model.Student;
import com.student.service.StudentServiceImpl;


@WebServlet("/servlet2")
public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
	
		 
		// preparing an instance of Employee
		  StudentServiceImpl ss=new StudentServiceImpl();
		 
		   List<Student> list = null;
		try {
			list = ss.getAllStudent();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  out.print("<h1 style='color:green; text-align:center;'>List of Registered Student...</h1>");
		  out.print(list+"<br>");
		  
		  out.print("<br>");
	}
}

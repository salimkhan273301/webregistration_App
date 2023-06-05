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


@WebServlet("/servlet4")
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();
	          
	String id=request.getParameter("id");
	int i = Integer.parseInt(id);
	
	
	 
	// preparing an instance of Employee
	  StudentServiceImpl ss=new StudentServiceImpl();
	 
	  Student s = null;
	try {
		 ss.getStudentById(i);
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  out.print("<h1 style='color:green; text-align:center;'>Student is found in the List...</h1>");
	  out.print(s);
	  
	  out.print("<br>");
}
}

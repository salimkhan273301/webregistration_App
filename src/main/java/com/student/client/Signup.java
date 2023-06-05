package com.student.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import javax.servlet.annotation.WebServlet;
import com.student.model.Student;
import com.student.service.StudentServiceImpl;


@WebServlet("/servlet1")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;


    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String name=request.getParameter("name");  
		String email=request.getParameter("email");
		String branch=request.getParameter("branch");
		String country=request.getParameter("country");
		String city=request.getParameter("city");  
		String password=request.getParameter("password"); 
		 
		// preparing an instance of Employee
		  StudentServiceImpl ss=new StudentServiceImpl();
		  Student s=new Student();
		  s.setName(name);
		  s.setEmail(email);
		  s.setBranch(branch);
		  s.setCountry(country);
		  s.setCity(city);
		  s.setPassword(password);
		  try {
			ss.saveStudent(s);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  out.print("<h1 style='color:green; text-align:center;'>You are successfully registered...</h1>");
		  out.print(s);
		  //response.sendRedirect("login1.html");
		  out.print("<br>");
	}
}
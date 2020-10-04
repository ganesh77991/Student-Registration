package com.student.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;

@WebServlet("/getData")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentService studentService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		studentService=new StudentService();
		List<Student> sts=studentService.getStudentData();
		
		request.setAttribute("objs", sts);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/hello.jsp");

		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

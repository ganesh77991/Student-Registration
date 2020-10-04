package com.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentService studentService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = new Student();

		/*
		 * System.out.println(request.getParameter("studentId"));
		 * System.out.println(request.getParameter("studentName"));
		 * System.out.println(request.getParameter("branch"));
		 * System.out.println(request.getParameter("course"));
		 * System.out.println(request.getParameter("email"));
		 * System.out.println(request.getParameter("dob"));
		 * System.out.println(request.getParameter("gender"));
		 * System.out.println(request.getParameter("password"));
		 * System.out.println(request.getParameter("address"));
		 */

		student.setId(Integer.parseInt(request.getParameter("studentId")));
		student.setName(request.getParameter("studentName"));
		student.setGender(request.getParameter("gender"));
		student.setCourse(request.getParameter("course"));
		student.setBranch(request.getParameter("branch"));
		student.setDob(request.getParameter("dob"));
		student.setEmail(request.getParameter("email"));
		student.setPassword(request.getParameter("password"));
		student.setAddress(request.getParameter("address"));

		System.out.println(student);

		studentService = new StudentService();

		Integer status = studentService.registerStudent(student);

		if (status == 0) {
			request.setAttribute("msg", "Registration Failled...");
		} else {
			request.setAttribute("msg", "Registration successss...");
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");

		requestDispatcher.forward(request, response);
	}

}

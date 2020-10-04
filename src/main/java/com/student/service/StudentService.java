package com.student.service;

import java.util.List;

import com.student.dao.StudentDao;
import com.student.model.Student;

public class StudentService {
	
	StudentDao studentDao;

	public Integer registerStudent(Student student) {
		
		studentDao=new StudentDao();
		
		return studentDao.registerStudent(student);
		
	}

	public List<Student> getStudentData() {

		studentDao=new StudentDao();
		
		return studentDao.getStudentData();
	}

}

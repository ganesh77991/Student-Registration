package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;
import com.student.utility.ConnectionUtility;

public class StudentDao {

	private static final String Insert_Into_Student = "insert into student values(?,?,?,?,?,?,?,?,?)";

	PreparedStatement preparedStatement;

	public Integer registerStudent(Student student) {

		Connection con = ConnectionUtility.getConnection();
		Integer count = 0;

		System.out.println("Connection is " + con);
		System.out.println("student record inserted....");
		System.out.println(student);

		try {
			preparedStatement = con.prepareStatement(Insert_Into_Student);

			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getGender());
			preparedStatement.setString(4, student.getCourse());
			preparedStatement.setString(5, student.getBranch());
			preparedStatement.setString(6, student.getDob());
			preparedStatement.setString(7, student.getEmail());
			preparedStatement.setString(8, student.getPassword());
			preparedStatement.setString(9, student.getAddress());

			count = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	public List<Student> getStudentData() {

		Connection con = ConnectionUtility.getConnection();

		Statement stmt=null;
		List<Student> sts=null;
		try {
			stmt = con.createStatement();
			boolean status = stmt.execute("select * from student");
			
			if (status) {
				ResultSet results = stmt.getResultSet();
				sts = new ArrayList<Student>();
				while (results.next()) {
					sts.add(new Student(results.getInt(1), results.getString(2), results.getString(3), results.getString(4),
							results.getString(5), results.getString(6), results.getString(7), results.getString(8),
							results.getString(9)));
				}
				System.out.println(sts);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return sts;
	}

}

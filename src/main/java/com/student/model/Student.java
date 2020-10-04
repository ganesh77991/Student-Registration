package com.student.model;

public class Student {
	
	private Integer id;
	private String name;
	private String gender;
	private String course;
	private String branch;
	private String dob;
	private String email;
	private String password;
	private String Address;
	
	
	
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String gender, String course, String branch, String dob, String email,
			String password, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.course = course;
		this.branch = branch;
		this.dob = dob;
		this.email = email;
		this.password = password;
		Address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String adddress) {
		Address = adddress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", course=" + course + ", branch="
				+ branch + ", dob=" + dob + ", email=" + email + ", password=" + password + ", Adddress=" + Address
				+ "]";
	}
	
	
}

package com.mybatis.model.vo;

import java.sql.Date;

public class Student {

	/*
	 * private int student_no; private String student_name; private String
	 * student_tel; private String student_email; private String student_addr;
	 * private Date reg_date;
	 * 
	 * public Student() { // TODO Auto-generated constructor stub }
	 * 
	 * public Student(int student_no, String stduent_name, String student_tel,
	 * String student_email, String student_addr, Date reg_date) { super();
	 * this.student_no = student_no; this.student_name = stduent_name;
	 * this.student_tel = student_tel; this.student_email = student_email;
	 * this.student_addr = student_addr; this.reg_date = reg_date; }
	 * 
	 * public int getStudent_no() { return student_no; }
	 * 
	 * public void setStudent_no(int student_no) { this.student_no = student_no; }
	 * 
	 * public String getStduent_name() { return student_name; }
	 * 
	 * public void setStduent_name(String stduent_name) { this.student_name =
	 * stduent_name; }
	 * 
	 * public String getStudent_tel() { return student_tel; }
	 * 
	 * public void setStudent_tel(String student_tel) { this.student_tel =
	 * student_tel; }
	 * 
	 * public String getStudent_email() { return student_email; }
	 * 
	 * public void setStudent_email(String student_email) { this.student_email =
	 * student_email; }
	 * 
	 * public String getStudent_addr() { return student_addr; }
	 * 
	 * public void setStudent_addr(String student_addr) { this.student_addr =
	 * student_addr; }
	 * 
	 * public Date getReg_date() { return reg_date; }
	 * 
	 * public void setReg_date(Date reg_date) { this.reg_date = reg_date; }
	 * 
	 * @Override public String toString() { return "Student [student_no=" +
	 * student_no + ", stduent_name=" + student_name + ", student_tel=" +
	 * student_tel + ", student_email=" + student_email + ", student_addr=" +
	 * student_addr + ", reg_date=" + reg_date + "]"; }
	 */	
	
	private int studentNo;
	private String studentName;
	private String studentTel;
	private String studentEmail;
	private String studentAddr;
	private Date regDate;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentNo, String studentName, String studentTel, String studentEmail, String studentAddr,
			Date regDate) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentTel = studentTel;
		this.studentEmail = studentEmail;
		this.studentAddr = studentAddr;
		this.regDate = regDate;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTel() {
		return studentTel;
	}

	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentTel=" + studentTel
				+ ", studentEmail=" + studentEmail + ", studentAddr=" + studentAddr + ", regDate=" + regDate + "]";
	}
	
	
	
}

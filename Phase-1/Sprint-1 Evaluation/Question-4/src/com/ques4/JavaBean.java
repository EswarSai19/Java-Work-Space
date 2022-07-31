package com.ques4;

public class JavaBean {
	private int rollNo;
	private String studentName;
	private int marks;
	
//	public JavaBean() {
//		this.rollNo = 1;
//		this.studentName = "Student";
//		this.marks = 0;
//	}
	public JavaBean( String name,int rollnum, int mrks) {
		this.rollNo = rollnum;
		this.studentName = name;
		this.marks = mrks;
	}
	
	
	


	public void setRollNo(int num) {
		this.rollNo = num;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.studentName = name;
	}
	public String getName() {
		return studentName;
	}
	public void setMarks(int mrks) {
		this.marks = mrks;
	}
	public int getMarks() {
		return marks;
	}
	
	
	
}

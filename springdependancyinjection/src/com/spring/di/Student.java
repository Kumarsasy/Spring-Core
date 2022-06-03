package com.spring.di;

public class Student {
	
	private int id;
	private String studentName;
	
	public Student(int id) {
		this.id = id;
	}
		
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

//	Setter Injection
//	public void setId(int id) {
//		this.id = id;
//		System.out.println("Setter method called : setId");
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//		System.out.println("Setter method called : setStudentName");
//	}

	public void displayStudentInfo() {
		System.out.println("Student name is " + studentName + " and the id is " + id);
	}
	
}

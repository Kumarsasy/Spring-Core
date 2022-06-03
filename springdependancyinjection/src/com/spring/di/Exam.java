package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student sasi = context.getBean("student", Student.class);
		sasi.displayStudentInfo();
		
		Student tommy = context.getBean("student1", Student.class);
		tommy.displayStudentInfo();
		
		
		/* Normal constructor call
		 * Student sasi = new Student(1, "Sasikumar"); sasi.displayStudentInfo();
		 */
		
		/* Normal setter method
		 * Student student = new Student(); student.studentName = "Sasikumar";
		 * student.setStudentName("Sasikumar"); student.displayStudentInfo();
		 */
	}
}

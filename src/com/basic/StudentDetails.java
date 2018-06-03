package com.student;

public class StudentDetails {
	public static void main(String[] args) {
		Student studentOne = new Student();
		studentOne.setStudentId(9);
		studentOne.setFirstName("Elakkiya");
		studentOne.setLastName("anu");
	studentOne.setDepartment("CSE");
	studentOne.setGender("female");
		
		System.out.println(studentOne.toString());
	}

}

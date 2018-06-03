package com.student;

public class Student 
{
private int studentId;
private String firstName;
private String lastName;
private String gender;
private String department;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;

}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
	public String toString() {
		
		return  "\n student id is"+studentId +"\nfirstname is" +firstName + "\nlastname is"+lastName +"\ndepartment is"+department+"\ngender is"+gender ;
	}
}

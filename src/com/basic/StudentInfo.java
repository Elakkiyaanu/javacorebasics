package com.basic;

import java.util.Arrays;

public class StudentInfo {
public static void main(String args[])
{
	Student s1 =new Student(1,"stud1",90);
			Student s2 =new Student(1,"stud1",91);
			Student s3 =new Student(1,"stud1",95);
		Student[] s= {s1,s2,s3};
		System.out.pritnln(Arrays.toString(s))
		
}

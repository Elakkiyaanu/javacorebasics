package com.basic;

import java.util.Scanner;

public class SecondLast {
	public static void main(String args[]) {
		 int input1;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the values");
	input1=scan.nextInt();
	
		if(input1 > -9 && input1 < 9)
		{
			System.out.println(input1);
			
		}else if(input1<0)
		{
			input1=-input1;
		}
	
			int b=input1%100;
		int r=b/10;
		System.out.println(r);
	}}


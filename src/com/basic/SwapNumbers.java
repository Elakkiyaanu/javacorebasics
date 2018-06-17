package com.basic;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String args[])
	{
		int b,e,temp;
		System.out.println("Enter the string:");
		Scanner scr=new Scanner(System.in);
		b=scr.nextInt();
		e=scr.nextInt();
		System.out.println("Before Swapping\nz ="+b+"\ny="+e);
		temp=b;
		b=e;
		e=temp;
		System.out.println("After Swapping\ny="+b+"\nz="+e);
		
	}

}


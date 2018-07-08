package com.logical;
import java.util.*;

public class Swapping {
	
	public static void main(String args[])
	{
		//Scanner Scan=new Scanner(System.in);
		 String a = "Hello";
        String b = "World";
         
       System.out.println("String before Swappin a="+a+ "and b=" +b);
       
       
       a= a+b;
       System.out.println(a);
       
       b=a.substring(0,a.length()-b.length());
       System.out.println(b);
       
       a=a.substring(b.length());
       System.out.println(a);
       
       System.out.println("String after swapping a="+a+ "and b=" +b);
       
	}
}
       
package com.basic;

import java.util.Scanner;

public class StringLp1 {
	  public int stringLength,divide;

	    public String[] Substring(String input1) {


	    String firstName="";
	    String middleName="";
	    String lastName="";

	    stringLength=input1.length();

	        if(stringLength%3==0) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide);
	        middleName=input1.substring(divide,(2*divide));
	        lastName=input1.substring((2*divide),(3*divide));

	    }
	       
	        if(stringLength%3==1) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide);
	        middleName=input1.substring(divide,(2*divide)+1);
	        lastName=input1.substring((2*divide)+1,(2*divide)+2);

	    }
	        if(stringLength%3==2) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide+1);
	        middleName=input1.substring(divide+1,(2*divide)+1);
	        lastName=input1.substring((2*divide),(3*divide)+2);

	    }
	        return  new String[]{firstName,middleName,lastName};
	    }
	    public static void main(String[] args) {
	    	Scanner scan=new Scanner(System.in);
	    	StringLp1 si=new StringLp1();
	    	System.out.println("Enter the strings");
	        
	        String s1=scan.nextLine();
	        String s2=scan.nextLine();
	        String s3=scan.nextLine();
	        String a[]=si.Substring(s1);
	        String b[]=si.Substring(s2);
	        String c[]=si.Substring(s3);
	        System.out.println(a[0]+b[1]+c[2]);
	        System.out.println(a[1]+b[2]+c[0]);
	        System.out.println(a[2]+b[0]+c[1]);
	        String ss1=a[2]+b[0]+c[1];
	       System.out.println(ss1);
	       int length=ss1.length();
	       for(int w=0;w<length;w++) {
	    	   char ch=ss1.charAt(w);
	    	   if(Character.isLowerCase(ch)) {
	    		   System.out.print(Character.toUpperCase(ch));
	    	   }
	    	   else
	    	   {
	    		   System.out.println(ch);
	    	   }
	    }
	    }}
	    //public static String toggleString(String Substring) {
	    //	char[] ch = Substring.toCharArray();
	    	//String s="";
	    	//for (int i = 0; i < ch.length; i++) {
	    
	    	//if (Character.isLowerCase(ch[i])) {
			//	s=s+Character.toUpperCase(ch[i]);
			//}
	    	
	    	//}
	    	//return s;
	    
	    //}



package com.logical;

public class ReverseString {

	    public static void main(String[] args)
	    {
	        String input = "Geeks for Geeks";
	 
	        StringBuilder input1 = new StringBuilder();
	 
	        // append a string into StringBuilder input1
	        input1.append(input);
	        System.out.println(input1);
	 
	        // reverse StringBuilder input1
	        input1 = input1.reverse();
	        System.out.println(input1);
	 
	        // print reversed String
	        System.out.println(input1);
	    }
	}


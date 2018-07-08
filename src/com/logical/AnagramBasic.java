package com.logical;

public class AnagramBasic {
	public static void main(String args[]) {
	String s1 = "Hello Ashok";
	System.out.println(s1);
    String word1 = s1.replace("\\s","").toLowerCase(); 
    System.out.println(word1); // Here \\s not working as regex it is considering as some character
    
}
}

package com.basic;

public class Palindrome {
public	String isPalindrome(char str[])
	{
	    // Start from leftmost and rightmost corners of str
	    int l = 0;
	    int h = strlen(str) - 1;
	 
	    // Keep comparing characters while they are same
	    while (h > l)
	    {
	        if (str[l++] != str[h--])
	        {
	            System.out.println("%s is Not Palindrome", str);
	            return;
	        }
	    }
	    System.out.println("%s is palindrome", str);
	}
	 
	// Driver program to test above function
	public static void main(String[] args) { 
		
		 Palindrome p=new  Palindrome();
		 
	
	
	   p.isPalindrome("abba");
	   p.isPalindrome("abbccbba");
	   p.isPalindrome("geeks");
	    
	}
}

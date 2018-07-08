package com.logical;

public class IsPalindromePossible {
	public boolean CheckPalindrome(int number) {
		
		int r=0;
		int rev = 0;
		//int temp=0;
		int numbercopy = number;
		while(number !=0) {
			r = number % 10;
			//System.out.println(r);
			rev =(rev*10) + r;
		//System.out.println(rev);
			number = number / 10;
			//System.out.println(number);
			
		}
		
		
		if( numbercopy == rev) {
		return true;
		}
		else {
			return false;
		
		}
	}
	public static void main(String args[]) {
		IsPalindromePossible s= new IsPalindromePossible();
		boolean result = s.CheckPalindrome(1551);
		System.out.println(result);
	}

}

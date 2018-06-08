package com.basic;

public class ArmstrongNumber {
	public static void main(String args[]) {
	int b,e=0;
	int n=153;
	int temp=n;
		while(n>0) {
			b=n%10;
			e=e+(b*b*b);
			n=n/10;
			}
	if(temp==e)
		
		System.out.println("Armstrong number"+e);
	
		else 
		
			System.out.println(" Not Armstrong number"+e);

	
	}
}

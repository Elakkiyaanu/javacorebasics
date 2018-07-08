package com.logical;
import java.util.Scanner;

public class EncodingArray {
	public void find(int[] input1) {
		int n=input1.length;
		int b[]=new int[n];
		int sum=0;
		b[n-1]=input1[n-1];
		for(int i=0;i<n-1;i++) {
			b[i]=input1[i+1]-input1[i];
		}
		System.out.print("Encoded array={");
		for(int j=0;j<n;j++) {
			
			System.out.print(b[j]);
			if(j<n-1) {
				System.out.print(",");
			}
		}
		
		System.out.print("}");
		
		System.out.println("\nFirst number in original array="+input1[0]);
		for(int k=0;k<n;k++) {
			sum=sum+input1[k];
		}
		System.out.println("Sum of all numbers in original array="+sum);
		
	}
	public static void main(String[] args) {
		EncodingArray e=new EncodingArray();
		Scanner sc=new Scanner(System.in);
		
		String a=sc.nextLine();
		String a1[]=a.split(" ");
		int[] input=new int[a1.length];
		//System.out.println(a1.length);
		for(int i=0;i<a1.length;i++) {
			input[i]=Integer.parseInt(a1[i]);
			
		}
//		for(int j=0;j<a1.length;j++) {
//			System.out.println(input[j]);
//			
//		}
		e.find(input);
	}

}

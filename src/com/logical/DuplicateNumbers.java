package com.logical;

import java.util.Scanner;

public class DuplicateNumbers {
	public static void main(String args[]) {
		int temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array:");
		int n = scan.nextInt();
		System.out.println("enter the element:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=1;i<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					
					a[i]=temp;
					a[j]=a[i];
					
				}
				else
					break;
			}
		}
		System.out.println(temp);
	}

}

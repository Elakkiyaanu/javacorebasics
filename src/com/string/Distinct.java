package com.string;

import java.util.Scanner;

public class Distinct {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the word: ");
		String str = sc.nextLine();
		String str1=str.replaceAll(" ", "");
		char a[]=str1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					if(i!=j)
						count++;
				}
			}
			if(count==0)
			{
				System.out.print(a[i]);
			}
		}
	}
}

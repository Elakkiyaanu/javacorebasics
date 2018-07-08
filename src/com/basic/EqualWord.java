package com.basic;

import java.util.Scanner;

public class EqualWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []s1=s.split(" ");
		int len=s1.length;
		String s3="";
		for(int i=0;i<len;i++) {
			int uc=0;
			int lc=0;
			
			char ch[]=s1[i].toCharArray();
			int len1=ch.length;
			if(len1%2==0) {
				for(int j=0;j<len1;j++) {
					if(Character.isAlphabetic(ch[j])) {
						if(Character.isUpperCase(ch[j])) {
							uc++;
						}
						if(Character.isLowerCase(ch[j])) {
							lc++;
						}
					}
				}
				if(lc==uc) {
					s3=s1[i];
					break;
				}
			}
		}
		System.out.println(s3);
	}

}

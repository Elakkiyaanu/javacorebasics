package com.string;
import java.util.*;
public class DuplicateNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		int count=0;

		for (int i = 0; i < s1.length; i++) {
						for (int j = 0; j < s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					if(i!=j)
						count++;
					
	}
}
			
}
		System.out.println(count);	
	}
}
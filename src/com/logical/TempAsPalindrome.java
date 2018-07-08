package com.logical;

public class TempAsPalindrome {
	public class Ddd {
		
		public static void main(String[] args) {
			
			String input1 = "Template".toLowerCase();
			
			char ch[] = new char[input1.length()];
			char cha[] = new char[input1.length()];
			int[] count = new int[256];
			String s = "";
			String d = "";
			String temp = "";
			
		    for(int i=0;i<input1.length();i++)
			{
				if(input1.charAt(i)!= ' ')
				{
					count[(int)input1.charAt(i)] = count[(int)input1.charAt(i)]+1;
					
				}
			}
			
			for(int i=0;i<input1.length();i++)
			{
				if(count[(int)input1.charAt(i)] == 2)
				{
					ch[i] = input1.charAt(i);
					 
				}
			}
			
			temp = new String(ch);
			int size = temp.length()/2;
			char arr[] = temp.toCharArray();
			
			for(int i=size-1;i>=0;i--)
			{
			s = s+arr[i]+"";
			}
			
			for(int i=size;i<arr.length;i++)
			
			{
				d=d+arr[i]+"";
			
			}
			
		    for(int i=0;i<input1.length();i++)
			{
				if(count[(int)input1.charAt(i)] == 1)
				{
					cha[i] = input1.charAt(i);
					
				}
			}
			
			String model = "";
			model = new String(cha);
			
		    String result = s.trim()+model.charAt(1)+d.trim();
			
			System.out.println(result.length());
			
		}

	}

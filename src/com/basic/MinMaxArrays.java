package com.basic;

public class MinMaxArrays {
	public static void main(String[] args) {
		int array[]=new int[] {10,55,88,2,8,120};
		int Max = getMax(array);
		System.out.println("Maximimum value is"+Max);
		int Min = getMin(array);
		System.out.println("Minimum value is"+Min);		
	}
	public static int getMax(int[] inputarray)
	{
		int maxvalue= inputarray[0];
		for(int i=1; i < inputarray.length;i++) {
			if(inputarray[i] > maxvalue) {
				maxvalue=inputarray[i];
	}
		}
	return maxvalue;
	}
	public static int getMin(int[] inputarray) 
	{
		int minvalue = inputarray[0];
		for(int i=1;i < inputarray.length;i++)
		{
			if(inputarray[i] < minvalue)
			{
				minvalue=inputarray[i];
			}
				
			}
		return minvalue;
		}
	}
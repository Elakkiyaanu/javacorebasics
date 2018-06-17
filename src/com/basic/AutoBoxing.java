package com.basic;


public class AutoBoxing {
public static void main(String args[])
{
	Integer val=new Integer(10);
	val++;
	int k= val+20;
	System.out.println(k);

}

public static void getItem(int count,Car...car) {
	for(int i=0;i<car.length;i++)
	{
		System.out.println(car[i]);
	}
}}
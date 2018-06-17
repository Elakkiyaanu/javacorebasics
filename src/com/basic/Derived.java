package com.basic;

public class Derived extends Base{
	public Derived()
	{
	this("Examveda");
	System.out.print("Derived");
	}
	public Derived(String s)
	{
	System.out.print(s);
	}
	public static void main(String[] args)
	{
	new Derived();
	}
	}



package com.basic;

public class Taxi extends Car{
	int i=100;
	public Taxi(){
		System.out.println("Taxi cons empty");
}
	public Taxi(int i) {
		this();
		System.out.println("Taxi cons one args");
	}
@Override 
	public void brake()
	{
	super.brake();
		System.out.println("brake implemented");
		
	}
	
	public static void main(String[] args) {
		Taxi taxi=new Taxi(10);
		taxi.brake();
	
		
	}

}

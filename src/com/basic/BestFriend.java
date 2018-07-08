package com.basic;

public class BestFriend {
String name;
String age;
String degree;
String college;
String address;
 BestFriend(String name,String age,String degree,String college,String address)
{
	this.name=name;
	this.age=age;
	this.degree=degree;
	this.college=college;
	this.address=address;

}
 @Override
 public String toString(){

	return (name +","+age+","+degree+","+college+","+address);
			}

public static void main(String args[])
{
BestFriend bf=new BestFriend("Anu\n","20\n","CSE\n","KSRIET\n","Chennai\n");
System.out.println(bf);
System.out.println(bf.toString());
}
}


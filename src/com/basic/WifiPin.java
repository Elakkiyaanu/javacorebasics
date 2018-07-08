package com.basic;
	import java.util.*;
	public class WifiPin
	{ 
	public void createWifiPin(String name,int roomNo){
	  int n=roomNo,sum=0,sum1=0;
	  int tenth=n%100;
	  tenth/=10;
	  char name1[]=name.toCharArray();
	  int len=name.length();
	  while(n>0)
	  {
	    int r=n%10;
	    sum+=r;
	    n/=10;
	  }
	  if(sum>0)
	  {
	    while(sum>0)
	    {
	      int r=sum%10;
	      sum1+=r;
	      sum/=10;
	    }
	    sum=sum1;
	  }
	  if(sum%2!=0)
	  {
	    sum-=1;
	  }
	  String[] symbol={")","!","@","#","$","%","^","&","*","("};
	  System.out.println("PASSWORD IS ..........");
	  System.out.println(sum+symbol[sum]+name1[len-1]+tenth);
	}
	public static void main(String s[])
	{
	  WifiPin wp=new WifiPin();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("ENTER YOUR NAME.....");
	  String name=sc.next();
	  System.out.println("ENTER YOUR ROOM NUMBER.....");
	  int roomNo=sc.nextInt();
	  if((roomNo>100)&&(roomNo<1000))
	  {
	    wp.createWifiPin(name,roomNo);
	  }
	}
	}



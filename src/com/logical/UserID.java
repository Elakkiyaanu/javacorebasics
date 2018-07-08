package com.logical;

import java.util.*;

public class UserID{
    public static String findUserID(String first,String last,String pin,int n){
        String userID="";
        String big="";
        String small="";
        StringBuilder reversePin=new StringBuilder(pin);
   
           
   
   
        if((first.length()<last.length())&&(first.compareTo(last))<0){
            big=last;
            small=first;
        }
        else{
            small=last;
            big=first;
        }
       // System.out.println(big+ "  "+small);
        userID+=small.charAt(small.length()-1);
        userID+=big;
        userID+=pin.charAt(n-1);
        reversePin=reversePin.reverse();
        String pin1="";
        pin1+=reversePin;
        //pin+=reversePin;
        userID+=pin1.charAt(n-1);
        char[] ch=userID.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                if(Character.isUpperCase(ch[i])){
                    ch[i]=Character.toLowerCase(ch[i]);
                }
                else{
                    ch[i]=Character.toUpperCase(ch[i]);
                }
               
            }
        }
        String userID1="";
        for(int i=0;i<ch.length;i++){
            userID1+=ch[i];
        }
        return userID1;
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String last=sc.next();
        String pin=sc.next();
        int n=sc.nextInt();
        if((pin.length())>=n){
            System.out.println(findUserID(first,last,pin,n));
        }
        else{
        System.out.println("ERROR");
        }
       
    }
}
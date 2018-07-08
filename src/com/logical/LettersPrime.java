package com.logical;
import java.io.*;
class Letters 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        System.out.print("\nEnter some text : ");
         
        String str = br.readLine();
        System.out.println(str);
        System.out.print("\nEnter the letter to be searched : ");
        String ltr = br.readLine();
        System.out.println(ltr);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ltr.charAt(0))
                count++;
            else
                continue;
        }
        System.out.print("\nFrequency of the letter : "+count);
 
    }
}
package com.string;

public class StringToIntEx 
    {
      public static void main (String[] args)
      {
        String s = "420";
        try
        {
        	int number = Integer.parseInt(s.trim());
            System.out.println("number = " + number);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
      }
    }


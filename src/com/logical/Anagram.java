package com.logical;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {   
            String s1="guna bha";
            String s2="gunaabha";
          boolean a ;
            if (s1.length() != s2.length()) { 
               a = false; 
            } else { 
                char[] ArrayS1 = s1.toUpperCase().toCharArray(); 
                char[] ArrayS2 = s2.toUpperCase().toCharArray(); 
                Arrays.sort(ArrayS1); 
                Arrays.sort(ArrayS2); 
                a = Arrays.equals(ArrayS1, ArrayS2); 
            } 
            if (a) { 
                System.out.println(s1 + " and " + s2 + " are anagrams"); 
            } else { 
                System.out.println(s1 + " and " + s2 + " are not anagrams"); 
            } 
        
    }  }

       
          
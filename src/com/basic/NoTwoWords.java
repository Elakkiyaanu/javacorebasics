package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoTwoWords {
	

	    public static void main(String[] a)
	    {
	        int no = 0;
	        String[] words= new String[]{"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	        String[] word=new String[10];

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            no = Integer.parseInt(br.readLine());
	        } catch (NumberFormatException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        int i,j;
	        j=0;
	        while(no>0){
	            i = no%10;
	            no /= 10;
	            word[j] = words[i];
	            j++;
	        }
	        for(int k= word.length;k>0;k--)
	        {
	            System.out.println(word[k-1]+" ");
	        }
	    }
	}



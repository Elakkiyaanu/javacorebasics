package com.logical;
import java.util.Scanner;

public class EvenOdd {


        public static void main(String[] args) 

        {
           int count = 0;
            int n;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array:");

            n = s.nextInt();

            int a[] = new int[n];

            System.out.println("Enter all the elements:");

            for (int i = 0; i < n; i++) 

            {

                a[i] = s.nextInt();

            }

            System.out.print("Odd numbers:");

            for(int i = 0 ; i < n ; i++)

            {

                if(a[i] % 2 != 0)

                {

                    System.out.print(a[i]+" ");

                }
                count ++;

            }

          System.out.print("Even numbers:");

            for(int i = 0 ; i < n ; i++)

            {

                if(a[i] % 2 == 0)

                {

                    System.out.print(a[i]+" ");
                    
                } count ++; 

            }

        }

    }
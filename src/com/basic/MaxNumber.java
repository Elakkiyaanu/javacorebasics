package com.basic;

public class MaxNumber {
	

  
		public static void main(String args[]){
			
	          int a[]={-5,-34,-78,-2,-45,-1,-99,-23};
  
              int firstmax=0;
		 
		      int secondmax=0;
		   
		         for(int i=0;i<a.length;i++){
		    
			           if(firstmax>a[i]){
			              secondmax=firstmax;
			              firstmax=a[i];
			        }
			  
		 
		   } 
		      System.out.println(" The Firstmax"+firstmax);
		      System.out.println("The secondmax"+secondmax);
         
    }
	
}
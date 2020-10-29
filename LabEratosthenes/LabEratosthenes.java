package LabEratosthenes;

import java.util.Arrays;
import java.util.Scanner;



public class LabEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number greater than 1: ");
		int num = input.nextInt();
		boolean[] A = new boolean [num];
		
		for(int i = 2; i< A.length;i++) {
			
			A[i] = true;
			
		}
		
      for(int i = 2; i < Math.sqrt(num);i++){
      
         if(A[i]== true){
               
               for(int j = (i*i); j < num; j+=i){
                  
                  A[j] = false;
                  
               }
         
         }
      
      }
      int count = 0;
      
		  for(int i =2; i< A.length; i++){
            
            if(A[i]==true){
               
               System.out.printf("%-5d",i);
               count++;   
               
                if(count % 5 == 0){
               System.out.println();
                   } 
                    
            }
           
        }
		
    
	}

}

/* 
   Class: 1400
   Student: Qi Cao
   Fianl Exam code
*/

import java.util.*;
public class FinalExamApp{

   public static void main(String args[]){
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter 2 whole Numbers: ");
   int number1 = input.nextInt();
   int number2 = input.nextInt();
   
   FinalExam myFinal = new FinalExam(number1,number2);
   
   int myArray [][] = myFinal.createArray();
   
   for(int[] el: myArray){
      System.out.println(Arrays.toString(el));
   }
   
   int total = myFinal.calculateRows(myArray);
   
   System.out.printf("%nTotal: %d%n",total);
 
      
   }
}
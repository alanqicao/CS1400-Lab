

import java.util.Scanner;
public class LabWhile{
   
   public static void main(String[] args){
      
      multiplyNumbers();
   }//main
   public static void multiplyNumbers(){
      Scanner input = new Scanner(System.in);
      int product = 1;
      System.out.print("Enter a number (0 to quite): ");
      int number = input.nextInt();
      
      while(number!=0){
         
        product *= number;
        
        System.out.print("Enter a number (0 to quite): ");
        number = input.nextInt();
        
      }//while loop
      
      System.out.println("Product is: "+product);
   
   }//mutiply
}//class
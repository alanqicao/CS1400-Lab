import java.util.*;

public class GoldenRatio{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first number: ");
   
   int number1 = input.nextInt();
   System.out.print("Enter Secound number: ");
   int number2 = input.nextInt();
   
   
   System.out.printf("isGoldenTation(%d,%d): %b%n",
      number1, number2, isGoldenRatio(number1, number2)
   );
   }
      public static boolean isGoldenRatio(int num1, int num2){
         
         boolean result = false;
         
            double temp =0;
            if(num1>num2){
               temp =(double)num1 / num2;
               if((Math.round(temp*1000)/1000.0)== 1.618){
                  result = true;
                  
               
               }
            } else if (num2>num1){
               temp = (double)num2/num1;
               if((Math.round(temp *1000)/1000.0)== 1.618){
               result = true;
               
               }
               
            }else{
            
               result = false;
            }
         return result;
      }
   
   }

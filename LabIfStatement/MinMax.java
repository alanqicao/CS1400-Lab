import java.util.Scanner;
public class MinMax{
   
   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      System.out.println("Please enter two number");
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      
      
      if(number1<number2){
         System.out.println("number1: "+number1);
         System.out.println("number2: "+number2);
         System.out.printf("%d is less than %d",number1,number2);
      }else{
      
         System.out.println("number1: "+number1);
         System.out.println("number2: "+number2);
         System.out.printf("%d is greater than %d",number1,number2);
         
      }
   }


}
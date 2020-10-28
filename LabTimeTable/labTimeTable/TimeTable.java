package labTimeTable;
import java.util.Scanner;
public class TimeTable{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Number(1-10): ");
      
      int number =input.nextInt();
      
      System.out.print("Enter number of rows: ");
      
      int row = input.nextInt();
      
      System.out.println("Time Table:");
      
      for(int i=1; i <= row; i++){
         System.out.printf("%2d * %d = %d%n",i,number,i*number);
         
         
         
      
      }
      
      
      
      
      
   }

}
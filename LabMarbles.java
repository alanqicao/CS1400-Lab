  import java.util.Scanner;
  
   public class LabMarbles
   {
      public static void main(String[] args)
      
      {
         Scanner input = new Scanner(System.in);
        
         System.out.print("color: ");
         String color1 = input.next();
         System.out.printf("Number of %s marbles: ",color1);
         int number1 = input.nextInt();
         
         System.out.print("color: ");
         String color2 = input.next();
         System.out.printf("Number of %s marbles: ",color2);
         int number2 = input.nextInt();
         
         System.out.print("color: ");
         String color3 = input.next();
         System.out.printf("Number of %s marbles: ",color3);
         int number3 = input.nextInt();
         
         
         
         
         System.out.println("");
         System.out.println("Color           "+"Number of Marbles");
         System.out.println("---------       "+"----------------------");
         
         System.out.printf("%-12s",color1);
         System.out.printf("%10s\n",number1);
         
         System.out.printf("%-12s",color2);
         System.out.printf("%10s\n",number2);
         
         System.out.printf("%-12s",color3);
         System.out.printf("%10s\n",number3);
         
         
         
      
      }//Main

}//Class
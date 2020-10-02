/*****************************************
* Author : Qi CaO
* Date : 09/14/2020
* Assignment: A02 – Ski Tickets
******************************************/
  import java.util.Scanner;
  
   public class SkiTickets
   {
    public static void main(String[] args)
      {
      
      double adultTicketsCharge = 93;
      double youthTicketsCharge = 47;
    
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Number of adult tickets: ");
      int numberOfAdult = input.nextInt();
      
      System.out.print("Number of youth tickets: ");
      int numberOfYouth = input.nextInt();
      input.nextLine();
      System.out.print("");
      System.out.print("Name: ");
      
      String name = input.nextLine();
      
      System.out.printf("\n \n");
   
     
     double totalNOA=numberOfAdult*adultTicketsCharge;
     double totalNOY=numberOfYouth*youthTicketsCharge;
     
     
      System.out.printf("Invoice for %s: ",name);
      System.out.println("");
      System.out.printf("Adult tickets %-2d .. ",numberOfAdult);
      System.out.printf("$ %2.2f\n",totalNOA);
      
      System.out.printf("Youth tickets %-2d .. ",numberOfYouth);
      System.out.printf("$ %2.2f\n",totalNOY);
      
      System.out.println("------------------------------");
      String doller ="$";
      System.out.printf("%21s %.2f\n",doller,totalNOA+totalNOY);
      String doubleLine = "==========";
      System.out.printf("%30s\n",doubleLine);
      
      
      }//main
      
   }//class
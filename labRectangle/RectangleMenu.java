package labRectangle;

import java.util.Scanner;

public class RectangleMenu
{
   public static void main(String[] args)
   {
      Rectangle myRectangle = new Rectangle(4,5);
      Scanner input = new Scanner(System.in);
      int selection;
      
      do{
         menuPrompt();
         selection = input.nextInt();
         switch(selection){
         
            case 1: System.out.println(myRectangle.area());
            break;
            case 2: System.out.println(myRectangle.perimeter());
            break;
            case 3: System.out.println(myRectangle.getLength()+" "+ myRectangle.getWidth());
            break;
            case 0: System.out.println("Good bye");
            break;
            default:System.out.println("Please try again");
             
         }
         
      }while(selection !=0);
   }
   
   private static void menuPrompt()
   {
      System.out.println("1 .. area");
      System.out.println("2 .. perimeter");
      System.out.println("3 .. length and width");
      System.out.println("0 .. exit");
      System.out.println("Your choice: ");
   }
}
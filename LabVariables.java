import java.util.Scanner;

public class LabVariables
{
   public static void main(String[] args)
   {
     
   
    Scanner input = new Scanner(System.in);
      System.out.print("where is your favorite destination: ");
      
      String destination = input.nextLine();
      System.out.printf("Welcome to %s%n",destination);
      
       int kingsPeak = 4124;
       int timpanogos =3581;
       
      System.out.println(" ");

      
      System.out.printf("Elevation of Kings Peak: %d%n",kingsPeak);
      System.out.printf("Elevation of Timpanogos %d%n",timpanogos);
      
       
   }

}
   